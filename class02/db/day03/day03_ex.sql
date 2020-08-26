/*
    1. 1년은 365일 이라고 가정하고
        사원의 근무일 수 를 년 단위로 표시하고
        대신 소수이하는 버리세요.
        
        표시형식 ]
            
            사원이름        입사일     근무년수
            SMITH           80/00/00    40년
*/

select
	ename,
	to_char(hiredate, 'yy-MM-dd'),
	round((sysdate-hiredate+1)/365) || '년'
from
	scott.emp;

/*
    2. 사원의 이름, 입사일, 근무일을 조회하세요.
        단 근무일은 년, 월 단위로 표현하세요.
*/

select
	ename,
	to_char(hiredate, 'yy-MM'),
	round(sysdate)-hiredate+1
from
	scott.emp;

/*
    3. 사원이 첫급여를 받을 때 까지 근무일 수 를 조회하세요.
*/

select
	ename,
	hiredate,
	last_day(hiredate) - hiredate + 1
from
	scott.emp;

/*
    4. 사원이 입사후 맞이하는 첫 토요일을 조회하세요.
*/

select
	ename,
	next_day(hiredate, '토요일')
from
	scott.emp;

/*
    5. 근무년수는 입사한 달의 1일을 기준으로 산출해야 한다.
        사원의 근무년수 기준일을 조회하세요.
        단, 15일 이전 입사자는 해당 월을 기준일로 하고
            16일 이후 입사자는 해당 월의 다음달을 기준일로 한다.
*/

select 
	empno,
	hiredate,
	round(hiredate, 'MM') 근속년수_기준일
from
	scott.emp;

/*
    6. 사원중 월요일에 입사한 사원의 사원이름, 입사일, 입사요일 을 조회하세요.
*/

select
	ename,
	hiredate,
	to_char(hiredate, 'day') hireday
from 
	scott.emp
where
	to_char(hiredate, 'day') = '월요일';
	
/*
    7. 사원 급여중에서 백단위가 0인 사원의 사원이름, 급여를 조회하세요.
    
    힌트 ]
        문자열로 변환후 처리한다.
*/

select
	ename,
	sal
from
	scott.emp
where 
	substr(to_char(sal), -3, 1) = '0';
	
select
	ename,
	sal
from
	scott.emp
where
	mod(sal, 1000) = 0;

/*
    8. 사원의 사원이름, 급여, 커미션을 조회하세요.
        단, 커미션이 없는 사원은 NONE 으로 표시되게 조회하세요.
*/

select
	ename,
	sal,
	nvl2(comm, to_char(comm), 'NONE')
from
	scott.emp;