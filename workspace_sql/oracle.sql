-- 한줄 주석
/* 범위 주석 */
SELECT
    * -- 모든 컬럼
FROM
    emp;

-- sql developer 자동정렬 단축키 : Crtl + F7
SELECT
    empno,
    ename,
    deptno -- 조회하고 싶은 컬럼 명들
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
 --distinct : select에서 중복되는 자료를 제거해준다
SELECT
    deptno
FROM
    emp;
 -- 한줄 복사 단축키 : ctrl + shift + d
SELECT DISTINCT
    deptno
FROM
    emp;

SELECT DISTINCT
    job
FROM
    emp; 
 
 -- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는 걸 제거한다
SELECT DISTINCT
    deptno,
    job
FROM
    emp;
 
 -- null과 연산하면 무조건 null이다
SELECT
    ename,
    sal,
    sal * 12 + comm,
    comm
FROM
    emp;
 -- 컬럼명에 별칭 사용
 -- 별칭 안에 띄어쓰기가 있는 경우 " 생략 불가
 -- 가능하면 띄어쓰기 보단 _를 사용하자
 -- as 생략 가능, "" 생략가능
SELECT
    ename,
    sal,
    sal * 12 + comm AS "new_SAL",
    comm
FROM
    emp;
-- order by : 해당 컬럼으로 정렬
-- 오름차순 : asc 생략가능
-- 내림차순 : desc
SELECT * FROM emp 
ORDER BY sal asc;

SELECT * FROM emp 
ORDER BY comm desc;
-- order by 첫번째거로 정렬하고
-- 그중 같은게 있다면 다음거로 정렬하고
-- 그중 같은게 있다면 다음거로 정렬하고
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
