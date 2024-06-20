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
