-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: crmnew
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `crm_bill`
--

DROP TABLE IF EXISTS `crm_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crm_bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_by` int(11) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_name` varchar(64) NOT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `update_name` varchar(64) DEFAULT NULL,
  `company_id` int(11) NOT NULL,
  `company_name` varchar(64) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `money` decimal(19,2) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `payDate` datetime DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `transaction_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_hmoge1yvga5ukdedr202oq4b6` (`transaction_id`),
  KEY `FK_t6b9w74ydo2f8nq7xqpyqk6dr` (`customer_id`),
  CONSTRAINT `FK_hmoge1yvga5ukdedr202oq4b6` FOREIGN KEY (`transaction_id`) REFERENCES `crm_transaction` (`id`),
  CONSTRAINT `FK_t6b9w74ydo2f8nq7xqpyqk6dr` FOREIGN KEY (`customer_id`) REFERENCES `customer_base` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crm_bill`
--

LOCK TABLES `crm_bill` WRITE;
/*!40000 ALTER TABLE `crm_bill` DISABLE KEYS */;
INSERT INTO `crm_bill` VALUES (1,1,'2017-06-04 10:43:23','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,10.00,'RCR',NULL,5,1,0),(2,1,'2017-06-05 15:43:14','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,0.01,'RCR',NULL,5,2,0),(3,1,'2017-06-05 15:49:34','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,0.01,'RCR',NULL,5,3,0),(4,1,'2017-06-05 15:52:34','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,0.01,'RCR',NULL,5,4,0),(5,1,'2017-06-05 15:58:02','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,0.01,'RCR',NULL,1,5,0),(6,1,'2017-06-05 16:01:35','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,0.01,'RCR',NULL,5,6,0),(7,1,'2017-06-05 16:03:02','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,0.01,'RCR',NULL,1,7,0),(8,1,'2017-06-08 16:41:34','超级管理员',NULL,NULL,NULL,1,'集团总公司',NULL,0.01,'RCR',NULL,1,8,0),(9,1,'2017-06-14 16:00:09','Roy',NULL,NULL,NULL,1,'集团总公司','服务项目 CT 缴费账单',220.00,'服务项目 CT 缴费账单',NULL,24,NULL,0),(12,1,'2017-06-14 16:24:06','Roy',NULL,NULL,NULL,1,'集团总公司','服务项目 血脂 缴费账单',10.00,'服务项目 血脂 缴费账单',NULL,24,NULL,0);
/*!40000 ALTER TABLE `crm_bill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-04 16:03:23
