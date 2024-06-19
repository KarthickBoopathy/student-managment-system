CREATE TABLE if not exists student (
id int8 NOT NULL,
name varchar(250) NOT NULL,
course varchar(250),
duration varchar(250),
isActive bool NULL,
isFeePaid bool NULL,
CONSTRAINT student_pkey PRIMARY KEY (id)
);