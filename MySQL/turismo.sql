-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 02-06-2020 a las 23:08:10
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `turismo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aereo`
--

DROP TABLE IF EXISTS `aereo`;
CREATE TABLE IF NOT EXISTS `aereo` (
  `idvuelo` int(14) NOT NULL AUTO_INCREMENT,
  `numero_vuelo` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `origen` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `destino` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `escala` int(11) NOT NULL,
  `tipo_pasaje_idtipo_pasaje` int(11) NOT NULL,
  `operador_idoperador` int(14) NOT NULL,
  PRIMARY KEY (`idvuelo`),
  KEY `operador` (`operador_idoperador`),
  KEY `fk_tipo_pasaje` (`tipo_pasaje_idtipo_pasaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

DROP TABLE IF EXISTS `ciudad`;
CREATE TABLE IF NOT EXISTS `ciudad` (
  `idciudad` int(14) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `pais` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idciudad`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`idciudad`, `nombre`, `pais`) VALUES
(1, 'Ushuaia', 'Argentina'),
(2, 'Calafate', 'Argentina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idcliente` int(14) NOT NULL AUTO_INCREMENT,
  `dni` int(11) NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `tipo_cliente_idtipo_cliente` int(11) NOT NULL,
  `tipo_riesgo_idtipo_riesgo` int(11) NOT NULL,
  PRIMARY KEY (`idcliente`),
  KEY `fk_tipo_cliente` (`tipo_cliente_idtipo_cliente`),
  KEY `fk_tipo_riesgo` (`tipo_riesgo_idtipo_riesgo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `dni`, `nombre`, `apellido`, `tipo_cliente_idtipo_cliente`, `tipo_riesgo_idtipo_riesgo`) VALUES
(1, 102030, 'Juan', 'Stegman', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `excursiones`
--

DROP TABLE IF EXISTS `excursiones`;
CREATE TABLE IF NOT EXISTS `excursiones` (
  `idexcursion` int(14) NOT NULL AUTO_INCREMENT,
  `fecha_hora` datetime NOT NULL,
  `desc_excursion` text CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `operador_idoperador` int(14) NOT NULL,
  PRIMARY KEY (`idexcursion`),
  KEY `fk_operador` (`operador_idoperador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hoteles`
--

DROP TABLE IF EXISTS `hoteles`;
CREATE TABLE IF NOT EXISTS `hoteles` (
  `idhotel` int(14) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `tipo_idtipo_hotel` int(11) NOT NULL,
  `operador_idoperador` int(14) NOT NULL,
  PRIMARY KEY (`idhotel`),
  KEY `fk_operador` (`operador_idoperador`),
  KEY `fk_tipo` (`tipo_idtipo_hotel`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `hoteles`
--

INSERT INTO `hoteles` (`idhotel`, `nombre`, `tipo_idtipo_hotel`, `operador_idoperador`) VALUES
(1, 'Los Aromos', 3, 1),
(2, 'Ushuaia', 5, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operador`
--

DROP TABLE IF EXISTS `operador`;
CREATE TABLE IF NOT EXISTS `operador` (
  `idoperador` int(14) NOT NULL AUTO_INCREMENT,
  `nit` int(11) NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idoperador`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `operador`
--

INSERT INTO `operador` (`idoperador`, `nit`, `nombre`) VALUES
(1, 100200, 'Glaciar Travel'),
(2, 100300, 'Inter Ushuaia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

DROP TABLE IF EXISTS `paquete`;
CREATE TABLE IF NOT EXISTS `paquete` (
  `idpaquete` int(14) NOT NULL AUTO_INCREMENT,
  `destino` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `dias` int(11) NOT NULL,
  `tipo_pasaje` int(11) NOT NULL,
  `escala` int(11) NOT NULL,
  `origen` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `aereo_idvuelo` int(11) NOT NULL,
  `hotel_tipo_hotel` int(11) NOT NULL,
  `hotel_nombre_hotel` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `hotel_idhotel` int(11) NOT NULL,
  `traslados` int(11) NOT NULL,
  `excursiones` int(11) NOT NULL,
  PRIMARY KEY (`idpaquete`),
  KEY `fk_idvuelo` (`aereo_idvuelo`),
  KEY `fk_idhotel` (`hotel_idhotel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_cliente`
--

DROP TABLE IF EXISTS `tipo_cliente`;
CREATE TABLE IF NOT EXISTS `tipo_cliente` (
  `idtipo_cliente` int(14) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idtipo_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_cliente`
--

INSERT INTO `tipo_cliente` (`idtipo_cliente`, `tipo`) VALUES
(1, 'Nacional'),
(2, 'Extranjero'),
(3, 'Mayorista');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_hotel`
--

DROP TABLE IF EXISTS `tipo_hotel`;
CREATE TABLE IF NOT EXISTS `tipo_hotel` (
  `idtipo_hotel` int(14) NOT NULL AUTO_INCREMENT,
  `Categoria` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idtipo_hotel`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_hotel`
--

INSERT INTO `tipo_hotel` (`idtipo_hotel`, `Categoria`) VALUES
(1, '1Estrellas'),
(2, '2Estrellas'),
(3, '3Estrellas'),
(4, '4Estrellas'),
(5, '5Estrellas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pasaje`
--

DROP TABLE IF EXISTS `tipo_pasaje`;
CREATE TABLE IF NOT EXISTS `tipo_pasaje` (
  `idtipo_pasaje` int(14) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idtipo_pasaje`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_pasaje`
--

INSERT INTO `tipo_pasaje` (`idtipo_pasaje`, `tipo`) VALUES
(1, 'Economico'),
(2, 'Ejecutivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_riesgo`
--

DROP TABLE IF EXISTS `tipo_riesgo`;
CREATE TABLE IF NOT EXISTS `tipo_riesgo` (
  `idtipo_riesgo` int(14) NOT NULL AUTO_INCREMENT,
  `riesgo` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idtipo_riesgo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_riesgo`
--

INSERT INTO `tipo_riesgo` (`idtipo_riesgo`, `riesgo`) VALUES
(1, 'Bajo'),
(2, 'Medio'),
(3, 'Alto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
CREATE TABLE IF NOT EXISTS `tipo_usuario` (
  `idtipo_usuario` int(14) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idtipo_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`idtipo_usuario`, `tipo`) VALUES
(1, 'Administrador'),
(2, 'General');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `traslados`
--

DROP TABLE IF EXISTS `traslados`;
CREATE TABLE IF NOT EXISTS `traslados` (
  `idtraslado` int(14) NOT NULL AUTO_INCREMENT,
  `nombre` text CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `asiento` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `origen` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `destino` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `operador_idoperador` int(14) NOT NULL,
  PRIMARY KEY (`idtraslado`),
  KEY `fk_operador` (`operador_idoperador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `idusuario` int(14) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `tipo_usuario_idtipo_usuario` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `login` (`login`),
  KEY `tipo_usuario_idtipo_usuario` (`tipo_usuario_idtipo_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `login`, `pass`, `tipo_usuario_idtipo_usuario`) VALUES
(1, 'admin', '4321', 1),
(2, 'general', '1234', 2);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `traslados`
--
ALTER TABLE `traslados`
  ADD CONSTRAINT `traslados_ibfk_1` FOREIGN KEY (`operador_idoperador`) REFERENCES `operador` (`idoperador`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`tipo_usuario_idtipo_usuario`) REFERENCES `tipo_usuario` (`idtipo_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
