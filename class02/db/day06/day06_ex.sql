-- day06 문제
-- INSERT, UPDATE, DELETE


-- test 계정에 scott 계정이 가지고 있는 
--  emp 테이블을 구조만 복사해서 만드세요.
-- dept 테이블도 구조만 복사해서 만드세요.
-- salgrade 테이블은 데이터까지 복사해서 만드세요.

create table emp
as (select * from scott.emp where 1 = 2);
create table dept
as (select * from scott.dept where 1 = 2);
create table salgrade
as (select * from scott.salgrade);


/*
    dept 테이블에 데이터를 추가하는데
    10 - 기획부    - 수원
    20 - 인사부    - 여의도
    30 - 개발부    - 구로
    40 - 회계부    - 강남
    
    추가해주세요.
*/

insert into dept (deptno, dname, loc)
values (10, '기획부', '수원');
insert into dept (deptno, dname, loc)
values (20, '인사부', '여의도');
insert into dept (deptno, dname, loc)
values (30, '개발부', '구로');
insert into dept (deptno, dname, loc)
values (40, '회계부', '강남');


-- INSERT
-- 5명의 데이터를 테이블에 입력하세요.

insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1, 'A', 'PRESIDENT', null, sysdate - 365, 5000, null, 10);
insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (2, 'B', 'SALESMAN', 4, sysdate - 100, 2000, 100, 20);
insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (3, 'C', 'CLERK', 4, sysdate - 100, 2000, 500, 40);
insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (4, 'D', 'MANAGER', 1, sysdate - 365, 3000, 500, 20);
insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (5, 'E', 'ANALYST', 1, sysdate - 365, 4000, 1000, 30);


select plan_table_output from table(dbms_xplan.display('plan_table',null,'all'));
