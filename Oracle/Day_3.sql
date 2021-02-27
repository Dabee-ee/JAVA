-- Day 3 --

-- 숫자 데이터 함수

-- ABS() : 특정 숫자의 절댓값 표현
SELECT ABS(10), ABS(-10)
FROM DUAL;

-- MOD() : 자바에서의 '%', 나머지 값을 구하는 함수
SELECT MOD(10, 3), MOD(10, 2), MOD(10, 7)
FROM DUAL;

-- ROUND() :
--  반올림하는 함수
SELECT ROUND(123.456, 0),
       ROUND(123.456, 1), -- 소수점 첫째 자리 까지
       ROUND(123.456, 2), -- 소수점 둘째 자리 까지
       ROUND(123.456, -2)
FROM DUAL;

-- ceil() / floor(): 
-- 주어진 숫자를 각각 올림/버림하여 정수로 만드는 함수
SELECT CEIL(123.456), FLOOR(123.456)
FROM DUAL;

-- TRUNC() : 
--   지정한 위치에서 숫자를 버리는 함수
SELECT TRUNC(123.456, 0),
       TRUNC(123.456, 1),
       TRUNC(123.456, 2),
       TRUNC(123.456, -2)
FROM DUAL;

-- 실습 1 --
-- EMPLOYEE 에서
-- 입사한 달의 숫자가 홀수 달인 사원들의
-- 사번, 사원명, 입사일 정보를 조회 하시오.
-- hint : SUBSTR / MOD

SELECT EMP_ID, EMP_NAME, HIRE_DATE
FROM EMPLOYEE
WHERE MOD(SUBSTR(HIRE_DATE, 5, 1), 2) = 1;

------------------------------------------------

-- 날짜 데이터 함수

SELECT SYSTIMESTAMP, SYSDATE
FROM DUAL;

-- MONTHS_BETWEEN(최근 날짜, 예전 날짜) :
-- 두 날짜 사이의 개월 수
SELECT EMP_NAME 사원명,
       HIRE_DATE 입사일,
       TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)),
       TRUNC(TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) / 12)
FROM EMPLOYEE;

-- ADD_MONTHS(특정 날짜, 개월 수) :
-- 지정한 날짜로부터 몇 개월 뒤의 날짜인지 조회하는 함수
SELECT EMP_NAME,
       HIRE_DATE,
       ADD_MONTHS(HIRE_DATE, 6)
FROM EMPLOYEE;

-- NEXT_DAY(날짜, 요일명 | 요일 숫자 ) : 
-- 앞으로 다가올 가장 가까운 요일을 돌려주는 함수
-- 1:일요일 ~ 7:토요일
SELECT NEXT_DAY(SYSDATE, '금요일'),
       NEXT_DAY(SYSDATE, '금'),
       NEXT_DAY(SYSDATE, 6)
       -- NEXT_DAY(SYSDATE, 'SATURDAY') -- ERROR!!
FROM DUAL;

-- 현재 오라클에 설정된 기본 정보
-- 오라클은 기본적으로 운영체제의 설정을 따른다.

SELECT * FROM V$NLS_PARAMETERS;

-- 현재 계정의 설정 정보들을 담는 별도의 환경변수 
-- 테이블들이 따로 존재하는데, 
-- 이를 데이터 사전(데이터 딕셔너리)라고 한다.
-- 관계형 데이터 베이스에서는 모든 정보들을
-- 표(테이블) 형태로 관리하는데, 설정 정보 또한
-- 이러한 형식으로 관리한다.
-- 기본적으로 시스템의 관리자만 변경이 가능한데,
-- 사용자도 일회성으로 잠깐 로그인된 시간동안
-- 자신의 설정 정보를 변경할 수 있다.
-- 단, 재접속하면 초기화된다.

ALTER SESSION SET NLS_LANGUAGE = AMERICAN;

-- 영어 요일 동작 확인
SELECT NEXT_DAY(SYSDATE, 'SATURDAY')
FROM DUAL;

ALTER SESSION SET NLS_LANGUAGE = KOREAN;

