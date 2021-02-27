-- Day 5 --

-- 서브 쿼리는 사용 위치가 다양하다.
-- SELECT, FROM, WHERE, GROUP BY, HAVING, ORDER BY, JOIN
-- DML : INSERT, UPDATE, DELETE
-- DDL : CREATE, ALTER, DROP, CREATE VIEW
-- 어느 위치든 사용할 수 있다.

-- FROM에서 사용하는 서브쿼리
-- 서브쿼리를 FROM에서 사용할 경우
-- 테이블 명으로 직접 조회하는 대신 
-- 서브쿼리의 결과셋(RESULT SET)을 활용하여
-- 데이터 테이블처럼 사용하게 된다.
-- 이 때 기존의 테이블을 대신한다는 뜻으로
-- 인라인 뷰(Inline View)라고 말한다.

SELECT * FROM EMPLOYEE;

SELECT *
FROM (
    SELECT EMP_ID, EMP_NAME, SALARY
    FROM EMPLOYEE
    WHERE DEPT_CODE = 'D5'
);

-- 응용
SELECT *
FROM (
    SELECT EMP_NAME, DEPT_TITLE, JOB_NAME, SALARY
    FROM EMPLOYEE
    JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
    JOIN JOB USING(JOB_CODE)
) A
WHERE A.DEPT_TITLE = '인사관리부';


-- 스칼라 서브쿼리
-- SELECT, ORDER BY에서 사용하는 서브쿼리

SELECT EMP_ID, 
       EMP_NAME, 
       DEPT_CODE, 
       ( SELECT DEPT_TITLE 
         FROM DEPARTMENT 
         WHERE E.DEPT_CODE = DEPT_ID) "부서명"
FROM EMPLOYEE E
ORDER BY ( SELECT DEPT_TITLE 
         FROM DEPARTMENT 
         WHERE E.DEPT_CODE = DEPT_ID );

---------------------------------------------------------

-- 조인으로 풀어 본다면...?
SELECT EMP_ID, EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID(+)
ORDER BY 4;

--- 서브쿼리 VS 조인 --

SELECT EMP_ID, EMP_NAME, DEPT_ID
FROM EMPLOYEE
JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
WHERE DEPT_TITLE = '인사관리부';

SELECT EMP_ID, EMP_NAME, DEPT_CODE
FROM EMPLOYEE
WHERE DEPT_CODE = (SELECT DEPT_ID FROM DEPARTMENT WHERE DEPT_TITLE = '인사관리부');

------------------------------------
-- TOP-N 분석
-- 주어진 조건에 맞는 내용을 순위화하는 기법

-- ROWNUM : 
SELECT ROWNUM, EMP_NAME, SALARY
FROM EMPLOYEE;

SELECT ROWNUM, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ROWNUM < 6;

-----
/* 
급여 기준 가장 높은 급여를 받는 사원 상위 5명을 
조회하여 순위, 사번, 사원명, 급여 정보를 조회 하시오.
*/

-- 단순 정렬은 값이 이상해진다.
SELECT ROWNUM, EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ROWNUM < 6
ORDER BY 4 DESC ; 

-- 조건식을 지우고 확인해보자
SELECT ROWNUM, EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
ORDER BY 4 DESC ; 

-- 여기서 기억해야할 것은 ROWNUM은 FROM을 
-- 실행할 때 이미 번호를 매기기 시작한다는 것이다.
-- SELECT 가 가장 마지막에 실행되기 때문에 이미 ORDER BY 된 번호를 바꿀 수 없다.

-- 그럼 이미 정렬된 정보를 가져와서 ROWNUM 을 적용하는 것은 어떨까?
-- 위 문제점을 응용하여 인라인뷰 서브쿼리를 사용하면 문제를 해결할 수 있다.
-- 이것을 활용하여 나중에 게시판을 만들 때 페이징하는 작업에 대한 코드를 짤 수 있게 됨.

SELECT ROWNUM, EMP_ID, EMP_NAME, SALARY
FROM (SELECT *
FROM EMPLOYEE
ORDER BY SALARY  DESC)
WHERE ROWNUM < 6;

-- 6등부터 10등까지
SELECT ROWNUM, EMP_ID, EMP_NAME, SALARY
FROM (SELECT *
FROM EMPLOYEE
ORDER BY SALARY  DESC)
WHERE ROWNUM BETWEEN 6 AND 10;

-- RANK() / DENSE_RANK()

-- RANK() : 동일한 순번이 있을 경우
--          이후 순번을 이전 동일 순번만큼
--          건너뛰고 시작하는 함수
-- 1, 2, 2, 4 . . . 
SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) 순위
FROM EMPLOYEE;


