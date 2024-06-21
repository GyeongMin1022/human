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