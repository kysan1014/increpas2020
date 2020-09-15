create or replace procedure get_dept_personal
(
	dept_id number
)

is

	type emp_info is record
	(
		ename varchar2(10),
		job varchar2(9),
		dname varchar2(14),
		loc varchar2(13)
	);
	
	type dept_info_tbl is table of emp_info
		index by binary_integer;

	e_info emp_info;
	dept_tbl dept_info_tbl;
	j binary_integer := 0;
begin

	for e_info in (	
						select
							e.ename, e.job, d.dname, d.loc 
						from 
							emp e, dept d 
						where
							e.deptno = d.deptno and
							d.deptno = dept_id
					)
	loop
		j := j + 1;
		dept_tbl(j) := e_info;
	end loop;
	
	for i in 1 .. j loop
		dbms_output.put_line(dept_tbl(i).ename ||' '||dept_tbl(i).job ||' '||dept_tbl(i).dname ||' '||dept_tbl(i).loc);
	end loop;

end;
/

set serverouput on;

begin
	get_dept_personal(10);
	dbms_output.put_line(' ');
	get_dept_personal(20);
	dbms_output.put_line(' ');
	get_dept_personal(30);
	dbms_output.put_line(' ');
end;
/