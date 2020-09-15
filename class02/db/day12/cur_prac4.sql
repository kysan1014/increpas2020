create or replace procedure update_job
(
	dno emp.deptno%type,
	ijob emp.job%type
)

is
	cursor no_cur is
		select
			empno
		from
			emp
		where
			deptno = dno and
			sal = (select min(sal) from emp where deptno = dno)
	for update
	;

begin
	for data in no_cur loop
		update
			emp
		set
			job = ijob
		where current of no_cur
		;
	end loop;
	
end;
/