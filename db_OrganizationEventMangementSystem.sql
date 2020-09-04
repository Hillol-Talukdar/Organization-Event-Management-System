CREATE DATABASE db_OrganizationEventMangementSystem;

use db_OrganizationEventMangementSystem;

CREATE TABLE tbl_organaization(

    organaizationId int AUTO_INCREMENT PRIMARY KEY,
    org_name varchar(100) not null UNIQUE,
	org_street varchar(100) not null,
	org_city varchar(100) not null,
	org_maxCapacity int not null,
	org_email varchar(40) not null UNIQUE,
	org_contactNumber varchar(15) not null UNIQUE
);

CREATE TABLE tbl_service(

    serviceId int AUTO_INCREMENT PRIMARY KEY,
    ser_type varchar(100) not null,
	ser_fees int not null,
    organaizationId int
);


CREATE table tbl_reservation(

    reservationId int AUTO_INCREMENT PRIMARY KEY,
    res_dateOfReservation varchar(20) not null,
    res_dateOfEvent varchar(20) not null,
	serviceId int,
    staffId int,
    customerId int
);

CREATE TABLE tbl_staff(

    staffId int PRIMARY KEY AUTO_INCREMENT,
    st_firstName varchar(40) not null,
    st_lastName varchar(40) not null,
    st_role varchar(40) not null,
    st_gender varchar(40) not null,
    st_nationalId varchar(40) not null UNIQUE,
    st_street varchar(40) not null,
    st_city varchar(40) not null,
    st_contactNumber varchar(15) not null UNIQUE,
	organaizationId int
);

CREATE TABLE tbl_customer(

    customerId int AUTO_INCREMENT PRIMARY KEY,
    cs_firstName varchar(40) not null,
    cs_lastName varchar(40) not null,
    cs_nationalId varchar(40) not null UNIQUE,
    cs_street varchar(40) not null,
    cs_city varchar(40) not null,
    cs_contactNumber varchar(15) not null UNIQUE
);

CREATE TABLE tbl_order(

    orderId int AUTO_INCREMENT PRIMARY KEY,
	or_quantity int not null,
	reservationId int,
	foodMenuId int
);

CREATE TABLE tbl_food_menu(
	
	foodMenuId int AUTO_INCREMENT PRIMARY KEY,
    fm_foodName varchar(100) not null,
	fm_price int 
);



ALTER TABLE tbl_service
ADD FOREIGN KEY (organaizationId) REFERENCES tbl_organaization(organaizationId);

ALTER TABLE tbl_reservation
ADD FOREIGN KEY (serviceId) REFERENCES tbl_service(serviceId);

ALTER TABLE tbl_reservation
ADD FOREIGN KEY (staffId) REFERENCES tbl_staff(staffId);

ALTER TABLE tbl_reservation
ADD FOREIGN KEY (customerId) REFERENCES tbl_customer(customerId);

ALTER TABLE tbl_staff
ADD FOREIGN KEY (organaizationId) REFERENCES tbl_organaization(organaizationId);

ALTER TABLE tbl_order
ADD FOREIGN KEY (reservationId) REFERENCES tbl_reservation(reservationId);

ALTER TABLE tbl_order
ADD FOREIGN KEY (foodMenuId) REFERENCES tbl_food_menu(foodMenuId);


/*
describe tbl_organaization;
describe tbl_service;
describe tbl_reservation;
describe tbl_staff;
describe tbl_customer;
describe tbl_order;
describe tbl_food_menu;
*/


/*
INSERT INTO tbl_organaization(org_name,org_street,org_city,org_MaxCapacity,org_email,org_contactNumber) VALUES ("Pach Vai","Zindabazar","Sylhet",500,"pvai@gmail.com",01111125684)
*/

/*
INSERT INTO tbl_service(ser_type,ser_fees,organaizationId) VALUES ('Party',4588,1)
*/

/*
INSERT INTO tbl_staff(st_firstName,st_lastName,st_role,st_gender,st_nationalId,st_street,st_city,st_contactNumber,organaizationId) VALUES('A','B','Cheff','Male',123,'S','Se',121,1)
*/

/*
INSERT INTO tbl_customer(cs_firstName,cs_lastName,cs_nationalId,cs_street,cs_city,cs_contactNumber) VALUES('avx','sds','125','mirpur','Dhaka',1056)
*/

/*
INSERT INTO tbl_reservation(res_dateOfReservation,res_dateOfEvent,serviceId,staffId,customerId) VALUES("2-10-2019","25-11-2019",1,1,1)
*/

/*
INSERT INTO tbl_order(or_quantity,reservationId,foodMenuId) VALUES(15,2,1)
*/


/*
INSERT INTO tbl_food_menu(fm_foodName,fm_price) VALUES("Grill",400)
*/