-- LAST_DAY() : 
--  주어진 달의 마지막 일자를 조회
SELECT LAST_DAY(SYSDATE)
FROM DUAL;

-- EXTRACT : 지정한 날짜 데이터로부터 연, 월, 일을 각각 추출하는 함수
SELECT EXTRACT(YEAR FROM HIRE_DATE),
       EXTRACT(MONTH FROM HIRE_DATE),
       EXTRACT(DAY FROM HIRE_DATE)
FROM EMPLOYEE;

-- 날짜끼리 사칙연산이 가능하다!
-- 최근 날짜가 더 큰 값이라고 판단한다.
-- 2/24 - 2/20 = 4
SELECT (SYSDATE - 10) "날짜확인1",
       TRUNC(SYSDATE - TO_DATE('21/02/01','RR/MM/DD')) "날짜확인2",
       TRUNC(TO_DATE('21/02/01', 'RR/MM/DD') - SYSDATE) "날짜확인3"
FROM DUAL;

-- 실습 2 --
-- EMPLOYEE 테이블에서
-- 근무 년수가 20년 이상인 사원들의
-- 사번, 사원명, 부서코드, 입사일 정보를
-- 조회하시오.
-- MONTHS_BETWEEN() OR ADD_MONTHS()

SELECT EMP_ID 사번,
       EMP_NAME 사원명,
       DEPT_CODE 부서코드,
       HIRE_DATE 입사일
FROM EMPLOYEE
--WHERE MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12 >= 20;
WHERE ADD_MONTHS(HIRE_DATE, 240) <= SYSDATE;


--------------------------------------------------
-- 형변환 함수 --

-- TO_NUMBER()

-- DB에서는 숫자로만 이루어진 문자는 
-- 자동으로 TO_NUMBER() 함수를 통해 숫자로 바뀐다.
SELECT '123' + '456'
FROM DUAL;

SELECT TO_NUMBER('123') + TO_NUMBER('456')
FROM DUAL;

-- 숫자와 문자열을 연산하면 에러가 발생한다.
SELECT '123' + '456ABC'
FROM DUAL;

-- TO_CHAR()
-- 문자열이 아닌 데이터를 문자열로 바꿔주는 함수

-- 숫자일 경우 형식 변환
-- 9 : 자릿수 지정 후, 만약 칸이 남으면 표시하지 않겠다.
-- 0 : 자릿수 지정 후, 만약 칸이 남으면 0으로 표시하겠다.
-- L : 통화 기호를 붙인다. (원(￦) 기호)

-- 표현하려는 숫자의 자릿수를 충분히 선언하지 않으면
-- 값을 제대로 보여주지 않는다.
SELECT TO_CHAR(SALARY, 'L999,999,999'),
       TO_CHAR(SALARY, '000,000,000'),
       TO_CHAR(SALARY, 'L999,999'),   -- 표현 오류!
       TO_CHAR(SALARY, '000,000')      -- 표현 오류!
FROM EMPLOYEE;

-- 시간일 경우 형식 변환
SELECT TO_CHAR(SYSDATE, 'AM HH24:MI:SS'),
       TO_CHAR(SYSDATE, 'PM HH:MI:SS')
FROM DUAL;

/* System.out.printf("%d, %.2f, %s", sdf, sdf, sdf); */

-- 날짜일 경우 형식 변환

SELECT TO_CHAR(SYSDATE, 'MON DY, YYYY'),
       TO_CHAR(SYSDATE, 'YYYY-fmMM-DD DAY'),
       TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY'),
       TO_CHAR(SYSDATE, 'YEAR, Q"분기"'),
       TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일"')
FROM DUAL;

-- TO_DATE()

SELECT TO_DATE(20210224, 'yyyymmdd'),
       TO_DATE('2021/02/24', 'YYYY/MM/DD')
FROM DUAL;

-- YY/RR
-- 연도를 2자리로 적었을 때, DB에서는 표기가 YY / RR 이냐에 따라
-- 다른 4자리의 연도 값을 갖게 된다.
-- YY 는 현 세기 ( 100년 )
-- RR 은 반 세기 ( 50년 )

