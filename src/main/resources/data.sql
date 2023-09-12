DROP TABLE IF EXISTS customer;


-- DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `customer` (`first_name`,`last_name`,`street`,`address`,`city`,`state`,`email`,`phone`)
  VALUES('Shahbaz','Ahmed','Pahar ganj','ab340','new delhi','Delhi','shahbazkarimi123@gmail.com','123456789');


