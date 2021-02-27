-- Day 4 --

-- SELECT 구문 순서
-- 5: SELECT 컬럼명 AS "별칭"
-- 1: FROM 테이블명 별칭
-- 2: [WHERE 조건식]              : 단일행 함수 사용 가능
-- 3: [GROUP BY 컬럼명 | 계산식]  :  ROLLUP, CUBE 사용 가능
-- 4: [HAVING 그룹들 조건]        : 그룹 함수들 사용 가능
-- 6: [ORDER BY 컬럼명 | 순서 | 별칭 [ASC(기본값)|DESC]
--            NULLS FIRST | LAST]

-- SET OPERATOR 
-- UNION / UNION ALL : 합집합 
--   두 개 이상의 SELECT 결과 셋을 한 줄로 합치는 명령어
-- MINUS : 차집합
-- A SELECT와 B SELECT를 연결한다 했을 때
-- A에서 B의 결과를 뺀 나머지를 구하는 명령어
-- INTERSECT : 교집합
-- 두 개 이상의 SELECT 결과들의 공통점만 구하는 명령어

-- JOIN --
-- 두 개 이상의 테이블을 합하여 DB의 통합된 결과를 산출하는 문법
-- 단, 두 테이블 간의 공통된 값을 가지는 컬럼을 사용해야 하며,
-- 만약 동일한 컬럼명이 아닐 경우 같은 값을 지닌 컬럼으로 조건을
-- 명시해야 한다.


-- 만약 EMPLOYEE의 테이블에 존재하는 직급 코드가
-- 실제로는 어떤 직급인지 알고 싶다면....?

SELECT EMP_ID, EMP_NAME, JOB_CODE
FROM EMPLOYEE;

SELECT *
FROM JOB;

--------------------------------


SELECT EMP_ID, EMP_NAME, JOB_NAME
FROM EMPLOYEE, JOB
WHERE EMPLOYEE.JOB_CODE = JOB.JOB_CODE;

-- 오라클 전용 문법 / ANSI 표준 문법 -- 

-- 1. 오라클 전용 문법

-- ORA-00918: column ambiguously defined
-- JOIN할 때 종종 볼 수 있는 오류
-- 컬럼이 애매모호하게 선언되었다는 의미
-- JOB_CODE는 EMPLOYEE와 JOB 테이블이 모두 가지고 있는 컬럼이므로
-- 어떤 테이블의 JOB_CODE를 말하는 것인지 모르겠다는 의미
-- 따라서 테이블을 명시해주면 해결된다.

-- SELECT EMP_NAME, JOB_CODE, JOB_NAME
-- 두 테이블의 컬럼명이 동일한 경우
SELECT EMP_NAME, E.JOB_CODE, JOB_NAME
FROM EMPLOYEE E, JOB J
WHERE E.JOB_CODE = J.JOB_CODE;

-- 두 테이블의 컬럼명이 다른 경우
SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;
-- EMPLOYEE . DEPT_CODE = DEPARTMENT . DEPT _ ID
-- 내용은 같으나 컬럼명이 다르다

SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID;
-- 위에서는 컬럼명이 중복되어서 어떤 테이블인지 명시해줬어야 했는데
-- 컬럼명이 중복되지 않으면 그럴 필요가 없다.

-- 오라클 전용 문법 재정리
-- FROM 구문에 ',' 기호를 붙여 합칠 테이블을 나열한 뒤
-- WHERE 조건을 통해 두 테이블 간의 공통점을 엮어
-- 하나의 결과 집합을 만드는 방식



-- ANSI 표준 --
-- SQL 국제표준으로 어떤 RDBMS 든 대부분이 사용 가능한 문법
-- FROM 다음에 JOIN 테이블명 USING() | ON() 함수와 함께
-- 사용하여 결과 집합을 만드는 방법

-- 조인하려는 컬럼이 동일할 경우
SELECT EMP_NAME, JOB_CODE, JOB_NAME
FROM EMPLOYEE
JOIN JOB USING(JOB_CODE);

-- 조인하려는 컬럼이 동일하지 않을 경우
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);


