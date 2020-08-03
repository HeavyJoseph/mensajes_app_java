-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-08-2020 a las 04:37:43
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mensajes_app`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensajes`
--

CREATE TABLE `mensajes` (
  `id_mensaje` int(7) NOT NULL,
  `mensaje` varchar(280) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `fecha_mensaje` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `mensajes`
--

INSERT INTO `mensajes` (`id_mensaje`, `mensaje`, `autor`, `fecha_mensaje`) VALUES
(1, 'Hello World!!!', 'Joseph F. Ramirez', '2020-07-26 23:13:02'),
(2, 'Hello World!!!', 'Joseph F. Ramirez', '2020-07-26 23:13:05'),
(3, 'Hey listeen', 'Zelda', '2020-07-26 23:13:50'),
(4, 'Hola nenita!', 'Joseph F. Divine', '2020-08-03 01:00:09'),
(11, 'Miguel Angel Santana Crisostomo', 'Miguel Angel Santana Crisostomo', '2020-07-30 01:51:56'),
(12, 'Prueba funcional', 'Pablo', '2020-07-30 02:15:41'),
(13, 'Prueba #2', 'José', '2020-07-30 02:28:42'),
(14, 'Prueba #3', 'Mario', '2020-07-30 02:40:24'),
(15, 'El mundo será mio!', 'Joseph F.', '2020-08-03 02:13:39'),
(16, 'Prueba #4', 'Iris', '2020-08-03 02:18:37');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `mensajes`
--
ALTER TABLE `mensajes`
  ADD PRIMARY KEY (`id_mensaje`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mensajes`
--
ALTER TABLE `mensajes`
  MODIFY `id_mensaje` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
