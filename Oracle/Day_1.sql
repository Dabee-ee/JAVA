-- Day 1 --

-- 현재 계정이 가진 모든 테이블(표)의 정보를 출력하는 구문
SELECT * FROM TABS;

-- 특정 테이블 정보 조회하기
SELECT * FROM EMPLOYEE;    -- Ctrl + Enter  (Mac도 동일)

SELECT EMP_NAME, EMAIL, HIRE_DATE
FROM EMPLOYEE;

-- SELECT 문
-- [사용 형식]
-- SELECT 컬럼명(혹은 계산식)[, 컬럼명 . . . ]
-- FROM 테이블명

-- 테이블의 구조 확인
DESC EMPLOYEE;

-- 실습 1 
-- EMPLOYEE 테이블에서
-- 사원의 번호, 사원명, 이메일, 연락처를 조회하시오.
SELECT EMP_ID, EMP_NAME, EMAIL, PHONE
FROM EMPLOYEE;

-- WHERE 절
-- 테이블에서 조건을 만족하는 값을 가진 행(가로)을
-- 따로 선택하여 조회하는 구문
-- [사용 형식]
-- SELECT 컬럼명[, 컬럼명 . . . ]
-- FROM 테이블명
-- WHERE 조건식 [ AND | OR 조건식 ]
-- 컬럼명 >= 값 | 컬럼명 = 값 | 컬럼명 != 값

-- 부서 코드가 'D9' 인 부서의 직원 정보를 모두 조회하시오.
SELECT * 
FROM EMPLOYEE
WHERE DEPT_CODE = 'D9';

-- 실습 2 --
-- EMPLOYEE 테이블에서
-- 직급이 'J1'인 직원들의
-- 사번, 사원명, 직급코드, 부서코드를 조회하시오.
SELECT EMP_ID, EMP_NAME, JOB_CODE, DEPT_CODE
FROM EMPLOYEE
WHERE JOB_CODE = 'J1';

-- 실습3 --
-- EMPLOYEE 테이블에서
-- 부서코드가 'D5' 이며, 이름이 '김해술'인 사원의
-- 사원번호, 사원명, 급여 정보를 조회하시오.
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5' AND EMP_NAME = '김해술';

-- 실습4 --
-- EMPLOYEE 테이블에서
-- 부서코드가 'D5' 이거나, 이름이 '송종기'인 사원의
-- 사원번호, 사원명, 급여 정보를 조회하시오.
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5' OR EMP_NAME = '송종기';

-- 실습 5 --
-- EMPLOYEE 테이블에서 급여(SALARY)가
-- 300만원 이상인 사원의
-- 사번, 사원명, 직급코드, 급여
-- 정보를 조회하시오.
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3000000;

-- AS : 컬럼 별칭 짓기
-- 컬럼의 이름이 너무 길거나 원하는 머릿글을 뽑고자 할 경우
-- 사용하는 문법
-- [사용형식]
-- SELECT 컬럼명 AS "별칭"
-- SELECT 컬럼명 "별칭"
SELECT EMP_ID "사번", 
        EMP_NAME AS "사원이름"
FROM EMPLOYEE;