-- 실습 1 --
-- EMPLOYEE 테이블과 SAL_GRADE 테이블 정보를 확인하여
-- 사번, 사원명, 급여 등급, 등급 기준 최소 급여와 최대 급여
-- 정보를 조회 하시오.
-- Hint : 연결하고자 하는 테이블의 정보를 먼저 조회하기

SELECT * FROM EMPLOYEE;
SELECT * FROM SAL_GRADE;

-- 오라클 버전
SELECT EMP_ID, EMP_NAME, E.SAL_LEVEL, MIN_SAL, MAX_SAL
FROM EMPLOYEE E, SAL_GRADE G
WHERE  E.SAL_LEVEL = G.SAL_LEVEL;

-- ANSI 버전
SELECT EMP_ID, EMP_NAME, SAL_LEVEL, MIN_SAL, MAX_SAL
FROM EMPLOYEE
JOIN SAL_GRADE USING(SAL_LEVEL);


-- 실습 2 --
-- DEPARTMENT 테이블에서 위치 정보를 가져와
-- LOCATION 테이블의 정보를 조인하여
-- 각 부서 별 근무지 위치를 조회 하시오.
-- 부서코드, 부서명, 근무지 코드, 근무지 위치

SELECT * FROM DEPARTMENT;
SELECT * FROM LOCATION;

-- 오라클 버전
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, LOCAL_NAME
FROM DEPARTMENT, LOCATION
WHERE  LOCATION_ID = LOCAL_CODE;

-- ANSI 버전
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, LOCAL_NAME
FROM DEPARTMENT
JOIN LOCATION ON (LOCATION_ID = LOCAL_CODE);




-- INNER JOIN / OUTER JOIN --

-- INNER JOIN --
-- 

SELECT *
FROM DEPARTMENT
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE);


SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE E, DEPARTMENT D
WHERE E.DEPT_CODE = D.DEPT_ID
ORDER BY DEPT_CODE;

-- LEFT OUTER JOIN -- 오라클 버전

SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE E, DEPARTMENT D
WHERE E.DEPT_CODE = D.DEPT_ID (+)
ORDER BY DEPT_CODE NULLS FIRST;

-- OUTER JOIN :
--  두 테이블이 서로 가지지 않은 정보까지
--  포함하여 합치는 방법
-- LEFT [OUTER] JOIN : 왼쪽의 FROM 원본 테이블의 정보를
--                     모두 포함하여 합치겠다.
-- RIGHT [OUTER] JOIN : 오른쪽의 혹은 JOIN에 명시된 테이블 정보를
--                      모두 포함하여 합치겠다.
-- FULL [OUTER] JOIN : 양측 모두의 정보를 화면에 표현하겠다.

-- LEFT OUTER JOIN 
-- ORACLE --
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE E, DEPARTMENT D
WHERE E.DEPT_CODE = D.DEPT_ID(+)
ORDER BY DEPT_CODE NULLS FIRST;

-- ANSI --
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

------------------------------------------------------------

-- RIGHT OUTER JOIN
-- ORACLE --
SELECT EMP_NAME, DEPT_CODE, DEPT_ID, DEPT_TITLE
FROM EMPLOYEE E, DEPARTMENT D
WHERE DEPT_CODE(+) = DEPT_ID;

-- ANSI --
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
RIGHT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

-------------------------------------------------------------

-- FULL OUTER JOIN

-- ANSI --
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
FULL JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);


-- ORACLE -- FULL OUTER JOIN 을 지원하지 않는다. ;-b
SELECT EMP_NAME, DEPT_CODE, DEPT_ID, DEPT_TITLE
FROM EMPLOYEE E, DEPARTMENT D
WHERE DEPT_CODE(+) = DEPT_ID(+);

-- SET을 사용하면 가능하다!
SELECT EMP_NAME, DEPT_CODE, DEPT_ID, DEPT_TITLE
FROM EMPLOYEE E, DEPARTMENT D
WHERE DEPT_CODE = DEPT_ID(+)
UNION
SELECT EMP_NAME, DEPT_CODE, DEPT_ID, DEPT_TITLE
FROM EMPLOYEE E, DEPARTMENT D
WHERE DEPT_CODE(+) = DEPT_ID;

