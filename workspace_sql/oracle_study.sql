-- emp_ew 테이블 생성
create table emp_hw(
empno number(4),   -- 숫자 4자리
ename varchar2(10), -- 10바이트
job varchar2(9),    -- 제한보다 적은 글씨가 적히면 글씨 만큼의 공간만 차지
mgr number(4),
hiredate date,
sal number(7,2), -- 2는 소수점 둘째 자리까지 표시 할 수 있다
comm number(7,2),
deptno number(2)
);


-- bigo 열 추가
alter table emp_hw
add bigo varchar2(20);

alter table emp_hw
modify bigo varchar2(30);

--
alter table emp_hw
rename column bigo to remark;

desc emp_hw;
select * from emp_hw;

alter table emp_hw
drop column remark;

insert into emp_hw
select * from emp;

alter table emp_hw
add remark varchar2(30);

select * from emp_hw;

select count(*),comm from emp group by comm;