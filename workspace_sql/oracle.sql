-- ���� �ּ�
/* ���� �ּ� */
SELECT
    * -- ��� �÷�
FROM
    emp;

-- sql developer �ڵ����� ����Ű : Crtl + F7
SELECT
    empno,
    ename,
    deptno -- ��ȸ�ϰ� ���� �÷� ���
FROM
    emp;

SELECT
    *
FROM
    dept;

SELECT
    *
FROM
    salgrade;
 --distinct : select���� �ߺ��Ǵ� �ڷḦ �������ش�
SELECT
    deptno
FROM
    emp;
 -- ���� ���� ����Ű : ctrl + shift + d
SELECT DISTINCT
    deptno
FROM
    emp;

SELECT DISTINCT
    job
FROM
    emp; 
 
 -- �÷��� �������� ��� �÷����� ������ �ߺ��Ǵ� �� �����Ѵ�
SELECT DISTINCT
    deptno,
    job
FROM
    emp;
 
 -- null�� �����ϸ� ������ null�̴�
SELECT
    ename,
    sal,
    sal * 12 + comm,
    comm
FROM
    emp;
 -- �÷��� ��Ī ���
 -- ��Ī �ȿ� ���Ⱑ �ִ� ��� " ���� �Ұ�
 -- �����ϸ� ���� ���� _�� �������
 -- as ���� ����, "" ��������
SELECT
    ename,
    sal,
    sal * 12 + comm AS "new_SAL",
    comm
FROM
    emp;
-- order by : �ش� �÷����� ����
-- �������� : asc ��������
-- �������� : desc
SELECT * FROM emp 
ORDER BY sal asc;

SELECT * FROM emp 
ORDER BY comm desc;
-- order by ù��°�ŷ� �����ϰ�
-- ���� ������ �ִٸ� �����ŷ� �����ϰ�
-- ���� ������ �ִٸ� �����ŷ� �����ϰ�
select * 
from emp
order by deptno asc, sal desc;

SELECT DISTINCT
    JOB
FROM
    EMP
ORDER BY JOB ASC;

select * from emp where deptno = 30;

select * from emp where empno = 7782 ;
select * from emp where sal >= 2000
order by sal;

select * from emp
where ename = 'KING';

select * from emp where deptno = 30 and job='CLERK';

select * from emp where  job='CLERK' and deptno = 30 ;

select * from emp where (deptno = 20 or deptno = 30) and job='CLERK';

select * from emp where sal>=2000 and sal<=3000;

select * from emp
where sal != 3000;
-- where sal <> 3000;
-- where sal ^= 3000;

select * from emp where NOT(sal>=2000 and sal<3000);

select * from emp where job in('MANAGER','SALESMAN','CLERK');

select * from emp
where sal >= 2000 and sal <=3000;

select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;


-- %�� ��ŵ� �������
select * from emp
where ename like 'S%';

-- _ �� �� �ѱ��� � ���ڵ� �������
select * from emp
where ename like 'A%';

select * from emp
where ename like '_L%';

select * from emp
where ename like '%AM%';

select * from emp
where comm <= 400;

select * from emp
where comm is null;

select * from emp
where comm is not null;


-- emp ���� deptno�� 10 �Ǵ� 20�� �����
-- empno, ename, sal, deptno�� ���
select empno, ename, sal, deptno
from emp
where deptno in (10,20);
--where deptno=10 or deptno=20;


-- ���� �ٸ� ��ȸ ������� ������
-- �� ��ȸ�� �÷��� ����,Ÿ�� ���ƾ� �Ѵ�
select empno, ename, sal, deptno
from emp
where deptno = 10

union

select empno, ename, sal, deptno
from emp
where deptno = 20;


-- union : �ߺ��� �ڷḦ �������ش�
select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 10;

-- union all : �ߺ��� ������� ��������
select empno, ename, sal, deptno
from emp
where deptno = 10
union all
select empno, ename, sal, deptno
from emp
where deptno = 10;