-------------------------------------------------------
-- NATURAL JOIN
-- 컬럼명이 같은 정보를 자동으로 매칭해주는 조인

/*
하지만, 이 방법은 매우 위험하다. 
컬럼명이 동일하나 내용이 다를 수 있기 때문이다. 
따라서 만약 컬럼명만 동일하고, 
값이 다를 경우 원치 않은 결과를 초래할 수 있으므로 
사용을 권장하지 않는다.
*/

SELECT EMP_NAME, JOB_CODE, JOB_NAME
FROM EMPLOYEE
NATURAL JOIN JOB;

-- CROSS JOIN : --
-- 합하고자 하는 두 개의 테이블 중 겹치는 정보가 없을 때
-- 강제로 조인하는 방법,결과는 카테시안 곱(곱집합)으로 나온다.
SELECT * FROM EMPLOYEE;
SELECT * FROM NATIONAL;

SELECT EMP_NAME, NATIONAL_NAME
FROM EMPLOYEE
CROSS JOIN NATIONAL;

-- 심화 문제 1 --
-- 한국(KO)과 일본(JP)에 근무하는 직원들의
-- 사원명, 부서명, 지역코드, 국가명을 조회하시오.

-- < 조회 필요한 테이블 > --
SELECT * FROM NATIONAL;
SELECT * FROM LOCATION;
SELECT * FROM DEPARTMENT;
SELECT * FROM EMPLOYEE;

-- ORACLE --
SELECT EMP_NAME, DEPT_TITLE, LOCAL_CODE, NATIONAL_NAME
FROM NATIONAL N, LOCATION L, DEPARTMENT D, EMPLOYEE E
WHERE N.NATIONAL_CODE = L.NATIONAL_CODE
  AND L.LOCAL_CODE = D.LOCATION_ID
  AND D.DEPT_ID = E.DEPT_CODE
  AND NATIONAL_NAME IN ('한국', '일본');

-- ANSI -- 
SELECT EMP_NAME, DEPT_TITLE, LOCAL_CODE, NATIONAL_NAME
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE)
JOIN NATIONAL USING(NATIONAL_CODE)
WHERE NATIONAL_NAME IN ('한국', '일본');

-------------------

-- EQ-JOIN / NON EQ-JOIN
-- 연결하고자하는 컬럼을 1:1로 매칭 시키는 조인 방식
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

-- NON EQ-JOIN
-- 지정한 컬럼을 1:1로 비교하는 것이 아니라
-- 특정 범위의 계산식, 수식 등을 비교 조건으로
-- 사용하는 조인 방식
-- ON( =이 아닌 조건들 ) 선언하여 사용한다.
-- ANSI 방식
SELECT EMP_NAME, JOB_CODE, DEPT_CODE, SALARY
FROM EMPLOYEE
JOIN SAL_GRADE ON(SALARY BETWEEN MIN_SAL AND MAX_SAL);

-- 오라클 방식
SELECT EMP_NAME, JOB_CODE, DEPT_CODE, SALARY
FROM EMPLOYEE, SAL_GRADE
WHERE SALARY BETWEEN MIN_SAL AND MAX_SAL;

------------------------------------------------------

-- SELF JOIN --
-- 자기 자신의 테이블 정보와 비교하여
-- 원하는 내용을 연결 지어 사용하는 조인 방식
-- 반드시 테이블 별칭을 붙여야 한다.

-- ORACLE --
-- SELF JOIN을 할 때는 반드시 별칭을 붙여주어야 한다.

SELECT E.EMP_ID "근무자사번",  
       E.EMP_NAME "근무자명", 
       E.MANAGER_ID "관리자사번",
       M.EMP_NAME "관리자명"
FROM EMPLOYEE E, EMPLOYEE M 
WHERE E.MANAGER_ID = M.EMP_ID;


---

-- 실습 3 --
-- 직급이 대리이면서, 아시아 지역에서 근무하는
-- 사원의 사번, 사원명, 직급명, 부서명, 급여, 관리자명을
-- 조회하시오.

