-- 연산자 --
/*

<< 우선 순위 >>

0. ()
1. 산술 연산자 ( +, -, *, / )
2. 연결 연산자( || ) : 문자열 두 개를 하나로 합칠 때 사용한다
   -- "Hello" + "World"  ->  'Hello' || 'World'
3. 비교 연산자
     >, <, >=, <=  
     =, != ( <>, ^= )
4. IS NULL / IS NOT NULL / LIKE / IN / NOT IN
5. BETWEEN A AND B 
   // SALARY BETWEEN 300 AND 500 
      (300 <= SALARY <= 500)
6. NOT
7. AND
8. OR

*/

-- 연결 연산자
/*
   여러 컬럼의 결과를 하나의 문자열로 묶을 때 사용하는 연산자
*/
-- 00 사번을 가진 사원은 OOO입니다.

SELECT EMP_ID || '사번을 가진 사원은 ' || EMP_NAME || '입니다'
FROM EMPLOYEE;

-- 데이터 형식 변환
-- 사번 / 사원명 / 연락처
SELECT EMP_ID || ' / ' || EMP_NAME || ' / ' || PHONE
FROM EMPLOYEE;

-- 비교 연산자
/*
  <, >, <=, >= : 부등호 연산
  = : 동등 기호 (같다)
  !=, <>, ^= : 부정 기호(같지 않다)
*/

-- 실습 1
-- EMPLOYEE 테이블에서
-- 급여가 350 만원 이상 550만원 이하인
-- 직원들의 사번, 사원명, 부서코드, 직급코드, 급여를 조회 하시오.
-- 단, 조회 시 각 컬럼에 별칭 부여하기

-- 1 )
SELECT EMP_ID "사번", 
       EMP_NAME "사원명", 
       DEPT_CODE "부서코드", 
       JOB_CODE "직급코드", 
       SALARY "급여"
FROM EMPLOYEE
WHERE SALARY >= 3500000
  AND SALARY <= 5500000;

-- 2 )
SELECT EMP_ID "사번",
       EMP_NAME "사원명",
       DEPT_CODE "부서코드",
       JOB_CODE "직급코드",
       SALARY "급여"
FROM EMPLOYEE
WHERE SALARY BETWEEN 3500000 AND 5500000;

-- 실습 2
-- 이번엔 350만원 미만, 550만원 초과인
-- 급여를 받는 직원들의 사번, 사원명, 부서코드, 직급코드, 급여를
-- 조회 하시오.

SELECT EMP_ID "사번", 
       EMP_NAME "사원명", 
       DEPT_CODE "부서코드", 
       JOB_CODE "직급코드", 
       SALARY "급여"
FROM EMPLOYEE
WHERE SALARY < 3500000
  OR SALARY > 5500000;

SELECT EMP_ID "사번",
       EMP_NAME "사원명",
       DEPT_CODE "부서코드",
       JOB_CODE "직급코드",
       SALARY "급여"
FROM EMPLOYEE
WHERE SALARY NOT BETWEEN 3500000 AND 5500000;

------------------------------------------------------

-- 심화 문제 1
-- '해외영업1부' 에서 근무하는 직원들의 
-- 직원명, 이메일, 연락처 정보를 조회 하시오.

-- 1 > SELECT * FROM 테이블명
--  원하는 정보가 담긴 테이블 확인하기
SELECT * FROM DEPARTMENT;

-- 2 > 원하는 정보를 찾아 다른 테이블 조회하기
SELECT * FROM EMPLOYEE;

-- 3 > 찾은 정보를 하나로 합쳐 조회하기
SELECT EMP_NAME "직원명",
        EMAIL "이메일",
        PHONE "연락처"
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

-- LIKE
-- 입력한 숫자, 문자가 포함된 
-- 정보를 조회할 때 사용하는 연산자

-- 와일드카드
--  어디든 넣을 수 있는 특수문자
-- '_' : 아무 문자나 한 문자를 대신    --> '_ _ 왕 _'
-- '%' : 몇자리 문자든 상관없이 대신   --> '% 왕 %'

-- EMPLOYEE 테이블에서
-- 사원 이름 중 가운데 '중' 자가
-- 들어가는 사원의 정보 조회하기

SELECT * FROM EMPLOYEE
WHERE EMP_NAME LIKE '_중_';

-- EMPLOYEE 테이블에서
-- 주민등록 상 성별이 남성인 사원의
-- 사번, 이름, 연락처를 조회 하시오.
-- 주민등록번호 : 000000-1234567
--                      ^

SELECT EMP_NAME, EMP_ID, PHONE
FROM EMPLOYEE
WHERE EMP_NO LIKE '%-1%'
   OR EMP_NO LIKE '______-3%';

