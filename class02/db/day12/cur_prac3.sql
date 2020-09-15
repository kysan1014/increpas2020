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
	
	data d_info%rowtype;

begin
	dbms_output.enable;
	
	open d_info;
	
	loop
		fetch d_info into data;
		exit when d_info%notfound;
		dbms_output.put_line(data.dname||' '||data.avg||' '||data.cnt);
	end loop;
	
	dbms_output.put_line('총 조회 행 수 : '||d_info%rowcount);
	
	close d_info;

end;
/