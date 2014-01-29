DROP DATABASE IF EXISTS agendamed;
CREATE DATABASE agendamed;
USE agendamed;

CREATE TABLE IF NOT EXISTS `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) DEFAULT NULL,
  `dateNaissance` datetime DEFAULT NULL,
  `nom` varchar(255) NOT NULL,
  `numeroTelephone` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=33 ;
