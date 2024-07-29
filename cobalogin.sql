-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cobalogin
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `akun`
--

DROP TABLE IF EXISTS `akun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `akun` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `akun`
--

LOCK TABLES `akun` WRITE;
/*!40000 ALTER TABLE `akun` DISABLE KEYS */;
INSERT INTO `akun` VALUES (1,'ani','ani','123','ani@gmail.com','2024-06-25 15:06:54','2024-06-25 15:06:54'),(2,'nurul','nurul','123','nurul@gmail.com','2024-06-25 16:29:47','2024-06-25 16:29:47'),(3,'bagas','bagas','123','bagas@gmail.com','2024-06-25 16:30:04','2024-06-25 16:30:04'),(5,'GAB','gab','123','gab@gmail.com','2024-06-26 00:46:51','2024-06-26 00:46:51'),(6,'Tororo','Tororo','123','tororo@gmail.com','2024-06-26 02:20:44','2024-06-26 02:20:44'),(7,'gab','gabriel','GnD','gab','2024-06-28 04:21:55','2024-06-28 04:21:55'),(12,'masGab','ggg','gab','mankigab@gmail.com','2024-07-09 12:20:47','2024-07-09 12:20:47'),(13,'0','0','0','0','2024-07-09 12:30:37','2024-07-09 12:30:37'),(14,'9','9','9','9','2024-07-09 12:32:35','2024-07-09 12:32:35'),(15,'6','6','6','6','2024-07-09 12:34:14','2024-07-09 12:34:14');
/*!40000 ALTER TABLE `akun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daftar_acara`
--

DROP TABLE IF EXISTS `daftar_acara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daftar_acara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(45) NOT NULL,
  `jenis` varchar(45) NOT NULL,
  `tanggal_pelaksanaan` varchar(45) NOT NULL,
  `harga` int(11) NOT NULL,
  `kapasitas` int(11) NOT NULL,
  `lokasi` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daftar_acara`
--

LOCK TABLES `daftar_acara` WRITE;
/*!40000 ALTER TABLE `daftar_acara` DISABLE KEYS */;
INSERT INTO `daftar_acara` VALUES (1,'SOD','Konser','2024-07-07',150000,996,'Surabaya'),(13,'Symphony of Dreams','Konser','2024-07-12',10000,199,'Surabaya'),(14,'Megadeth Tour','Konser','2024-07-12',875000,1600,'Jakarta'),(15,'Arty','Seni','2024-07-11',15000,199,'Sidoarjo'),(16,'ChibiCon','Pameran','2024-07-09',100000,999,'Yogyakarta');
/*!40000 ALTER TABLE `daftar_acara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daftar_parkir`
--

DROP TABLE IF EXISTS `daftar_parkir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daftar_parkir` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lokasi` varchar(45) NOT NULL,
  `kapasitas` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daftar_parkir`
--

LOCK TABLES `daftar_parkir` WRITE;
/*!40000 ALTER TABLE `daftar_parkir` DISABLE KEYS */;
INSERT INTO `daftar_parkir` VALUES (1,'Transmart Rungkut',100),(2,'Tunjungan Plaza',250),(3,'Ubaya',475),(4,'Royal Plaza VIP',15);
/*!40000 ALTER TABLE `daftar_parkir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservasi_acara`
--

DROP TABLE IF EXISTS `reservasi_acara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservasi_acara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `akun_id` int(11) NOT NULL,
  `daftar_acara_id` int(11) NOT NULL,
  `total` int(12) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_reservasi_acara_akun_idx` (`akun_id`),
  KEY `fk_reservasi_acara_daftar_acara1_idx` (`daftar_acara_id`),
  CONSTRAINT `fk_reservasi_acara_akun` FOREIGN KEY (`akun_id`) REFERENCES `akun` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservasi_acara_daftar_acara1` FOREIGN KEY (`daftar_acara_id`) REFERENCES `daftar_acara` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservasi_acara`
--

LOCK TABLES `reservasi_acara` WRITE;
/*!40000 ALTER TABLE `reservasi_acara` DISABLE KEYS */;
INSERT INTO `reservasi_acara` VALUES (18,5,13,10000),(19,5,16,100000),(20,5,15,15000);
/*!40000 ALTER TABLE `reservasi_acara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservasi_parkir`
--

DROP TABLE IF EXISTS `reservasi_parkir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservasi_parkir` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no_plat` varchar(45) NOT NULL,
  `harga` varchar(45) NOT NULL,
  `no_parkir` varchar(45) NOT NULL,
  `tanggal` varchar(45) NOT NULL,
  `akun_id` int(11) NOT NULL,
  `daftar_parkir_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_reservasi_parkir_akun1_idx` (`akun_id`),
  KEY `fk_reservasi_parkir_daftar_parkir1_idx` (`daftar_parkir_id`),
  CONSTRAINT `fk_reservasi_parkir_akun1` FOREIGN KEY (`akun_id`) REFERENCES `akun` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservasi_parkir_daftar_parkir1` FOREIGN KEY (`daftar_parkir_id`) REFERENCES `daftar_parkir` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservasi_parkir`
--

LOCK TABLES `reservasi_parkir` WRITE;
/*!40000 ALTER TABLE `reservasi_parkir` DISABLE KEYS */;
INSERT INTO `reservasi_parkir` VALUES (15,'L 1234 SSS','4','6','2024-07-10',12,4),(16,'L 0000 S','4','4','2024-07-12',13,4),(17,'4545454545','3','16','2024-07-17',15,3),(18,'L 2436 BAE','4','3','2024-07-18',5,4);
/*!40000 ALTER TABLE `reservasi_parkir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiket`
--

DROP TABLE IF EXISTS `tiket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiket` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kode` varchar(45) NOT NULL,
  `status` enum('CLAIM','NOCLAIM') DEFAULT 'NOCLAIM',
  `reservasi_acara_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_tiket_reservasi_acara1_idx` (`reservasi_acara_id`),
  CONSTRAINT `fk_tiket_reservasi_acara1` FOREIGN KEY (`reservasi_acara_id`) REFERENCES `reservasi_acara` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiket`
--

LOCK TABLES `tiket` WRITE;
/*!40000 ALTER TABLE `tiket` DISABLE KEYS */;
INSERT INTO `tiket` VALUES (27,'WY3000','NOCLAIM',18),(28,'QT2785','CLAIM',19),(29,'MC8642','NOCLAIM',20);
/*!40000 ALTER TABLE `tiket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-09 19:55:23
