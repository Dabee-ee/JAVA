-- 한 줄 주석
/*
   여러 줄 주석
*/
-- 한 줄 실행은 Ctrl + Enter !
-- 현재 계정이 가진 모든 정보 표시
SELECT * FROM TABS;

-------------------------------------------------------------
-- 관리자 권한으로 계정 추가하기
-- 실습용 계정
--            아이디                 비밀번호 ( 대소문자 구분함 ) 
CREATE USER EMPLOYEE IDENTIFIED BY EMPLOYEE;

-- 권한 부여하기
GRANT CONNECT, RESOURCE TO EMPLOYEE;