-- 사원 중 이메일의 아이디 글자가
-- 5글자를 초과하는 사원의
-- 사번, 사원명, 이메일 정보를 조회 하시오
-- oooooo@example.com

SELECT EMP_ID, EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '______%@%';

-- ESCAPE 선언
-- 만약 와일드 특수문자를 일반 문자로 사용하고 싶다면
-- ESCAPE 문자를 선언하면 된다.

-- 사원 이메일 중 4번째 글자가 '_' 기호인
-- 사원들의 정보 조회하기

SELECT *
FROM EMPLOYEE
WHERE EMAIL LIKE '____%' ESCAPE '#';

-- IS NULL 과 IS NOT NULL 연산자

SELECT EMP_ID, EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE BONUS IS NULL;

SELECT EMP_ID, EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
WHERE BONUS IS NOT NULL;

-- 실습 3
-- 어제 EMPLOYEE 회사에 직원 중의 한 명이
-- 사내 정보를 빼돌리려 했다.
-- 이 사원의 정보 중 유일하게 알고 있는 정보는
-- '이'씨 성을 가졌고 소속부서가 없었다는 것이다.
-- EMPLOYEE 테이블의 정보 중 '이'씨 성을 가진 
-- 사원들의 사원번호, 사원명, 이메일, 연락처 정보를
-- 조회하여 용의자 명단을 만드시오.

SELECT EMP_ID "사원번호",
       EMP_NAME "사원명",
       EMAIL "이메일",
       PHONE "연락처"
FROM EMPLOYEE
WHERE EMP_NAME LIKE '이%'
   AND DEPT_CODE IS NULL;

-- IN / NOT IN --
/*
  IN (값1, 값2, 값3 . . . )
  안에 있는 값 중 어느 하나라도 속한다면 조회해라
  
  NOT IN (값1, 값2, 값3 . . . )
  이 중 단 하나라도 속하지 않는다면 조회해라
  
  ** 만약 비교하는 테이블 데이터 중 null이 존재한다면
    IN / NOT IN 결과에 포함되지 않는다.
*/

-- 부서코드가 'D1' 이거나 'D6'인 부서의
-- 사원 정보를 모두 조회 하시오.

SELECT * 
FROM EMPLOYEE
WHERE DEPT_CODE = 'D1'
   OR DEPT_CODE = 'D6';

SELECT * 
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D1', 'D6');


-- 산술 연산자
-- 컬럼 값을 사용하여 계산식을 만드는 연산자

-- SALARY * 12  >> 연봉
-- 모든 사원의 사원명, 급여, 연봉 조회하기

SELECT EMP_NAME "사원명",
       SALARY "급여",
       SALARY * 12 "연봉"
FROM EMPLOYEE;

-- 위의 정보에 포함하여
-- 모든 사원들의 연봉과 보너스를 합한 연봉을 조회하시오.
-- ** (급여 * ( 1 + 보너스 )) * 12


SELECT EMP_NAME "사원명",
       SALARY "급여",
       SALARY * 12 "연봉",
       (SALARY * ( 1 + BONUS ) ) * 12 "보너스 포함 연봉"
FROM EMPLOYEE;

-- NVL() : 현재 조회한 값이 null일 경우
--         특정 값으로 변경해주는 함수

-- [사용형식]
-- NVL(컬럼명, 바꿀 값)

SELECT EMP_NAME,
        SALARY,
        NVL(BONUS, 0)
FROM EMPLOYEE;

----------------------

SELECT EMP_NAME "사원명",
       SALARY "급여",
       SALARY * 12 "연봉",
       SALARY * ( 1 + NVL(BONUS, 0)) * 12 "보너스 포함 연봉"
FROM EMPLOYEE;

-- 리터럴 (Literal) : 값 존재 그 자체
--  컬럼 값에 특정 숫자나 문자를 합칠 때,
--  계산에 활용하거나 값을 특정 형식으로 표현할 목적으로 쓰인다.

SELECT EMP_ID, EMP_NAME, SALARY, '원' "단위"
FROM EMPLOYEE;


-- DISTINCT
--   만약에 컬럼에 해당하는 중복 값이 여러 개면
--   그 중 하나 만을 보여주는 예약어

SELECT DISTINCT JOB_CODE
FROM EMPLOYEE;

-----------------------------------------------------
-- Day 2 종합 실습 --

-- 종합 실습 1 --
-- EMPLOYEE 테이블에서 사원 번호가 205번인
-- 사원의 사원명, 이메일, 급여, 입사일자를
-- 조회 하시오.
-- (단, 조회하는 컬럼명에 별칭 부여)
SELECT EMP_NAME "사원명", 
       EMAIL "이메일", 
       SALARY "급여", 
       HIRE_DATE "입사일"
FROM EMPLOYEE
WHERE EMP_ID = 205;


