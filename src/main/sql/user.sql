create database if not exists db_ssm character set utf8;

use db_ssm;

create table tb_user(
id int(10) auto_increment,
username varchar(20) not null,
password varchar(20) not null,
primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

insert into tb_user(id,username,password) values(1,'taoxf',123456);

