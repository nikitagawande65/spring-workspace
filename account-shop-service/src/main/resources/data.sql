drop table accounts;


create table ACCOUNTS(
     username varchar(30) primary Key,
     password varchar(30),
     name varchar(30),
     email varchar(30),
     mobile varchar(30)
 );

 insert into ACCOUNTS values('user1','user1','User One','usr1@gmail.com','776242227');
 insert into ACCOUNTS values('user2','user2','User Two','usr2@gmail.com','928121427'); 