-- 종합 실습 2 --
-- EMPLOYEE 테이블에서 부서가 D6이거나 D9인
-- 사원들의 사원명, 입사일, 연락처를
-- 조회 하시오.
-- (단, 조회하는 컬럼명에 별칭 부여, 비교 연산자 | IN 연산자 사용)
SELECT EMP_NAME "사원명", 
       HIRE_DATE "입사일",
       PHONE "연락처" 
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D6' , 'D9');


-- 종합 실습 3 --
-- DEPARTMENT 테이블을 참조하여, 
-- 부서가 '해외영업2부'인 부서의 부서코드를 찾고,
-- EMPLOYEE 테이블에서 해당 부서의
-- 사원들 중 급여를 200만원보다 많이 받는 직원의
-- 사번, 사원명, 급여를 조회하시오.

-- 1) '해외영업2부' 부서의 부서코드 찾기
SELECT * FROM DEPARTMENT
WHERE DEPT_TITLE = '해외영업2부';

-- 2) 조회한 부서 코드를 사용하여 
--    사원들 중 급여를 200만원보다 많이 받는 직원 조회하기
SELECT EMP_ID "사번",
       EMP_NAME "사원명",
       SALARY "급여"
FROM EMPLOYEE
WHERE SALARY > 2000000 AND DEPT_CODE = 'D6';


-- 종합 실습 4 --
-- 실습 3을 참고하여
-- 부서가 '해외영업2부'이거나
-- 급여를 200만원보다 많이 받는 직원의
-- 사번, 사원명, 급여를 조회 하시오.
SELECT EMP_ID "사번",
       EMP_NAME "사원명",
       SALARY "급여"
FROM EMPLOYEE
WHERE SALARY > 2000000 OR DEPT_CODE = 'D6';


-- 종합 실습 5-1 --
--  직급이 'J2'이면서 200만원 이상 받는 직원 이거나,
--  직급이 'J7' 인 사원의 사번, 사원명, 직급코드, 급여
--  정보 조회하기 ( 결과셋은 6명 나옵니다. )
SELECT EMP_ID "사번",
       EMP_NAME "사원명",
       JOB_CODE "직급코드",
       SALARY "급여"
FROM EMPLOYEE
WHERE JOB_CODE = 'J2' AND SALARY >= 2000000 OR JOB_CODE = 'J7';

-- 종합 실습 5-2 --
--  직급이 'J7' 이거나 'J2'이면서, 급여를 200만원 이상
--  받는 직원의 사번, 사원명, 직급코드, 급여, 연봉을
--  조회하기. ( 결과셋은 4명 나옵니다. )
SELECT EMP_ID "사번",
       EMP_NAME "사원명",
       JOB_CODE "직급코드",
       SALARY "급여",
       SALARY * 12 "연봉"
FROM EMPLOYEE
WHERE (JOB_CODE = 'J7' OR JOB_CODE = 'J2') AND SALARY >= 2000000;

--------------------------------------------------------------------

-- Ctrl + Enter ( 한 쿼리 실행 )
-- F5 파일 전체 실행
--  ** 쿼리 : ';'으로 끝나는 명령 한 문장
--     스크립트 : 명령어로 이루어진 문장들

-- CRUD : 데이터의 기본 조작 처리 언어
--------------------------- DML --------
-- CREATE : 데이터 추가 : INSERT
-- READ   : 데이터 조회 : SELECT
-- UPDATE : 데이터 수정 : UPDATE
-- DELETE : 데이터 삭제 : DELETE
----------------------------------------

-- ORDER BY
--  특정 컬럼의 값을 기준으로 정렬할 때 사용하는 구문
-- [사용 형식]
-- SELECT 컬럼명
-- FROM 테이블명
-- WHERE 조건식
-- ORDER BY 컬럼명 [ASC | DESC | NULLS FIRST | NULLS LAST],컬럼명2, . . . 

SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
ORDER BY SALARY, EMP_ID;

SELECT EMP_NAME, DEPT_CODE
FROM EMPLOYEE
ORDER BY DEPT_CODE NULLS FIRST;


--- FUNCTION ---
-- 단일 행 함수 (Single row Function)
-- 한 행 한 행마다 각각의 결과를
-- 도출하여 값을 돌려주는 함수

-- 문자 관련 함수
-- LENGTH / LENGTHB

-- LENGTH : 글자 개수
-- LENGTHB : 글자에 해당하는 바이트 수
-- 오라클은 영어 이외의 다른 언어는 모두 2Byte이다.
-- 단, XE 10g 버전 이후부터는 XE버전은 3byte로 읽는다.

SELECT LENGTH('Hello'), LENGTHB('Hello'),
       LENGTH('안녕하세요'), LENGTHB('안녕하세요')
FROM DUAL;

-- * Dual : 데이터를 출력하기 위한 가상의 테이블(임시 테이블)

