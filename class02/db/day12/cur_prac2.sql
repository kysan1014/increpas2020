create or replace procedure select_dept_info

is
	cursor d_info is
		select d.dname, d_stat.avg, d_stat.cnt
		from dept d,
			( select deptno, round(avg(sal), 3) avg, count(*) cnt
				from emp
				group by deptno ) d_stat
		where d.deptno = d_stat.deptno
	;

begin
	dbms_output.enable;
	for data in d_info loop
		dbms_output.put_line(data.dname||' '||data.avg||' '||data.cnt);
	end loop;

end;
/