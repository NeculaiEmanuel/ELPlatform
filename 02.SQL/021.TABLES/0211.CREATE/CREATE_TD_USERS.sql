CREATE TABLE TD_USERS (
  USERNAME  	VARCHAR2(30),
  PASSWORD  	VARCHAR2(300),
  EMAIL     	VARCHAR2(30) NOT NULL,
  FIRSTNAME 	VARCHAR2(30) NOT NULL,
  MIDDLENAME  	VARCHAR2(30),
  LASTNAME  	VARCHAR2(30) NOT NULL,
  COUNTRY   	VARCHAR2(30) NOT NULL,
  ADDRESS   	VARCHAR2(100)NOT NULL,
  PHONE     	VARCHAR2(30) NOT NULL,
  CONSTRAINT td_users_pk 		PRIMARY KEY(USERNAME),
  CONSTRAINT td_users_email_uq  UNIQUE(EMAIL),
  CONSTRAINT td_users_uq  		UNIQUE(FIRSTNAME,MIDDLENAME,LASTNAME,COUNTRY)
  );
  