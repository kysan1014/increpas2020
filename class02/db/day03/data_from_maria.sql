select 
	e.emp_no, e.last_name, d.dept_name, m.emp_no, m.last_name
from 
	employees e
	inner join dept_emp de on e.emp_no = de.emp_no
	left join departments d on de.dept_no = d.dept_no
	left join dept_manager dm on d.dept_no = dm.dept_no
	left join employees m on dm.emp_no = m.emp_no
where 
	de.to_date > now()
	and 
	dm.to_date > now()
order by 
	e.emp_no
;