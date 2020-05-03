-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 03, 2020 at 05:01 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `markets`
--

-- --------------------------------------------------------

--
-- Table structure for table `market_data`
--

CREATE TABLE `market_data` (
  `id` bigint(20) NOT NULL,
  `abschange` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `perchange` double DEFAULT NULL,
  `time` time DEFAULT NULL,
  `value` double DEFAULT NULL,
  `volume` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `market_data`
--

INSERT INTO `market_data` (`id`, `abschange`, `date`, `name`, `perchange`, `time`, `value`, `volume`) VALUES
(5, -2.55, '2020-05-02', 'Dow Jones Industrial Average', -622.03, '20:29:35', 23723.69, 421592919),
(6, -3.2, '2020-05-02', 'NASDAQ Composite', -284.6, '20:29:35', 8604.95, 869697649),
(7, -2.81, '2020-05-02', 'S&P 500 Index', -81.72, '20:29:35', 2830.71, NULL),
(8, 16, '2020-05-02', 'Gold COMEX (Jun\'20)', 0.9444, '20:29:35', 1710.2, 165082),
(9, 0.85, '2020-05-02', 'WTI Crude (Jun\'20)', 4.51, '20:29:35', 19.69, 368386),
(10, 0.0028, '2020-05-02', 'EUR/USD', 0.25, '20:29:35', 1.0983, 0),
(11, 3.04, '2020-05-02', 'CBOE Volatility Index', 8.9, '20:29:35', 37.19, NULL),
(12, -2.76, '2020-05-02', 'NYSE Composite', -313.77, '20:29:35', 11058.57, NULL),
(13, -3.83, '2020-05-02', 'Russell 2000 Index', -50.18, '20:29:35', 1260.48, 0),
(14, 0.092, '2020-05-02', 'Silver COMEX (Jul\'20)', 0.61, '20:29:35', 15.065, 31410),
(15, -2.55, '2020-05-02', 'Dow Jones Industrial Average', -622.03, '22:27:08', 23723.69, 421592919),
(16, -3.2, '2020-05-02', 'NASDAQ Composite', -284.6, '22:27:08', 8604.95, 869697649),
(17, -2.81, '2020-05-02', 'S&P 500 Index', -81.72, '22:27:08', 2830.71, NULL),
(18, 16, '2020-05-02', 'Gold COMEX (Jun\'20)', 0.9444, '22:27:08', 1710.2, 165082),
(19, 0.85, '2020-05-02', 'WTI Crude (Jun\'20)', 4.51, '22:27:08', 19.69, 368386),
(20, 0.0028, '2020-05-02', 'EUR/USD', 0.25, '22:27:08', 1.0983, 0),
(21, 3.04, '2020-05-02', 'CBOE Volatility Index', 8.9, '22:27:08', 37.19, NULL),
(22, -2.76, '2020-05-02', 'NYSE Composite', -313.77, '22:27:08', 11058.57, NULL),
(23, -3.83, '2020-05-02', 'Russell 2000 Index', -50.18, '22:27:08', 1260.48, 0),
(24, 0.092, '2020-05-02', 'Silver COMEX (Jul\'20)', 0.61, '22:27:08', 15.065, 31410),
(25, -2.56, '2020-05-03', 'Dow Jones Industrial Average', -622.03, '00:11:40', 23723.69, 421592919),
(26, -3.2, '2020-05-03', 'NASDAQ Composite', -284.6, '00:11:40', 8604.95, 869697649),
(27, -2.81, '2020-05-03', 'S&P 500 Index', -81.72, '00:11:40', 2830.71, NULL),
(28, 16, '2020-05-03', 'Gold COMEX (Jun\'20)', 0.9444, '00:11:40', 1710.2, 165082),
(29, 0.85, '2020-05-03', 'WTI Crude (Jun\'20)', 4.51, '00:11:40', 19.69, 368386),
(30, 0.0028, '2020-05-03', 'EUR/USD', 0.25, '00:11:40', 1.0983, 0),
(31, 3.04, '2020-05-03', 'CBOE Volatility Index', 8.9, '00:11:40', 37.19, NULL),
(32, -2.76, '2020-05-03', 'NYSE Composite', -313.77, '00:11:40', 11058.57, NULL),
(33, -3.83, '2020-05-03', 'Russell 2000 Index', -50.18, '00:11:40', 1260.48, 0),
(34, 0.092, '2020-05-03', 'Silver COMEX (Jul\'20)', 0.61, '00:11:40', 15.065, 31410),
(35, -2.56, '2020-05-03', 'Dow Jones Industrial Average', -622.03, '00:12:40', 23723.69, 421592919),
(36, -3.2, '2020-05-03', 'NASDAQ Composite', -284.6, '00:12:40', 8604.95, 869697649),
(37, -2.81, '2020-05-03', 'S&P 500 Index', -81.72, '00:12:40', 2830.71, NULL),
(38, 16, '2020-05-03', 'Gold COMEX (Jun\'20)', 0.9444, '00:12:40', 1710.2, 165082),
(39, 0.85, '2020-05-03', 'WTI Crude (Jun\'20)', 4.51, '00:12:40', 19.69, 368386),
(40, 0.0028, '2020-05-03', 'EUR/USD', 0.25, '00:12:40', 1.0983, 0),
(41, 3.04, '2020-05-03', 'CBOE Volatility Index', 8.9, '00:12:40', 37.19, NULL),
(42, -2.76, '2020-05-03', 'NYSE Composite', -313.77, '00:12:40', 11058.57, NULL),
(43, -3.83, '2020-05-03', 'Russell 2000 Index', -50.18, '00:12:40', 1260.48, 0),
(44, 0.092, '2020-05-03', 'Silver COMEX (Jul\'20)', 0.61, '00:12:40', 15.065, 31410),
(45, -2.56, '2020-05-03', 'Dow Jones Industrial Average', -622.03, '00:13:40', 23723.69, 421592919),
(46, -3.2, '2020-05-03', 'NASDAQ Composite', -284.6, '00:13:40', 8604.95, 869697649),
(47, -2.81, '2020-05-03', 'S&P 500 Index', -81.72, '00:13:40', 2830.71, NULL),
(48, 16, '2020-05-03', 'Gold COMEX (Jun\'20)', 0.9444, '00:13:40', 1710.2, 165082),
(49, 0.85, '2020-05-03', 'WTI Crude (Jun\'20)', 4.51, '00:13:40', 19.69, 368386),
(50, 0.0028, '2020-05-03', 'EUR/USD', 0.25, '00:13:40', 1.0983, 0),
(51, 3.04, '2020-05-03', 'CBOE Volatility Index', 8.9, '00:13:40', 37.19, NULL),
(52, -2.76, '2020-05-03', 'NYSE Composite', -313.77, '00:13:40', 11058.57, NULL),
(53, -3.83, '2020-05-03', 'Russell 2000 Index', -50.18, '00:13:40', 1260.48, 0),
(54, 0.092, '2020-05-03', 'Silver COMEX (Jul\'20)', 0.61, '00:13:40', 15.065, 31410);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `market_data`
--
ALTER TABLE `market_data`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `market_data`
--
ALTER TABLE `market_data`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=165;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