-- ORACLE --
SELECT E.EMP_ID 사번, E.EMP_NAME 사원명, J.JOB_NAME 직급명, D.DEPT_TITLE 부서명, E.SALARY 급여, M.EMP_NAME 관리자명
FROM EMPLOYEE E, DEPARTMENT D, JOB J, LOCATION L, EMPLOYEE M
WHERE DEPT_ID = E.DEPT_CODE
 AND J.JOB_CODE = E.JOB_CODE
 AND D.LOCATION_ID = L.LOCAL_CODE
 AND E.MANAGER_ID = M.EMP_ID
 AND L.LOCAL_NAME LIKE 'ASIA%'
 AND J.JOB_NAME = '대리';

-- ANSI --
SELECT E.EMP_ID 사번, E.EMP_NAME 사원명, J.JOB_NAME 직급명, 
        D.DEPT_TITLE 부서명, E.SALARY 급여, M.EMP_NAME 관리자명
FROM EMPLOYEE E
JOIN DEPARTMENT D ON(DEPT_ID = E.DEPT_CODE)
JOIN JOB J ON(J.JOB_CODE = E.JOB_CODE AND J.JOB_NAME = '대리')
JOIN LOCATION L ON(D.LOCATION_ID = L.LOCAL_CODE AND L.LOCAL_NAME LIKE 'ASIA%')
JOIN EMPLOYEE M ON(E.MANAGER_ID = M.EMP_ID);

----------------------------------------------------------------

-- 서브쿼리 --
-- 주가 되는 메인 쿼리 안에서
-- 조건이나 하나의 검색값을 위한
-- 또 하나의 쿼리를 추가하여 사용하는 방법

-- 최소 급여를 받는 사원을 조회하시오.
SELECT MIN(SALARY)
FROM EMPLOYEE;

-- >> 단일 행 서브쿼리
--     결과가 한 개 나오는 방법
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
-- WHERE SALARY = 1380000;
WHERE SALARY = ( SELECT MIN(SALARY) FROM EMPLOYEE );


