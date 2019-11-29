-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 21, 2019 at 08:31 AM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_trip`
--

-- --------------------------------------------------------

--
-- Table structure for table `trip_journals`
--

DROP TABLE IF EXISTS `trip_journals`;
CREATE TABLE IF NOT EXISTS `trip_journals` (
  `truck_number` int(5) NOT NULL,
  `driver_number` int(9) NOT NULL,
  `co_driver_number` int(9) NOT NULL,
  `trip_number` int(3) NOT NULL,
  `date_departed` date NOT NULL,
  `date_returned` date NOT NULL,
  `state_code` varchar(2) NOT NULL,
  `miles_driven` int(5) NOT NULL,
  `fuel_receipt_number` int(9) NOT NULL,
  `gallons_purchased` int(3) NOT NULL,
  `taxes_paid` double NOT NULL,
  `station_name` varchar(10) NOT NULL,
  `station_street_location` varchar(20) NOT NULL,
  `station_city_location` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trip_journals`
--

INSERT INTO `trip_journals` (`truck_number`, `driver_number`, `co_driver_number`, `trip_number`, `date_departed`, `date_returned`, `state_code`, `miles_driven`, `fuel_receipt_number`, `gallons_purchased`, `taxes_paid`, `station_name`, `station_street_location`, `station_city_location`) VALUES
(22222, 987654320, 123456788, 987, '2018-08-13', '2019-08-14', 'NY', 23222, 111222333, 100, 50.44, 'SHELL', '64 location St', 'New York'),
(22233, 987654332, 123456788, 987, '2018-12-13', '2019-03-14', 'NY', 12345, 111222333, 100, 223.44, 'EXPRESS', '45 location St', 'Corber'),
(1231, 212144313, 343413331, 122, '2019-10-27', '2019-11-11', 'AL', 212121, 1241234, 125, 12.34, 'SHELL', 'Alaska Road', 'Alaska City'),
(3421, 123412342, 123421342, 213, '2019-10-28', '2019-11-28', 'ME', 2341, 123114214, 213, 232.23, 'SHELL', '551 rue Le Caro', 'Longueil'),
(1231, 212144313, 343413331, 122, '2019-10-27', '2019-11-11', 'AL', 212121, 1241234, 125, 12.34, 'SHELL', 'Alaska Road', 'Alaska City'),
(1231, 212144313, 343413331, 122, '2019-10-27', '2019-11-11', 'AL', 212121, 1241234, 125, 12.34, 'SHELL', 'Alaska Road', 'Alaska City');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