SELECT TO_CHAR(TO_DATE('210224', 'YYMMDD'), 'YYYY') "결과1",
       TO_CHAR(TO_DATE('210224', 'RRMMDD'), 'RRRR') "결과2",
       TO_CHAR(TO_DATE('800224', 'YYMMDD'), 'YYYY') "결과3",
       TO_CHAR(TO_DATE('800224', 'RRMMDD'), 'RRRR') "결과4"
FROM DUAL;

-----------------------------------------------------------------

-- 선택함수 --

-- DECODE()
-- Java 의 삼항연산자
-- DECODE( 컬럼명 | 값 , 비교값1, 결과1[, 비교값2, 결과2 . . . ], 기본값)

-- 현재 회사에서 근무하는 직원들의 성별을 남, 여로 구분짓기

SELECT EMP_NAME 사원명,
       EMP_NO 주민번호,
       DECODE(SUBSTR(EMP_NO, 8, 1), 1, '남', 2, '여', '무') 성별
FROM EMPLOYEE;

-- CASE 문 (SWITCH / IF )

-- [사용형식]
-- CASE
--     WHEN (조건식1) THEN 결과값1
--     WHEN (조건식2) THEN 결과값2 
--     ELSE 결과값3
-- END

-- EMPLOYEE의 ENT_YN은 퇴사 여부를 확인하는
-- 컬럼이다. 컬럼값이 'Y'이면 '퇴사자',
-- 'N'이면 '근무자'로 구별하여, 사원의
-- 사번, 사원명, 직급코드, 근무여부를 조회하기

SELECT EMP_ID,
       EMP_NAME,
       JOB_CODE,
       CASE
          WHEN ENT_YN = 'Y' THEN '퇴사자'
          ELSE '근무자'
       END "근무여부"
FROM EMPLOYEE;

-- NVL2()
-- NVL2(컬럼명 | 값, NULL이 아닐 경우 값, NULL일 경우 값)

SELECT EMP_NAME,
       BONUS,
       NVL(TO_CHAR(BONUS), 'X') "NVL",
       NVL2(BONUS, TO_CHAR(BONUS, '0.00'), 'X') "NVL2"
FROM EMPLOYEE;

-- 실습 문제 3 --
-- 오늘은 연봉협상의 날입니다.
-- 다음에 해당하는 사원들의 급여를 인상하고자 하는데,
-- 직급코드가 'J5'인 직원들은 급여의 15%를,
-- 직급코드가 'J6'인 직원들은 급여의 10%를,
-- 직급코드가 'J7'인 직원들은 급여의 5%를,
-- 그 외 나머지 직원들은 급여의 1%를 인상한다고 할 때
 DECODE(SUBSTR(JOB_CODE), J5, SALARY * 0.15, J6, '여', '무') 성별

-- EMPLOYEE 테이블에서 
-- 해당 조건을 만족하는 직원들의
-- 사번, 사원명, 직급코드, 현재급여, 인상될급여를
-- 조회하여 미리 확인해보세요!
-- DECODE / CASE 각각 사용!!

-- DECODE --
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY,
       SALARY * DECODE(JOB_CODE,
                       'J5', 1.15, 
                       'J6', 1.1, 
                       'J7', 1.05, 
                       1.01) "인상 급여"
FROM EMPLOYEE;

-- CASE --
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY,
      SALARY * CASE
                    WHEN JOB_CODE = 'J7' THEN 1.05
                    WHEN JOB_CODE = 'J6' THEN 1.1
                    WHEN JOB_CODE = 'J5' THEN 1.15
                    ELSE 1.01
               END "인상 급여"
FROM EMPLOYEE;

----------------------------------------------------
-- 그룹함수

SELECT SUM(SALARY), MAX(SALARY), MIN(SALARY), TRUNC(AVG(SALARY),6), COUNT(SALARY)
FROM EMPLOYEE;

SELECT  ROUND(SALARY), SUM(SALARY)
FROM EMPLOYEE;

-- 실습4 : COUNT() --
SELECT JOB_CODE, COUNT(BONUS) || '명
FORM EMPLOYEE
GROUP BT JOB_CODE
ORDER BY 1 DESC ;

SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY), MIN(SALARY),  