-- ���⼭���� ���� --
-- 1��
select * from emp
where ename like '%S';

--2��
select empno, ename,job,sal,deptno from emp
where deptno=30 and job='SALESMAN';

-- 3��
--���տ����� ���
select empno, ename,job,sal,deptno from emp
where deptno=20 and sal>2000
union all
select empno, ename,job,sal,deptno from emp
where deptno=30 and sal>2000;

-- ���տ����� ���X
select empno, ename,job,sal,deptno from emp
where deptno=20 and sal>2000;

select empno, ename,job,sal,deptno from emp
where deptno=30 and sal>2000;

--4��
select * from emp
where not(sal>=2000 and sal <= 3000);

--5��
select ename, empno, sal, deptno from emp
where ename like'%E%' 
    and deptno=30 
    and (sal not between 1000 and 2000);
    
--6��
select * from emp
where comm is null
    and (job = 'MANAGER' or job = 'CLERK')
    and (ename not like '_L%');
    
    select ename, upper(ename), lower(ename), initcap(ename)
    from emp;
    
    select * from emp
    where lower(ename) like lower('%Mi%');
    
    select ename, length(ename)
    from emp;
    
    select ename, length(ename)
    from emp
    where length(ename) >=5;
    
-- length : ���� ����    
-- dual : �ӽ����̺�
select length('��'), lengthb('��') from dual;
    
    
--substr : ����� �Ǵ¹���, ������ġ, ������ ����
select  
        job, 
        substr(job,1,2), substr(job,0,2),
        substr(job,3,2),
        ename,
        substr(job,-3,2),
        substr(job,5,10000)
from emp;

select job, replace(job,'A','*') from emp;

select 
    job, 
    length(job),
    length(job)/2,
    substr(job, (length(job)+1) /2 ,1),
    replace(job,substr(job, (length(job)+1) /2 ,1),'*')
from emp;


-- lpad : ����� �Ǵ� ����, ��ü �ڸ���, ä�� ����
-- ä�� ���� ������ ���� ����
select
    job,
    lpad(job,10,'#'),
    lpad(job,4,'#')
from emp;

-- ��� ���� ����
select
    job,
    rpad(lpad(job,length(job) + ((15-length(job))/2),'*'), ((15-length(job))/2) + length(job),'*')
from emp;


-- ���ڿ� ���ϱ�
select empno || ename || '��'
from emp;


-- trim : �� �� ���� ����
-- �۾� ������ ������ �������� ����
select
    '  a b c           ',
    trim('  a b c           ')
    from dual;

--�������� 1
select
    '210612-3123456',
    substr('210612-3123456',1,8) || '******' as "substr",
    rpad(substr('210621-3123456',8),length('210621-3123456'),'******') as "100��¥�� ����"
from dual;

--�ǽ�����2
-- ����� �̸��� �տ� 2�ڸ��� ���̰� �ϰ� �������� *�� ǥ��
-- ������ �� : WARD ->> WA**, MARTIN -> MA****
-- ������� : �� �α��� + '***'

select 
rpad(substr(ename,0,2),length(ename),'*') as "���Ĺ���",
substr(ename,0,2) || '***' as "�������",
lpad(substr(ename,2,length(ename)),length(ename),'*') as "�ǽ�����3",
substr(ename,1,1) || '*' || substr(ename,2,length(ename)) as "�ǽ�����4",
substr(ename,1,length(ename)/2-0.5) || '*' ||substr(ename,(length(ename)/2+1.5),length(ename)) as "�ǽ�����5"
from emp;

-- �ǽ�����3
-- �ձ��� �ϳ���
-- WARD -> *ARD, MARTIN -> *ARTIN

-- �ǽ�����4
-- �ι��� �۾��� *
-- WARD -> W*RD, MARTIN -> M*RTIN

-- �ǽ�����5
-- ��� �۾��� *
-- MARTIN > MA*TIN, SCOTT > SC*TT

