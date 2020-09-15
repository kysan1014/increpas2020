create or replace procedure sel_emp_info
( eno scott.emp.empno%type )
is
	name scott.emp.ename%type;
	cursor emp_name_cur
	is
		select ename
		into name
		from scott.emp
		where empno = eno
	;
	
begin
	open emp_name_cur;

    fetch emp_name_cur into name;
            
    if emp_name_cur%notfound then
        dbms_output.put_line('해당 사원은 존재하지 않습니다.');
    else 
        dbms_output.put_line('사원번호 : '||eno);
		dbms_output.put_line('사원이름 : '||name);
    end if;
    
	loop
		fetch emp_name_cur into name;
        
        if emp_name_cur%notfound then
            exit;
        end if;

		dbms_output.put_line('사원번호 : '||eno);
		dbms_output.put_line('사원이름 : '||name);
	end loop;

	close emp_name_cur;
end;
/

set serveroutput on;

execute sel_emp_info(7839);
execute sel_emp_info(8000);