-- INSTR : 주어진 값에서 원하는 문자가
--         몇번째에 있는지 찾아주는 함수
--  INSTR( 원문 , 찾는 문자 ) ---> 순번
-- one based index
SELECT INSTR('ABCDE', 'A'),  -- 1
       INSTR('ABCDE', 'C'),  -- 3
       INSTR('ABCDE', 'Z')   -- 0
FROM DUAL;


-- SUBSTR : 주어진 문자열에서 특정 값을 꺼내오는 함수
-- SUBSTR(컬럼명 | 문자, 시작번호[, 가져올 개수]); 

SELECT 'Hello World',
        SUBSTR('Hello World', 1, 5),
        SUBSTR('Hello World', 7)
FROM DUAL;

-- 함수 실습 1 --
-- 신입사원이 입사하여 회사 이메일을
-- 만들어 주고자 한다. 기존의 선배들이 쓰고 있는
-- 이메일 아이디 명단을 뽑아서 거기에 중복되지 않는
-- 아이디를 짓고자 할 때 사용할 수 있는
-- 정보를 조회 하시오.
-- 사원명, 이메일(@앞까지의 아이디만) 조회하는
-- SELECT 구문을 작성하시오.
-- 조회 결과 --
-- 홍길동    hong_GD
-- INSTR / SUBSTR

-- 1. 이름과 이메일 찾기
SELECT EMP_NAME, EMAIL
FROM EMPLOYEE;

-- 2. 이메일에서 @ 위치 찾기
SELECT INSTR(EMAIL, '@')
FROM EMPLOYEE;

-- 3. SUBSTR 과 INSTR를 활용하여
--    아이디만 꺼내오기
SELECT EMP_NAME, SUBSTR(EMAIL, 1, INSTR(EMAIL, '@') -1 )
FROM EMPLOYEE;

-- LTRIM / RTRIM : 현재 부여된 컬럼 값이나, 특정 문자열에서
--                 지정한 문자를 잘라주는 함수
SELECT LTRIM('     Hello'),
       RTRIM('Hello     ')
FROM DUAL;

SELECT LTRIM('012345', '0'),
       LTRIM('111234', '1'),
       LTRIM('12345', '5')
FROM DUAL;

-- TRIM :
SELECT TRIM('      HelloWorld!      ')
FROM DUAL;

-- LEADING(좌측만) / TRAILING(우측만) / BOTH
SELECT TRIM(LEADING '0' FROM '0012300'), -- Like LTRIM
       TRIM(TRAILING '0' FROM '0012300'), -- Like RTRIM
       TRIM(BOTH '0' FROM '0012300')      -- 기본값(default)
FROM DUAL;


-- LPAD / RPAD :
--  주어진 문자열들의 간격을 맞추기 위해 사용
SELECT RPAD(EMAIL, 20, '-'),
       LPAD(EMAIL, 20, '^')
FROM EMPLOYEE;


-- UPPER / LOWER / INITCAP :
SELECT LOWER('NICE TO MEET YOU'),
       UPPER('how old are you'),
       INITCAP('how much is it')
FROM DUAL;


-- CONCAT : 대부분의 데이터 베이스가 가지고 있음
--  오라클의 경우 CONCAT('A' , 'B') 두 문장을 합치는 것밖에 못한다.
--   CONCAT('A' , 'B', 'C' ) (X)
--   CONCAT( 'A' , CONCAT('B' , 'C')) (O) 중첩 사용 가능
SELECT CONCAT('제 인생 언어는 ', 'SQL이에요!!')
FROM DUAL;


-- 연결 연산자 : 사용 잘 안함, 다른 데이터 베이스에서 인식하지 못할 수도 있다.
SELECT '제 인생 언어는 ' || 'SQL이에요!!'
FROM DUAL;


-- REPLACE : 주어진 문자열을 지정한 문자열로 변경하는 함수
SELECT REPLACE('HELLO WORLD', 'HELLO', 'GOODBYE')
FROM DUAL;


-- 함수 실습 2 --
-- EMPLOYEE 테이블에서 
-- 사원의 입사년도, 입사월, 입사일을
-- 각각 쪼개어 조회하시오.
-- 결과 예시 --
-- 홍길동   21년   02월   23일
-- *Hint 1 : 날짜 데이터도 문자열로 취급할 수 있다.
-- *Hint 2 : 사용할 함수는 CONCAT, SUBSTR이면 된다.

SELECT
     EMP_NAME "이름", HIRE_DATE,
     CONCAT(SUBSTR(HIRE_DATE, 1, 2), '년') "입사년도",
     CONCAT(SUBSTR(HIRE_DATE, 4, 2), '월') "입사월",
     CONCAT(SUBSTR(HIRE_DATE, 7, 2), '일') "입사일"
FROM EMPLOYEE;








