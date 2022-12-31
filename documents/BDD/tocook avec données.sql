-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2022 at 06:10 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tocook`
--

-- --------------------------------------------------------

--
-- Table structure for table `categorie_csa`
--

CREATE TABLE `categorie_csa` (
  `code` varchar(2) NOT NULL,
  `libelle` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categorie_csa`
--

INSERT INTO `categorie_csa` (`code`, `libelle`) VALUES
('10', 'Déconseillé - 10 ans'),
('12', 'Déconseillé - 12 ans'),
('16', 'Déconseillé - 16 ans'),
('18', 'Déconseillé - 18 ans'),
('TP', 'Tout public');

-- --------------------------------------------------------

--
-- Table structure for table `diffusion`
--

CREATE TABLE `diffusion` (
  `Id_Diffusion` int(11) NOT NULL,
  `jour` date DEFAULT NULL,
  `horaire` time DEFAULT NULL,
  `direct` tinyint(1) DEFAULT NULL,
  `Id_Emission` int(11) NOT NULL,
  `Id_Programme` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `diffusion`
--

INSERT INTO `diffusion` (`Id_Diffusion`, `jour`, `horaire`, `direct`, `Id_Emission`, `Id_Programme`) VALUES
(1, '2022-12-24', '23:59:59', NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `emission`
--

CREATE TABLE `emission` (
  `Id_Emission` int(11) NOT NULL,
  `titre` varchar(150) DEFAULT NULL,
  `titre_original` varchar(150) DEFAULT NULL,
  `annee_production` int(11) DEFAULT NULL,
  `num_saison` int(11) DEFAULT NULL,
  `code_origine` varchar(3) NOT NULL,
  `code_genre` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emission`
--

INSERT INTO `emission` (`Id_Emission`, `titre`, `titre_original`, `annee_production`, `num_saison`, `code_origine`, `code_genre`) VALUES
(1, 'Chefs Saison 1', NULL, 2015, 1, 'OEF', 'SAI'),
(2, 'Chefs Saison 2', NULL, 2016, 1, 'OEF', 'SAI');

-- --------------------------------------------------------

--
-- Table structure for table `genre`
--

CREATE TABLE `genre` (
  `code` varchar(3) NOT NULL,
  `libelle` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `genre`
--

INSERT INTO `genre` (`code`, `libelle`) VALUES
('ANI', 'Animation'),
('BAN', 'Bande Annonce'),
('DOC', 'Documentaire'),
('ECU', 'Emission Culinaire'),
('FIC', 'Fiction'),
('PUB', 'Publicité'),
('SAI', 'Saison de série');

-- --------------------------------------------------------

--
-- Table structure for table `origine`
--

CREATE TABLE `origine` (
  `code` varchar(3) NOT NULL,
  `libelle` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `origine`
--

INSERT INTO `origine` (`code`, `libelle`) VALUES
('OAU', 'Australie'),
('OEF', 'oef'),
('OEU', 'Europe');

-- --------------------------------------------------------

--
-- Table structure for table `programme`
--

CREATE TABLE `programme` (
  `Id_Programme` int(11) NOT NULL,
  `Id_Emission` int(11) NOT NULL,
  `titre` varchar(150) DEFAULT NULL,
  `duree` int(11) DEFAULT NULL,
  `code` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `programme`
--

INSERT INTO `programme` (`Id_Programme`, `Id_Emission`, `titre`, `duree`, `code`) VALUES
(1, 1, 'Episode 1', 54, 'TP'),
(2, 2, 'Episode 1', 57, 'TP'),
(3, 1, 'Episode 2', 50, 'TP');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categorie_csa`
--
ALTER TABLE `categorie_csa`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `diffusion`
--
ALTER TABLE `diffusion`
  ADD PRIMARY KEY (`Id_Diffusion`),
  ADD KEY `Id_Programme` (`Id_Programme`,`Id_Emission`);

--
-- Indexes for table `emission`
--
ALTER TABLE `emission`
  ADD PRIMARY KEY (`Id_Emission`),
  ADD KEY `code` (`code_origine`),
  ADD KEY `code_1` (`code_genre`);

--
-- Indexes for table `genre`
--
ALTER TABLE `genre`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `origine`
--
ALTER TABLE `origine`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `programme`
--
ALTER TABLE `programme`
  ADD PRIMARY KEY (`Id_Programme`,`Id_Emission`),
  ADD KEY `Id_Emission` (`Id_Emission`),
  ADD KEY `code` (`code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diffusion`
--
ALTER TABLE `diffusion`
  MODIFY `Id_Diffusion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `emission`
--
ALTER TABLE `emission`
  MODIFY `Id_Emission` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `programme`
--
ALTER TABLE `programme`
  MODIFY `Id_Programme` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `diffusion`
--
ALTER TABLE `diffusion`
  ADD CONSTRAINT `diffusion_ibfk_1` FOREIGN KEY (`Id_Programme`,`Id_Emission`) REFERENCES `programme` (`Id_Programme`, `Id_Emission`);

--
-- Constraints for table `emission`
--
ALTER TABLE `emission`
  ADD CONSTRAINT `emission_ibfk_1` FOREIGN KEY (`code_origine`) REFERENCES `origine` (`code`),
  ADD CONSTRAINT `emission_ibfk_2` FOREIGN KEY (`code_genre`) REFERENCES `genre` (`code`);

--
-- Constraints for table `programme`
--
ALTER TABLE `programme`
  ADD CONSTRAINT `programme_ibfk_1` FOREIGN KEY (`Id_Emission`) REFERENCES `emission` (`Id_Emission`),
  ADD CONSTRAINT `programme_ibfk_2` FOREIGN KEY (`code`) REFERENCES `categorie_csa` (`code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
