-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 02 juin 2021 à 16:38
-- Version du serveur :  8.0.18
-- Version de PHP :  7.4.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `mediatek86`
--

CREATE DATABASE mediatek86;
USE mediatek86;

--
-- Utilisateur de la base de données
--

CREATE USER 'Jean-Bernard-Minet'@'localhost' IDENTIFIED BY 'ViveLaSIO';
GRANT ALL PRIVILEGES ON mediatek86.* TO 'Jean-Bernard-Minet'@'localhost';

--
-- Structure de la table `absence`
--

DROP TABLE IF EXISTS `absence`;
CREATE TABLE IF NOT EXISTS `absence` (
  `IDPERSONNEL` int(2) NOT NULL,
  `DATEDEBUT` datetime NOT NULL,
  `IDMOTIF` int(2) NOT NULL,
  `DATEFIN` datetime DEFAULT NULL,
  PRIMARY KEY (`IDPERSONNEL`,`DATEDEBUT`),
  KEY `I_FK_ABSENCE_MOTIF` (`IDMOTIF`),
  KEY `I_FK_ABSENCE_PERSONNEL` (`IDPERSONNEL`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `absence`
--

INSERT INTO `absence` (`IDPERSONNEL`, `DATEDEBUT`, `IDMOTIF`, `DATEFIN`) VALUES
(3, '2020-09-16 00:00:00', 2, '2022-01-13 00:00:00'),
(2, '2020-06-09 00:00:00', 3, '2022-03-19 00:00:00'),
(4, '2020-12-09 00:00:00', 3, '2022-01-04 00:00:00'),
(4, '2020-10-08 00:00:00', 4, '2022-01-09 00:00:00'),
(5, '2020-11-01 00:00:00', 4, '2022-04-11 00:00:00'),
(2, '2020-08-20 00:00:00', 3, '2021-10-23 00:00:00'),
(5, '2020-08-10 00:00:00', 4, '2022-04-21 00:00:00'),
(8, '2020-12-04 00:00:00', 4, '2022-02-19 00:00:00'),
(7, '2020-08-03 00:00:00', 4, '2021-12-29 00:00:00'),
(8, '2020-06-01 00:00:00', 1, '2021-09-23 00:00:00'),
(9, '2020-11-22 00:00:00', 1, '2022-02-18 00:00:00'),
(8, '2021-03-25 00:00:00', 1, '2022-01-16 00:00:00'),
(10, '2021-02-01 00:00:00', 2, '2021-12-10 00:00:00'),
(5, '2020-11-25 00:00:00', 3, '2022-01-01 00:00:00'),
(4, '2021-02-20 00:00:00', 4, '2022-03-08 00:00:00'),
(4, '2020-12-14 00:00:00', 3, '2021-09-03 00:00:00'),
(2, '2020-06-06 00:00:00', 4, '2022-03-05 00:00:00'),
(10, '2020-12-17 00:00:00', 2, '2021-11-10 00:00:00'),
(3, '2021-03-08 00:00:00', 2, '2022-04-30 00:00:00'),
(2, '2020-07-27 00:00:00', 4, '2021-12-22 00:00:00'),
(1, '2021-02-24 00:00:00', 4, '2021-07-15 00:00:00'),
(2, '2021-02-19 00:00:00', 3, '2021-10-28 00:00:00'),
(1, '2021-03-28 00:00:00', 1, '2021-10-04 00:00:00'),
(5, '2020-10-25 00:00:00', 3, '2022-04-19 00:00:00'),
(1, '2020-07-12 00:00:00', 3, '2021-12-07 00:00:00'),
(5, '2021-02-25 00:00:00', 4, '2021-12-27 00:00:00'),
(8, '2021-01-28 00:00:00', 1, '2021-06-22 00:00:00'),
(5, '2020-06-09 00:00:00', 4, '2021-07-09 00:00:00'),
(9, '2020-10-04 00:00:00', 4, '2022-04-17 00:00:00'),
(6, '2021-04-28 00:00:00', 3, '2021-12-14 00:00:00'),
(2, '2020-10-01 00:00:00', 3, '2021-09-18 00:00:00'),
(8, '2021-05-27 00:00:00', 3, '2022-04-17 00:00:00'),
(2, '2021-03-10 00:00:00', 1, '2021-09-24 00:00:00'),
(3, '2020-05-31 00:00:00', 1, '2021-07-19 00:00:00'),
(3, '2020-06-27 00:00:00', 2, '2022-03-22 00:00:00'),
(1, '2020-07-13 00:00:00', 2, '2021-07-08 00:00:00'),
(7, '2020-08-21 00:00:00', 1, '2022-03-10 00:00:00'),
(10, '2020-06-18 00:00:00', 4, '2021-06-09 00:00:00'),
(1, '2021-04-13 00:00:00', 4, '2022-04-29 00:00:00'),
(9, '2020-12-03 00:00:00', 3, '2022-04-29 00:00:00'),
(1, '2021-04-01 00:00:00', 4, '2022-04-02 00:00:00'),
(8, '2021-05-09 00:00:00', 2, '2021-09-23 00:00:00'),
(8, '2021-04-12 00:00:00', 2, '2021-07-24 00:00:00'),
(4, '2021-01-10 00:00:00', 1, '2022-03-27 00:00:00'),
(4, '2020-11-09 00:00:00', 1, '2021-07-13 00:00:00'),
(3, '2020-12-04 00:00:00', 4, '2021-10-26 00:00:00'),
(5, '2020-07-04 00:00:00', 1, '2021-11-01 00:00:00'),
(4, '2021-02-22 00:00:00', 2, '2021-11-13 00:00:00'),
(7, '2021-03-06 00:00:00', 4, '2022-04-11 00:00:00'),
(1, '2021-01-13 00:00:00', 4, '2022-01-03 00:00:00');

-- --------------------------------------------------------

--
-- Structure de la table `motif`
--

DROP TABLE IF EXISTS `motif`;
CREATE TABLE IF NOT EXISTS `motif` (
  `IDMOTIF` int(2) NOT NULL AUTO_INCREMENT,
  `LIBELLE` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`IDMOTIF`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `motif`
--

INSERT INTO `motif` (`IDMOTIF`, `LIBELLE`) VALUES
(1, 'vacances'),
(2, 'maladie'),
(3, 'motif familial'),
(4, 'congé parental');

-- --------------------------------------------------------

--
-- Structure de la table `personnel`
--

DROP TABLE IF EXISTS `personnel`;
CREATE TABLE IF NOT EXISTS `personnel` (
  `IDPERSONNEL` int(2) NOT NULL AUTO_INCREMENT,
  `IDSERVICE` int(2) NOT NULL,
  `NOM` varchar(50) DEFAULT NULL,
  `PRENOM` varchar(50) DEFAULT NULL,
  `TEL` varchar(15) DEFAULT NULL,
  `MAIL` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`IDPERSONNEL`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `personnel`
--

INSERT INTO `personnel` (`IDPERSONNEL`, `IDSERVICE`, `NOM`, `PRENOM`, `TEL`, `MAIL`) VALUES
(1, 3, 'Faulkner', 'Jakeem', '09 64 56 96 95', 'mauris.elit.dictum@DonecnibhQuisque.org'),
(2, 1, 'Carr', 'Shoshana', '05 54 03 46 18', 'ipsum.nunc.id@acnullaIn.net'),
(3, 2, 'Simmons', 'Marny', '04 11 89 36 70', 'fringilla.est.Mauris@pede.net'),
(4, 1, 'Harper', 'Dakota', '09 98 21 17 89', 'ullamcorper.Duis@eulacusQuisque.edu'),
(5, 3, 'Simmons', 'Ryan', '04 89 80 93 22', 'amet@risusaultricies.ca'),
(6, 2, 'Mckenzie', 'Sharon', '08 86 28 45 24', 'libero.Morbi.accumsan@Praesent.com'),
(7, 1, 'Ferguson', 'Daria', '02 13 24 69 44', 'enim.gravida.sit@liberoDonecconsectetuer.net'),
(8, 3, 'Burgess', 'Victoria', '01 89 54 29 10', 'nisi.nibh@arcuVestibulumante.edu'),
(9, 3, 'Massey', 'Jada', '07 82 07 66 35', 'adipiscing@non.org'),
(10, 2, 'Mann', 'Ali', '03 48 18 90 07', 'Donec.non@orciUt.co.uk');

-- --------------------------------------------------------

--
-- Structure de la table `responsable`
--

DROP TABLE IF EXISTS `responsable`;
CREATE TABLE IF NOT EXISTS `responsable` (
  `login` varchar(64) NOT NULL,
  `pwd` varchar(64) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `responsable`
--

INSERT INTO `responsable` (`login`, `pwd`) VALUES
('Jean-Bernard-Minet', '9441292eb31e68d1b069d53c32bf315d546c2a19a01953fd7c37b76a29509b09');

-- --------------------------------------------------------

--
-- Structure de la table `service`
--

DROP TABLE IF EXISTS `service`;
CREATE TABLE IF NOT EXISTS `service` (
  `IDSERVICE` int(2) NOT NULL AUTO_INCREMENT,
  `NOM` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IDSERVICE`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `service`
--

INSERT INTO `service` (`IDSERVICE`, `NOM`) VALUES
(1, 'administratif'),
(2, 'médiation culturelle'),
(3, 'prêt');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
