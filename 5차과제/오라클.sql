CREATE TABLE ������ (
    ������id NUMBER(20) NOT NULL,
    �������̸� VARCHAR2(40) NULL,
    ��ȭ��ȣ VARCHAR2(40) NULL,
    �������ּ� VARCHAR2(40) NULL,
    CONSTRAINT PK_������ PRIMARY KEY (������id)
);

CREATE TABLE �޴� (
    �޴�_id NUMBER(20) NOT NULL,
    �����̸� VARCHAR2(30) NULL,
    ���İ��� NUMBER(20) NULL,
    ������id NUMBER(20) NOT NULL,
    CONSTRAINT PK_�޴� PRIMARY KEY (�޴�_id)
);

CREATE TABLE ������� (
    �ֹ�id NUMBER(20) NOT NULL,
    ������id NUMBER(20) NOT NULL,
    �ֹ�ȸ��id VARCHAR2(30) NOT NULL,
    �ֹ��ּ� VARCHAR2(30) NULL,
    �ֹ���û���� VARCHAR2(100) NULL,
    �ֹ�_��_����_�ݾ� NUMBER(30) NULL,
    �ֹ���� VARCHAR2(30) NULL, 
    �������� VARCHAR2(30) NULL,
    �ֹ��ð� VARCHAR2(30) NULL,
    CONSTRAINT PK_������� PRIMARY KEY (�ֹ�id)
);

CREATE TABLE ������ (
    �ֹ�ȸ��id VARCHAR2(30) NOT NULL,
    �ֹ�ȸ��_�ּ� VARCHAR2(30) NULL,
    �ֹ�ȸ��_��ȭ��ȣ NUMBER(20) NULL,
    CONSTRAINT PK_������ PRIMARY KEY (�ֹ�ȸ��id)
);

CREATE TABLE �ֹ��� (
    �ֹ���id NUMBER(20) NOT NULL,
    �ֹ�id NUMBER(20) NOT NULL,
    �޴�_id NUMBER(20) NOT NULL,
    CONSTRAINT PK_�ֹ��� PRIMARY KEY (�ֹ���id)
);

select * from �ֹ��� join �޴� on �ֹ���.�޴�_id = �޴�.�޴�_id