

create table ACCOUNTS(
num varchar(12) primary key,
holdername varchar(12),
balance int,
type varchar(10),
status varchar(12)
);

insert into ACCOUNTS values('1', 'nikita',22.22,'SAVING','ACTIVE');
insert into ACCOUNTS values('2', 'shubham',4477,'SAVING','ACTIVE');