/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `6_cities` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `city_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

CREATE TABLE `6_rides` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `train_id` bigint(20) unsigned NOT NULL,
  `departure_time` datetime NOT NULL,
  `arrival_time` datetime NOT NULL,
  `departure_city_id` bigint(20) unsigned NOT NULL,
  `arrival_city_id` bigint(20) unsigned NOT NULL,
  `platform` int(11) NOT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

CREATE TABLE `6_trains` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `train_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `max_capacity` int(11) NOT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

INSERT INTO `6_cities` (`id`, `city_name`) VALUES
(1, 'Ternat');
INSERT INTO `6_cities` (`id`, `city_name`) VALUES
(2, 'Brussel-Noord');
INSERT INTO `6_cities` (`id`, `city_name`) VALUES
(3, 'Brussel-Centraal');
INSERT INTO `6_cities` (`id`, `city_name`) VALUES
(4, 'Brussel-Zuid'),
(5, 'Halle'),
(6, 'Gent'),
(7, 'Hasselt'),
(8, 'Oostende'),
(9, 'Leuven'),
(10, 'Parijs'),
(11, 'Berlijn'),
(12, 'Amsterdam'),
(13, 'Denderleeuw'),
(14, 'Liedekerke'),
(15, 'Londen');

INSERT INTO `6_rides` (`id`, `train_id`, `departure_time`, `arrival_time`, `departure_city_id`, `arrival_city_id`, `platform`) VALUES
(1, 3, '2021-11-23 08:05:00', '2021-11-23 08:35:00', 1, 4, 2);
INSERT INTO `6_rides` (`id`, `train_id`, `departure_time`, `arrival_time`, `departure_city_id`, `arrival_city_id`, `platform`) VALUES
(2, 3, '2021-11-23 08:06:00', '2021-11-23 08:26:00', 5, 4, 3);
INSERT INTO `6_rides` (`id`, `train_id`, `departure_time`, `arrival_time`, `departure_city_id`, `arrival_city_id`, `platform`) VALUES
(3, 1, '2021-11-24 10:15:00', '2021-11-24 12:20:00', 4, 10, 2);
INSERT INTO `6_rides` (`id`, `train_id`, `departure_time`, `arrival_time`, `departure_city_id`, `arrival_city_id`, `platform`) VALUES
(4, 4, '2021-11-23 16:20:00', '2021-11-24 18:00:00', 14, 8, 8),
(5, 2, '2021-11-30 18:35:00', '2021-11-30 20:36:00', 4, 15, 1),
(6, 2, '2021-12-05 15:00:00', '2021-11-05 17:01:00', 4, 15, 1),
(7, 2, '2021-12-24 10:00:00', '2021-12-24 12:01:00', 4, 15, 1),
(8, 3, '2021-11-23 10:30:00', '2021-11-23 11:03:00', 1, 4, 2),
(9, 3, '2021-11-24 09:24:00', '2021-11-24 09:56:00', 4, 1, 10),
(10, 3, '2021-11-23 08:32:00', '2021-11-23 08:52:00', 5, 4, 5),
(11, 2, '2021-11-23 08:40:00', '2021-11-23 08:56:00', 4, 5, 18),
(12, 1, '2021-12-07 10:12:00', '2021-12-07 12:17:00', 4, 10, 2);

INSERT INTO `6_trains` (`id`, `train_name`, `max_capacity`) VALUES
(1, 'TGV', 485);
INSERT INTO `6_trains` (`id`, `train_name`, `max_capacity`) VALUES
(2, 'Eurostar', 750);
INSERT INTO `6_trains` (`id`, `train_name`, `max_capacity`) VALUES
(3, 'S-trein', 200);
INSERT INTO `6_trains` (`id`, `train_name`, `max_capacity`) VALUES
(4, 'P-trein', 400);


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;