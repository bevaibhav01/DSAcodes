//}
//    CREATE DATABASE VAIBHAV;
//        USE  VAIBHAV;
//        CREATE TABLE CUSTOMER(
//        customer_name varchar(255),
//        customer_id int,
//        mobile_model varchar(255),
//        mobile_id int,
//        primary key(mobile_id)
//
//        );
//        CREATE TABLE SHOP(
//        mobile_model varchar(2550),
//        mobile_id int,
//        FOREIGN KEY (mobile_id) references CUSTOMER(mobile_id)
//
//        );
//        INSERT INTO CUSTOMER VALUES("DEEP",23,"MOTO",134);
//        INSERT INTO CUSTOMER VALUES("RONAK",21,"MI",136);
//        INSERT INTO CUSTOMER VALUES("VIJU",233,"1+",135);
//        ALTER TABLE SHOP
//        ADD SHOP_ID INT;
//        select * from CUSTOMER;
//
//
//        DELETE FROM CUSTOMER
//        WHERE customer_name="SHAM";
//
//
//        SELECT*FROM CUSTOMER
//        WHERE customer_name="DEEP" AND mobile_model="MOTO";
//        SELECT*FROM CUSTOMER
//        WHERE customer_name="DEEP" OR mobile_model="MI";
//        SELECT*FROM CUSTOMER
//        WHERE NOT customer_name="DEEP";
//
//        UPDATE CUSTOMER
//        SET mobile_model="apple"
//        WHERE mobile_id=121;
//        DROP TABLE SHOP;
//
