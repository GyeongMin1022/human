CREATE TABLE 음식점 (
    음식점id NUMBER(20) NOT NULL,
    음식점이름 VARCHAR2(40) NULL,
    전화번호 VARCHAR2(40) NULL,
    음식점주소 VARCHAR2(40) NULL,
    CONSTRAINT PK_음식점 PRIMARY KEY (음식점id)
);

CREATE TABLE 메뉴 (
    메뉴_id NUMBER(20) NOT NULL,
    음식이름 VARCHAR2(30) NULL,
    음식가격 NUMBER(20) NULL,
    음식점id NUMBER(20) NOT NULL,
    CONSTRAINT PK_메뉴 PRIMARY KEY (메뉴_id)
);

CREATE TABLE 배송정보 (
    주문id NUMBER(20) NOT NULL,
    음식점id NUMBER(20) NOT NULL,
    주문회원id VARCHAR2(30) NOT NULL,
    주문주소 VARCHAR2(30) NULL,
    주문요청사항 VARCHAR2(100) NULL,
    주문_총_결제_금액 NUMBER(30) NULL,
    주문방식 VARCHAR2(30) NULL, 
    결제여부 VARCHAR2(30) NULL,
    주문시간 VARCHAR2(30) NULL,
    CONSTRAINT PK_배송정보 PRIMARY KEY (주문id)
);

CREATE TABLE 고객정보 (
    주문회원id VARCHAR2(30) NOT NULL,
    주문회원_주소 VARCHAR2(30) NULL,
    주문회원_전화번호 NUMBER(20) NULL,
    CONSTRAINT PK_고객정보 PRIMARY KEY (주문회원id)
);

CREATE TABLE 주문상세 (
    주문상세id NUMBER(20) NOT NULL,
    주문id NUMBER(20) NOT NULL,
    메뉴_id NUMBER(20) NOT NULL,
    CONSTRAINT PK_주문상세 PRIMARY KEY (주문상세id)
);

select * from 주문상세 join 메뉴 on 주문상세.메뉴_id = 메뉴.메뉴_id