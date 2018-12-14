-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema safari
--

CREATE DATABASE IF NOT EXISTS safari;
USE safari;

--
-- Definition of table `offers`
--

DROP TABLE IF EXISTS `offers`;
CREATE TABLE `offers` (
  `offer_id` int(10) unsigned NOT NULL auto_increment,
  `place` varchar(45) NOT NULL,
  `duration` int(10) unsigned default NULL,
  `stars` int(10) unsigned NOT NULL,
  `transportation` varchar(45) NOT NULL,
  `cost` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`offer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `offers`
--

/*!40000 ALTER TABLE `offers` DISABLE KEYS */;
INSERT INTO `offers` (`offer_id`,`place`,`duration`,`stars`,`transportation`,`cost`) VALUES 
 (1,'Sharm El_Sheikh',5,4,'Superjet',1350);
/*!40000 ALTER TABLE `offers` ENABLE KEYS */;


--
-- Definition of table `special_offers`
--

DROP TABLE IF EXISTS `special_offers`;
CREATE TABLE `special_offers` (
  `sp_offer_id` int(10) unsigned NOT NULL auto_increment,
  `place` varchar(45) NOT NULL,
  `duration` int(10) unsigned NOT NULL,
  `stars` int(10) unsigned NOT NULL,
  `transportation` varchar(45) NOT NULL,
  `cost` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`sp_offer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `special_offers`
--

/*!40000 ALTER TABLE `special_offers` DISABLE KEYS */;
INSERT INTO `special_offers` (`sp_offer_id`,`place`,`duration`,`stars`,`transportation`,`cost`) VALUES 
 (12,'cairo',4,4,'superjet',500);
/*!40000 ALTER TABLE `special_offers` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL auto_increment,
  `email` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `offer_id` int(10) unsigned zerofill default NULL,
  `sp_offer_id` int(10) unsigned zerofill default NULL,
  PRIMARY KEY  (`user_id`),
  KEY `offer_id` (`offer_id`),
  KEY `sp_offer_id` (`sp_offer_id`),
  CONSTRAINT `offer_id` FOREIGN KEY (`offer_id`) REFERENCES `offers` (`offer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sp_offer_id` FOREIGN KEY (`sp_offer_id`) REFERENCES `special_offers` (`sp_offer_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`,`email`,`phone`,`password`,`offer_id`,`sp_offer_id`) VALUES 
 (1,'mahmoud@gmail.com','0102365485','12333145',0000000001,NULL),
 (2,'asd','233','15236',0000000001,0000000001),
 (3,'asd','233','15236',NULL,0000000001);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `user_name`
--

DROP TABLE IF EXISTS `user_name`;
CREATE TABLE `user_name` (
  `user_id` int(10) unsigned NOT NULL auto_increment,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY  (`user_id`),
  CONSTRAINT `email` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_name`
--

/*!40000 ALTER TABLE `user_name` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_name` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
