-- emp_ew ���̺� ����
create table emp_hw(
empno number(4),   -- ���� 4�ڸ�
ename varchar2(10), -- 10����Ʈ
job varchar2(9),    -- ���Ѻ��� ���� �۾��� ������ �۾� ��ŭ�� ������ ����
mgr number(4),
hiredate date,
sal number(7,2), -- 2�� �Ҽ��� ��° �ڸ����� ǥ�� �� �� �ִ�
comm number(7,2),
deptno number(2)
);


-- bigo �� �߰�
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