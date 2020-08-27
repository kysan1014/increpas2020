/*
    1. SMITH 사원과 동일한 직급을 가진 사원의 정보를 조회하세요.
*/
select 
	* 
from 
	scott.emp
where 
	job = ( select 
				job 
			from 
				scott.emp 
			where 
				ename = 'SMITH' );
			
/*
    2. 사원들의 평균급여보다 적게 받는 사원의 정보를 조회하세요.  
*/
select * from scott.emp
where sal < (select avg(sal) from scott.emp);

/*
    3. 최고급여자의 정보를 조회하세요.
*/
select * from scott.emp
where sal = (select max(sal) from scott.emp);

/*
    4. KING 사원보다 늦게 입사한 사원의 정보를 조회하세요.
*/
select * from scott.emp
where hiredate = (select hiredate from scott.emp where ename = 'KING');

/*
    5. 각 사원의 급여와 평균급여의 차이를 조회하세요.
*/
select empno, sal, sal - (select avg(sal) from scott.emp) from scott.emp;


/*
    6. 부서의 급여합계가 가장 높은 부서의 사원들의 정보를 조회하세요.
*/
select 
	* 
from 
	scott.emp
where 
	deptno = (select 
					deptno 
				from 
					(select 
						deptno, avg(sal) 
					 from 
						scott.emp 
					 group by 
						deptno 
					 order by 
						avg(sal) desc)
                where 
                	rownum = 1);

/*
    7. 커미션을 받는 직원이 한사람이라도 있는 부서의 소속 사원들의 정보를 조회하세요.
*/
select * from scott.emp
where deptno in (select deptno from scott.emp where comm is not null);

/*
    8. 평균급여보다 급여가 높고 이름이 4글자 또는 5글자인 사원의 정보를 조회하세요.
*/
select 
	* 
from 
	scott.emp
where 
	sal > (
			select 
				avg(sal) 
			from
				scott.emp
			) 
and 
	length(ename) in (4,5);

/*
    9. 사원의 이름이 4글자로된 사원과 같은 직급의 사원들의 정보를 조회하세요.
*/
select * from scott.emp
where job in (select job from scott.emp where length(ename) = 4);

/*
    10. 입사년도가 81년이 아닌 사원과 같은 부서에 있는 사원의 정보를 조회하세요.
*/
select * from scott.emp
where deptno in (select deptno from scott.emp where to_char(hiredate, 'yy') != '81');

/*
    11. 하나라도 직급별 평균급여보다 조금이라도 많이 받는 사원의 정보를 조회하세요. -- ANY
*/
select * from scott.emp
where sal > any(select avg(sal) from scott.emp group by deptno);

/*
    12. 모든 입사년도 평균급여보다 많이 받는 사원의 정보를 조회하세요.
*/
select * from scott.emp
where sal > all(select avg(sal) from scott.emp group by to_char(hiredate, 'yy'));

/*
    13. 최고 급여자의 이름길이와 같은 이름길이를 갖는 사원이 존재하면
        모든 사원의 정보를 조회하고
        아니면 조회하지마세요.
*/
select 
	*
from 
	scott.emp
where 
	exists (
			select 
				* 
			from 
				scott.emp
			where 
				length(ename) = (
								  select 
								  	  length(ename) 
								  from 
								  	  scott.emp 
								  where 
								  	  mgr is null
								 )
			 );
				
