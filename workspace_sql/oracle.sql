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

select * from emp
where sal >= 2000 and sal <=3000;

select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;


-- %는 어떤거든 관계없음
select * from emp
where ename like 'S%';

-- _ 는 딱 한글자 어떤 글자든 상관없음
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


-- emp 에서 deptno가 10 또는 20인 사원의
-- empno, ename, sal, deptno를 출력
select empno, ename, sal, deptno
from emp
where deptno in (10,20);
--where deptno=10 or deptno=20;


-- 서로 다른 조회 결과들을 합쳐줌
-- 단 조회한 컬럼의 개수,타입 같아야 한다
select empno, ename, sal, deptno
from emp
where deptno = 10

union

select empno, ename, sal, deptno
from emp
where deptno = 20;


-- union : 중복된 자료를 제거해준다
select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 10;

-- union all : 중복에 관계없이 합쳐진다
select empno, ename, sal, deptno
from emp
where deptno = 10
union all
select empno, ename, sal, deptno
from emp
where deptno = 10;

-- 여기서부터 문제 --
-- 1번
select * from emp
where ename like '%S';

--2번
select empno, ename,job,sal,deptno from emp
where deptno=30 and job='SALESMAN';

-- 3번
--집합연산자 사용
select empno, ename,job,sal,deptno from emp
where deptno=20 and sal>2000
union all
select empno, ename,job,sal,deptno from emp
where deptno=30 and sal>2000;

-- 집합연산자 사용X
select empno, ename,job,sal,deptno from emp
where deptno=20 and sal>2000;

select empno, ename,job,sal,deptno from emp
where deptno=30 and sal>2000;

--4번
select * from emp
where not(sal>=2000 and sal <= 3000);

--5번
select ename, empno, sal, deptno from emp
where ename like'%E%' 
    and deptno=30 
    and (sal not between 1000 and 2000);
    
--6번
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
    
-- length : 문자 길이    
-- dual : 임시테이블
select length('한'), lengthb('한') from dual;
    
    
--substr : 대상이 되는문자, 시작위치, 가져올 갯수
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


-- lpad : 대상이 되는 문자, 전체 자리수, 채울 문자
-- 채울 문자 생략시 공백 문자
select
    job,
    lpad(job,10,'#'),
    lpad(job,4,'#')
from emp;

-- 가운데 정렬 느낌
select
    job,
    rpad(lpad(job,length(job) + ((15-length(job))/2),'*'), ((15-length(job))/2) + length(job),'*')
from emp;


-- 문자열 더하기
select empno || ename || '님'
from emp;


-- trim : 앞 뒤 공백 제거
-- 글씨 사이의 공백은 제거하지 않음
select
    '  a b c           ',
    trim('  a b c           ')
    from dual;

--연습문제 1
select
    '210612-3123456',
    substr('210612-3123456',1,8) || '******' as "substr",
    rpad(substr('210621-3123456',8),length('210621-3123456'),'******') as "100점짜리 정답"
from dual;

--실습문제2
-- 사원의 이름을 앞에 2자리만 보이게 하고 나머지는 *로 표시
-- 정답의 예 : WARD ->> WA**, MARTIN -> MA****
-- 쉬운버전 : 앞 두글자 + '***'

select 
rpad(substr(ename,0,2),length(ename),'*') as "정식버전",
substr(ename,0,2) || '***' as "쉬운버전",
lpad(substr(ename,2,length(ename)),length(ename),'*') as "실습문제3",
substr(ename,1,1) || '*' || substr(ename,2,length(ename)) as "실습문제4",
substr(ename,1,length(ename)/2-0.5) || '*' ||substr(ename,(length(ename)/2+1.5),length(ename)) as "실습문제5"
from emp;

-- 실습문제3
-- 앞글자 하나만
-- WARD -> *ARD, MARTIN -> *ARTIN

-- 실습문제4
-- 두번쨰 글씨만 *
-- WARD -> W*RD, MARTIN -> M*RTIN

-- 실습문제5
-- 가운데 글씨만 *
-- MARTIN > MA*TIN, SCOTT > SC*TT