select 
    trunc(1234.5678),
    trunc(1234.5678,2),
    trunc(1234.5678,-2),
    trunc(-12.34)
from dual;

select
ceil(3.14),
floor(3.14),
ceil(-3.14),
floor(-3.14)
from dual;

-- sysdate : ���� ����Ŭ pc�� �ð� ���
-- ���� pc�� 9�ð� ���̰� ����(���� 0�� �ѱ� +9��)
-- ��¥ ���� �� �Ϻθ� select�� ǥ�õ�
select sysdate from dual;

select sysdate, sysdate+1,sysdate-1 from dual;


-- �÷��� +�� ������ ��� ���ڷ� �����ؼ� ����
 -- || ���ڵ� ���ڷ� ����
 
 select to_char(sysdate+9/24,'yyyy"��" mm"��" dd"��" hh24"��" mi"��" ss"��"')
 from dual;
 
 select
 sysdate - to_date('2024-05-07','yyyy-mm-dd')
 from dual;
 
 select
 comm, nvl(comm,-1),
 sal,
 sal + comm,
 sal + nvl(comm,0)
 from emp;
 
 select * from emp
 where comm = 0 or comm is null;
 
 select * from emp
 where nvl(comm,0) = 0;
 
 select
case
when comm is null then 'N/A'
else to_char(comm)
-- '' || comm
end as new_comm
from emp;

select
case
when comm is null then 0
else comm
end
from emp;

-- Q1
select 
empno,
rpad(substr(empno,1,2),length(empno),'*') as MASKIN_EMPNO,
ename,
rpad(substr(ename,1,1),length(ename),'*') as MASKIN_EMPNO
from emp
where length(ename)>=5 and length(ename)<6;

--Q2
select empno,ename,sal,
trunc(sal/21.5,2) as DAY_PAY,
round(sal/21.5/8,1) as TIME_PAY
from emp;
--Q3
select 
empno,
ename,
to_char(hiredate, 'yyyy/mm/dd') as hiredate,
to_char(add_months(hiredate, 3), 'yyyy/mm/dd') as r_job,
case
    when comm is null then 'N/A'
    else to_char(comm)
end as comm
from emp;

--Q4
select empno, ename, mgr,
case
when substr(mgr,1,2) is null then '0000'
when substr(mgr,1,2) ='75' then '5555'
when substr(mgr,1,2) ='76' then '6666'
when substr(mgr,1,2) ='77' then '7777'
when substr(mgr,1,2) ='78' then '8888'
else to_char(mgr)
end as CHG_MGR
from emp;

--Q4_2
select empno, ename, mgr,
case
when mgr is null then '0000'
when mgr like '75%' then '5555'
when mgr like '76%' then '6666'
when mgr like '77%' then '7777'
when mgr like '78%' then '8888'
else ''|| mgr
end as CHG_MGR
from emp;

--Q4_3
select empno, ename, mgr,
case
when lpad(mgr,2) is null then '0000'
when lpad(mgr,2) like '75%' then '5555'
when lpad(mgr,2) like '76%' then '6666'
when lpad(mgr,2) like '77%' then '7777'
when lpad(mgr,2) like '78%' then '8888'
else ''|| mgr
end as CHG_MGR
from emp;

-- countó�� null�� ���ܵ�
-- count�� *�� ���� ��
select sum(sal), count(sal),count(*),count(comm) from emp;

select count(*) from emp where ename like '%A%';

select max(sal), max(ename),min(hiredate), min(comm),avg(sal)
from emp;

select sum(sal), avg(sal) from emp where deptno=10
union all
select sum(sal), avg(sal) from emp where deptno=20
union all
select sum(sal), avg(sal) from emp where deptno=30;

-- distinctó�� �ߺ��� ��������, �з�����
-- select
select deptno, avg(sal),sum(sal),count(*) from emp
group by deptno;

select deptno, empno from emp
group by deptno, empno;

select deptno, job, count(*)
from emp
-- where count(*) >= 2
group by deptno, job
order by deptno, job;

