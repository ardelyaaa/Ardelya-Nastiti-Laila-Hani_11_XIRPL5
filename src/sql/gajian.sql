-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2017 at 01:03 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gajian`
--

-- --------------------------------------------------------

--
-- Table structure for table `gajii`
--

CREATE TABLE `gajii` (
  `nama` varchar(200) NOT NULL,
  `lamabekerja` varchar(200) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `lembur` varchar(200) NOT NULL,
  `haribekerja` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gajii`
--

INSERT INTO `gajii` (`nama`, `lamabekerja`, `jabatan`, `lembur`, `haribekerja`) VALUES
('dsfdaf', 'adkjahsd', 'Personalia', 'asdas', 'werwr'),
('dsfdaf', 'adkjahsd', 'Personalia', 'asdas', 'werwr'),
('dsfdaf', 'adkjahsd', 'Personalia', 'asdas', 'werwr'),
('dsfdaf', 'adkjahsd', 'Personalia', 'asdas', 'werwr'),
('ad', '33', 'Manager', '43', '11'),
('aear', '22', 'Kabag', '67', '90'),
('ad', '12', '100000', '86', '90876'),
('ardelya', '1', '10000000', '23', '56'),
('q', '1', '10000000', '4', '33'),
('w', '2', '3000000', '5', '11'),
('r', '1', '10000000', '9', '122'),
('des', '5', '10000000', '89', '234'),
('qwe', '9', '3000000', '67', '99'),
('ardelya', '5', '10000000', '9', '90'),
('', '', '10000000', '', ''),
('ardelya', '7', '6000000', '8', '5'),
('stg', '3thn', '10000000', '2', '28'),
('ghjk', '12', '3000000', '3', '22'),
('', 'a', '3000000', '4', '1'),
('', 'a', '3000000', '4', '1'),
('', 'a', '3000000', '4', '1'),
('', '', 'null', '', ''),
('', '', 'null', '', ''),
('a', '2', '3000000', 'd', ''),
('a', '2', '3000000', 'd', ''),
('a', '2', '3000000', 'd', ''),
('w', '', '10000000', '09', '8'),
('w', '', '10000000', '09', '8'),
('d', '', '10000000', '8', '4'),
('d', '', '10000000', '8', '4'),
('d', '', '10000000', '8', '4'),
('d', '', '10000000', '8', '4'),
('', '7', '3000000', '9', '4'),
('', '7', '3000000', '9', '4'),
('', '7', '3000000', '9', '4'),
('', '7', '3000000', '9', '4'),
('', '', '3000000', '', ''),
('a', '', '3000000', '5', '7'),
('a', '', '3000000', '5', '7'),
('a', '', '3000000', '5', '7'),
('a', '5', '3000000', '3', '2'),
('f', '3', '10000000', '2', '3'),
('a', '4', '10000000', '9', '10'),
('a', '4', '3000000', '77', '3'),
('ardelya', '10', '10000000', '7', '30'),
('a', '4', '3000000', '6', '3');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `user` varchar(200) NOT NULL,
  `password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`user`, `password`) VALUES
('admin', 12345);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