-- DENSE_RANK() : 동일한 순번이 있을 경우
--                다음 순번은 연속되게 순위를 매기는 함수
SELECT EMP_NAME, SALARY, 
       DENSE_RANK() OVER(ORDER BY SALARY DESC) 순위
FROM EMPLOYEE;


-- 실습 2 --
-- 급여 평균이 높은 순으로 3위 안에 드는 부서의
-- 부서코드, 부서명, 급여 평균을 조회하시오.

-- ROWNUM 사용 시
SELECT ROWNUM, DEPT_CODE, DEPT_TITLE, "평균"
FROM (
        SELECT DEPT_CODE, DEPT_TITLE, TRUNC(AVG(SALARY), -3) "평균"
        FROM EMPLOYEE E, DEPARTMENT D
        WHERE DEPT_CODE = DEPT_ID
        GROUP BY DEPT_CODE, DEPT_TITLE
        ORDER BY 3 DESC
     )
WHERE ROWNUM < 4;

-- RANK() 사용 시
SELECT "순위", DEPT_CODE, DEPT_TITLE, "평균"
FROM (
        SELECT RANK() OVER(ORDER BY TRUNC(AVG(SALARY), -3) DESC) "순위", 
               DEPT_CODE, DEPT_TITLE, TRUNC(AVG(SALARY), -3) "평균"
        FROM EMPLOYEE E, DEPARTMENT D
        WHERE DEPT_CODE = DEPT_ID
        GROUP BY DEPT_CODE, DEPT_TITLE
     )
WHERE "순위" < 4;

-- WITH AS 구문
-- 동일한 서브쿼리에 별칭을 부여하여 
-- 해당 별칭을 사용함으로써 서브쿼리를 대신하는 구문

WITH TOP_N AS ( SELECT EMP_NAME, SALARY
    FROM EMPLOYEE
    ORDER BY 2 DESC )
SELECT *
FROM TOP_N;

-- WITH AS 여러 개
WITH SUM_SAL AS ( SELECT DEPT_CODE, SUM(SALARY)
                  FROM EMPLOYEE
                  GROUP BY DEPT_CODE),
    AVG_SAL AS ( SELECT DEPT_CODE, AVG(SALARY)
                 FROM EMPLOYEE
                 GROUP BY DEPT_CODE)
SELECT * FROM SUM_SAL
UNION 
SELECT * FROM AVG_SAL;

----------------------------------------------------

-- 테이블 생성하기
CREATE TABLE SAMPLE_TABLE (
    SAMPLE_NO NUMBER,       -- 회원 번호
    SAMPLE_ID VARCHAR2(20), -- 회원 아이디
    SAMPLE_PWD VARCHAR2(20), -- 회원 비밀번호
    SAMPLE_NAME VARCHAR2(15) -- 회원 이름
);

-- 테이블 각 컬럼에 주석 달기
-- COMMENT ON COLUMN 테이블명.컬럼명 IS '주석명';

COMMENT ON COLUMN SAMPLE_TABLE.SAMPLE_NO IS '회원 번호';
COMMENT ON COLUMN SAMPLE_TABLE.SAMPLE_ID IS '회원 아이디';
COMMENT ON COLUMN SAMPLE_TABLE.SAMPLE_PWD IS '회원 비밀번호';
COMMENT ON COLUMN SAMPLE_TABLE.SAMPLE_NAME IS '회원 이름';

-- 현재 사용자가 가지는 모든 테이블 정보 보여주는 데이터 사전
SELECT * FROM USER_TABLES;

SELECT * FROM USER_TAB_COLUMNS;

-- 제약 조건 --

-- NOT NULL --
-- 해당 컬럼에는 NULL값이 들어갈 수 없습니다.

-- 테이블 삭제
DROP TABLE SAMPLE_TABLE;
DROP TABLE USER_NOT_NULL;

CREATE TABLE USER_NOT_NULL (
    USER_NO NUMBER,
    USER_ID VARCHAR2(20) NOT NULL,
    USER_PWD VARCHAR2(20) NOT NULL,
    USER_NAME VARCHAR2(15)
);

SELECT * FROM USER_NOT_NULL;

-- 테이블에 값 추가하기
-- DML : INSERT
-- INSERT INTO 테이블명 VALUES( 값1,값2, . . . );

INSERT INTO USER_NOT_NULL VALUES(1, 'user01', 'pass01', '홍길동');

SELECT * FROM USER_NOT_NULL;

INSERT INTO USER_NOT_NULL VALUES(2, null, null, null);

SELECT * FROM USER_NOT_NULL;

-- DELETE FROM USER_NOT_NULL WHERE USER_NO = 2;