-- 각 직급 별 최소 급여
SELECT JOB_CODE, MIN(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE
ORDER BY 1;

SELECT MIN(SALARY) 
FROM EMPLOYEE 
GROUP BY JOB_CODE;

-- 직급 별 최소 급여를 받고 있는 사원 조회하기
-->> 다중 행 서브 쿼리
SELECT EMP_NAME, JOB_CODE, SALARY FROM EMPLOYEE
WHERE SALARY IN (SELECT MIN(SALARY) 
                 FROM EMPLOYEE 
                 GROUP BY JOB_CODE);

-->> 다중 행 다중 열 서브쿼리
SELECT EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (JOB_CODE, SALARY) IN ( SELECT JOB_CODE, MIN(SALARY)
                              FROM EMPLOYEE
                              GROUP BY JOB_CODE );



----
-- 부서가 d1이거나 d4 인 사람 중 성이 '박'씨인 
-- 사람의 모든 정보를 조회하시오.

SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D1', 'D4') AND EMP_NAME = '박%';

--
-- 스터디 1
/*
직급이 과장이면서, 일본에서 근무하는 사원의 
사번, 사원명, 직급명, 부서명, 지역, 연봉, 관리자명을 조회하시오. 
이 때, 연봉은 CONCAT, TO_CHAR, SUBSTR을 사용하여 
만원단위까지만 뽑아내어 '원'표시와 '만원'을 추가하시오.
*/

SELECT E.EMP_ID 사번,
E.EMP_NAME 사원명, 
J.JOB_NAME 직급명, 
D.DEPT_TITLE 부서명,
N.NATIONAL_NAME 지역, 
CONCAT(TO_CHAR(SUBSTR(E.SALARY*12,1,4),'L999,999,999'),'만원') 급여,
M.EMP_NAME 관리자명
FROM EMPLOYEE E, DEPARTMENT D, JOB J, LOCATION L, NATIONAL N, EMPLOYEE M
WHERE E.MANAGER_ID = M.EMP_ID
AND E.DEPT_CODE = D.DEPT_ID
AND E.JOB_CODE = J.JOB_CODE
AND D.LOCATION_ID = L.LOCAL_CODE
AND L.NATIONAL_CODE = N.NATIONAL_CODE
AND J.JOB_NAME IN ('과장');



SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;
SELECT * FROM JOB;
SELECT * FROM NATIONAL;
SELECT * FROM LOCATION;

SELECT EMP_NAME
FROM EMPLOYEE
WHERE DEPT_CODE = 'D6' ;
SELECT * FROM DEPARTMENT;


SELECT E.EMP_ID 사번, E.EMP_NAME 사원명, J.JOB_NAME 직급명, 
            D.DEPT_TITLE 부서명, 
            N.NATIONAL_NAME 지역,
            CONCAT(TO_CHAR(SUBSTR(E.SALARY*12,1,4),'L999,999,999'),'만원') 급여,
            M.EMP_NAME 관리자명
FROM EMPLOYEE E, DEPARTMENT D, JOB J, LOCATION L, NATIONAL N, EMPLOYEE M
WHERE DEPT_ID = E.DEPT_CODE
 AND J.JOB_CODE = E.JOB_CODE
 AND D.LOCATION_ID = L.LOCAL_CODE
 AND L.NATIONAL_CODE = N.NATIONAL_CODE
 AND E.MANAGER_ID = M.EMP_ID
 AND L.LOCAL_NAME LIKE 'ASIA2'
 AND J.JOB_NAME = '과장';
 
 -- 스터디 2
 -- SUBSTR : 주어진 문자열에서 특정 값을 꺼내오는 함수
-- SUBSTR(컬럼명 | 문자, 시작번호[, 가져올 개수]); 
-- My favorite language is ORACLE 에서 ORACLE 만 출력하시오
SELECT 'My favorite language is ORACLE',
        SUBSTR('My favorite language is ORACLE', 24)
FROM DUAL;

-- 변형
SELECT JOB_CODE,
            CONCAT(TO_CHAR(TRUNC(SALARY*20,4),'L999,999,999'),'만원') 급여
FROM EMPLOYEE
WHERE JOB_CODE = 'J1';

-- 조별 문제 : 2조 --
-- 직급이 과장이나 차장이면서, 근무지역이 미국이고, 급여가 4000000만원 이상인
-- 사원의 사번, 사원명, 직급명, 부서명, 급여, 관리자명을
-- 조회하시오.

SELECT E.EMP_ID 사번, E.EMP_NAME 사원명, J.JOB_NAME 직급명, 
            D.DEPT_TITLE 부서명, 
            E.SALARY 급여,
            M.EMP_NAME 관리자명
FROM EMPLOYEE E, DEPARTMENT D, JOB J, LOCATION L, EMPLOYEE M
WHERE DEPT_ID = E.DEPT_CODE
 AND J.JOB_CODE = E.JOB_CODE
 AND D.LOCATION_ID = L.LOCAL_CODE
 AND E.MANAGER_ID = M.EMP_ID
 AND L.LOCAL_NAME LIKE 'ASIA2'
 AND J.JOB_NAME IN ('과장','차장') ;
 --AND E.SALARY >= 40000000;

SELECT E.EMP_ID 사번, E.EMP_NAME 사원명, J.JOB_NAME 직급명, 
            D.DEPT_TITLE 부서명, 
            N.NATIONAL_NAME 지역,
            E.SALARY 급여,
            M.EMP_NAME 관리자명
FROM EMPLOYEE E, DEPARTMENT D, JOB J, LOCATION L, NATIONAL N, EMPLOYEE M
WHERE DEPT_ID = E.DEPT_CODE
 AND J.JOB_CODE = E.JOB_CODE
 AND D.LOCATION_ID = L.LOCAL_CODE
 AND L.NATIONAL_CODE = N.NATIONAL_CODE
 AND E.MANAGER_ID = M.EMP_ID
 --AND L.LOCAL_NAME LIKE 'AMERICA';
 AND J.JOB_NAME = '과장';


