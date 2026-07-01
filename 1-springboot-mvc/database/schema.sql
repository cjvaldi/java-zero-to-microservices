-- 1. CREACIÓN DE LA BASE DE DATOS (Si no existe)
CREATE DATABASE IF NOT EXISTS `db_springboot`
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

-- Seleccionamos la base de datos para trabajar en ella
USE `db_springboot`;

-- 2. ELIMINACIÓN DE LA TABLA (Opcional, por si quieres limpiar pruebas anteriores)
DROP TABLE IF EXISTS `user`;

-- 3. CREACIÓN DE LA TABLA (Sintaxis limpia para MariaDB, sin 'VISIBLE')
CREATE TABLE `user` (
                        `id` INT NOT NULL AUTO_INCREMENT,
                        `name` VARCHAR(45) NULL,
                        `lastname` VARCHAR(45) NULL,
                        `email` VARCHAR(45) NULL,
                        `username` VARCHAR(45) NULL,
                        `password` VARCHAR(45) NULL,
                        `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP, -- Formato Timestamp automático
                        PRIMARY KEY (`id`),
                        UNIQUE INDEX `email_UNIQUE` (`email` ASC),
                        UNIQUE INDEX `username_UNIQUE` (`username` ASC)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 4. INSERCIÓN DE LOS DATOS DE EJEMPLO
INSERT INTO `user` (`name`, `lastname`, `email`, `username`, `password`, `created_at`)
VALUES
    ('Cristian', 'Valdivieso', 'cristian@example.com', 'cjvaldi', 'password123', NOW()),
    ('John', 'Doe', 'john.doe@example.com', 'johndoe', 'secret456', NOW()),
    ('Pepe', 'Perez', 'pepe@example.com', 'pepe99', 'pepepass', NOW());