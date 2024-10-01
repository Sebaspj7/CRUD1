-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS cliente;

-- Usar la base de datos
USE cliente;

-- Crear la tabla 'clientes'
CREATE TABLE IF NOT EXISTS clientes (
    idCliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15) NOT NULL,
    direccion VARCHAR(255) NOT NULL
);
