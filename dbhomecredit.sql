-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 05, 2019 at 10:38 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbhomecredit`
--

-- --------------------------------------------------------

--
-- Table structure for table `flashsale`
--

CREATE TABLE `flashsale` (
  `flashsaleid` int(11) NOT NULL,
  `namaflashsale` varchar(50) NOT NULL,
  `besarflashsale` double NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `kategoriid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flashsale`
--

INSERT INTO `flashsale` (`flashsaleid`, `namaflashsale`, `besarflashsale`, `startdate`, `enddate`, `deskripsi`, `kategoriid`) VALUES
(1, 'Flashal22', 30000, '2019-09-17', '2019-09-21', 'Mantap', 1);

-- --------------------------------------------------------

--
-- Table structure for table `historitransaksi`
--

CREATE TABLE `historitransaksi` (
  `idhistoritransaksi` int(11) NOT NULL,
  `orderid` int(11) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kategoridiskon`
--

CREATE TABLE `kategoridiskon` (
  `kategoriid` int(11) NOT NULL,
  `tipe` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kategoridiskon`
--

INSERT INTO `kategoridiskon` (`kategoriid`, `tipe`) VALUES
(1, 'Promo'),
(2, 'Flashsale');

-- --------------------------------------------------------

--
-- Table structure for table `modulekategori`
--

CREATE TABLE `modulekategori` (
  `moduleid` int(11) NOT NULL,
  `namamodule` varchar(200) NOT NULL,
  `moduleorder` int(11) NOT NULL,
  `usergroupid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `modulekategori`
--

INSERT INTO `modulekategori` (`moduleid`, `namamodule`, `moduleorder`, `usergroupid`) VALUES
(1, 'PromoCard', 1, 1),
(2, 'CategoryCard', 2, 1),
(3, 'FlashsaleCard', 3, 1),
(4, 'HistoryCard', 4, 1),
(5, 'NewsCard', 5, 1),
(6, 'PromoCard', 1, 2),
(7, 'NewsCard', 2, 2),
(8, 'FlashsaleCard', 3, 2),
(9, 'CategoryCard', 4, 2),
(10, 'NewsCard', 5, 2),
(11, 'PromoCard', 1, 3),
(12, 'FlashsaleCard', 2, 3),
(13, 'CategoryCard', 3, 3),
(14, 'NewsCard', 4, 3),
(15, 'HistoryCard', 5, 3);

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `idnews` int(11) NOT NULL,
  `namanews` varchar(80) NOT NULL,
  `contentnews` varchar(200) NOT NULL,
  `tglnews` date NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`idnews`, `namanews`, `contentnews`, `tglnews`, `status`) VALUES
(1, 'News', 'Neswn xxxxxx', '2019-09-02', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `orderid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `potongan` double NOT NULL,
  `totalharga` double NOT NULL,
  `jlhorder` int(11) NOT NULL,
  `tglorder` date NOT NULL,
  `produkid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`orderid`, `userid`, `potongan`, `totalharga`, `jlhorder`, `tglorder`, `produkid`) VALUES
(1, 1, 20, 20000, 2, '2019-09-19', 1);

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `produkid` int(11) NOT NULL,
  `namaproduk` varchar(100) NOT NULL,
  `jlhproduk` int(11) NOT NULL,
  `deskripsiproduk` varchar(200) NOT NULL,
  `hargaproduk` double NOT NULL,
  `kategoriid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`produkid`, `namaproduk`, `jlhproduk`, `deskripsiproduk`, `hargaproduk`, `kategoriid`) VALUES
(1, 'Pulpen', 20, 'mantap', 20000, 1),
(2, 'Buku', 30, 'Bagus', 300000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `promo`
--

CREATE TABLE `promo` (
  `promoid` int(11) UNSIGNED NOT NULL,
  `namapromo` varchar(200) NOT NULL,
  `besarpromo` double NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  `deskripsipromo` varchar(255) NOT NULL,
  `kategoriid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `promo`
--

INSERT INTO `promo` (`promoid`, `namapromo`, `besarpromo`, `startdate`, `enddate`, `deskripsipromo`, `kategoriid`) VALUES
(1, 'Flashsale', 2000, '2019-08-12', '2019-08-27', 'Bagusssss', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `usergroupid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `username`, `password`, `usergroupid`) VALUES
(1, 'oppir', 'hutapea', 1),
(2, 'budi', 'hutauruk', 2),
(3, 'rodes', 'sirait', 3);

-- --------------------------------------------------------

--
-- Table structure for table `usergrouping`
--

CREATE TABLE `usergrouping` (
  `usergroupid` int(11) NOT NULL,
  `roles` varbinary(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usergrouping`
--

INSERT INTO `usergrouping` (`usergroupid`, `roles`) VALUES
(1, 0x7573657241),
(2, 0x5573657242),
(3, 0x5573657243);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `flashsale`
--
ALTER TABLE `flashsale`
  ADD PRIMARY KEY (`flashsaleid`),
  ADD KEY `kategoriid` (`kategoriid`);

--
-- Indexes for table `historitransaksi`
--
ALTER TABLE `historitransaksi`
  ADD PRIMARY KEY (`idhistoritransaksi`),
  ADD KEY `orderid` (`orderid`);

--
-- Indexes for table `kategoridiskon`
--
ALTER TABLE `kategoridiskon`
  ADD PRIMARY KEY (`kategoriid`);

--
-- Indexes for table `modulekategori`
--
ALTER TABLE `modulekategori`
  ADD PRIMARY KEY (`moduleid`),
  ADD KEY `usergroupid` (`usergroupid`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`idnews`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`orderid`),
  ADD KEY `userid` (`userid`),
  ADD KEY `produkid` (`produkid`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`produkid`),
  ADD KEY `kategoriid` (`kategoriid`);

--
-- Indexes for table `promo`
--
ALTER TABLE `promo`
  ADD PRIMARY KEY (`promoid`),
  ADD KEY `kategoriid` (`kategoriid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`),
  ADD KEY `usergroupid` (`usergroupid`);

--
-- Indexes for table `usergrouping`
--
ALTER TABLE `usergrouping`
  ADD PRIMARY KEY (`usergroupid`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `flashsale`
--
ALTER TABLE `flashsale`
  ADD CONSTRAINT `flashsale_ibfk_1` FOREIGN KEY (`kategoriid`) REFERENCES `kategoridiskon` (`kategoriid`);

--
-- Constraints for table `historitransaksi`
--
ALTER TABLE `historitransaksi`
  ADD CONSTRAINT `historitransaksi_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `order` (`orderid`);

--
-- Constraints for table `modulekategori`
--
ALTER TABLE `modulekategori`
  ADD CONSTRAINT `modulekategori_ibfk_1` FOREIGN KEY (`usergroupid`) REFERENCES `usergrouping` (`usergroupid`);

--
-- Constraints for table `order`
--
ALTER TABLE `order`
  ADD CONSTRAINT `order_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`),
  ADD CONSTRAINT `order_ibfk_2` FOREIGN KEY (`produkid`) REFERENCES `produk` (`produkid`);

--
-- Constraints for table `produk`
--
ALTER TABLE `produk`
  ADD CONSTRAINT `produk_ibfk_1` FOREIGN KEY (`kategoriid`) REFERENCES `kategoridiskon` (`kategoriid`);

--
-- Constraints for table `promo`
--
ALTER TABLE `promo`
  ADD CONSTRAINT `promo_ibfk_1` FOREIGN KEY (`kategoriid`) REFERENCES `kategoridiskon` (`kategoriid`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`usergroupid`) REFERENCES `usergrouping` (`usergroupid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