--having : group by ������ ���ȴ�
-- �����Լ��� �������� �ɰ� ������

select deptno, job, avg(sal)
from emp
group by deptno, job
--    having avg(sal)>=2000;
--    having count(*) >=2
having deptno = 20;

--Q1
select deptno,
floor(avg(sal)) as avg_sal,
max(sal) as max_sal,
min(sal) as min_sal,
count(*) as cnt
from emp
group by deptno;

--Q2
select 
job ,count(*)
from emp
group by job
    having count(job)>=3;
    
select * from dept;

/* 5 */select job,count(*) cnt
/* 1 */from emp
/* 2 */where sal > 1000
/* 3 */group by job
/* 4 */having count (*) >=3
/* 6 */order by cnt desc;

select emp.ename, dept.loc,deptno
from emp, dept
where emp.deptno = dept.deptno
order by empno;
--���̺� �ΰ� �̻� ��ȸ�Ҷ� ���踦 �� �˷���� ���ϴ� ������ ��µȴ�
-- ��ü ���̺� �� -1���� ������ �����ϴ�

select ename
from emp e, dept d
where e.deptno = d.deptno;

select * 
from emp e, salgrade s
where e.sal >= s.losal and e.sal <=s.hisal;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

select * from emp;

-- using�� �� �� ���� �÷����� �ִ� ��츸 �� �� �ִ�.
select * 
    from emp join dept using (deptno);
    
select * 
from emp join dept on (emp.deptno = dept.deptno);

select * 
from emp e1 join emp e2 on(e1.mgr = e2.empno);


-- left outer join�̶�? ���� ���̺��� ��� ����ϴ°� �������ش�
select * 
from emp e1 right outer join emp e2 on(e1.mgr = e2.empno);

--Quiz1
-- empno, ename, dname, loc ��� : ��� 14��
-- where Ȱ��
select e.empno, e.ename, d.dname, d.loc 
from emp e, dept d
where e.deptno = d.deptno;

-- join Ȱ��
select e.empno, e.ename, d.dname, d.loc 
from emp e join dept d using(deptno);

--Quiz2
-- ���, �̸�, �μ���, �޿������ ��� : ��� 14��
-- where Ȱ��
select e.empno, d.dname, e.job, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal and e.sal <=s.hisal;

select e.empno, d.dname, e.job, s.grade
from emp e
left outer join dept d on (e.deptno= d.deptno)
left outer join  salgrade s on(e.sal >= s.losal and e.sal <=s.hisal);


select * from emp;
select * from salgrade;
select * from dept;

    
-- Quiz3
-- ��� ���� ������ ���� ����� �̸�, �޿�, �Ŵ����̸�, �Ŵ��� �޿�
select e1.ename, e1.sal, e2.ename, e2.sal
from emp e1, emp e2
where e1.mgr = e2.empno and e1.sal >= e2.sal;

--Q1
select e.deptno, d.dname,e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno and sal>=2000
order by d.deptno;
--Q2
select e.deptno, d.dname, floor(avg(e.sal)) avg_sal, max(e.sal) max_sal, min(e.sal)min_sal,count(e.deptno) cnt
from emp e, dept d
where e.deptno = d.deptno
group by e.deptno, d.dname;

--Q3
select d.deptno, d.dname, e.empno,e.ename,e.job,e.sal
from emp e right outer join dept d on (e.deptno=d.deptno)
order by deptno, ename;

--Q4


select sal
from emp
where ename = 'JONES';

select * from emp
where sal > (select sal
from emp
where ename = 'JONES');

-- ��պ��� ���� ����
select * from emp
where sal > (select avg(sal) from emp);

-- BLAKE������  ���� ����
select * from emp
where sal > (select sal
from emp
where ename = 'BLAKE');

--JONES���� ���� �� ���� job�� ������ �ִ� �����
select * from emp
where job = (select job
from emp
where ename = 'JONES');

select * from emp 
where 
sal in(
select max(sal) from emp group by deptno
);