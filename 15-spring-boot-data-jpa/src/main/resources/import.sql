INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (1,'Cristian', 'Jacson','cjprueba@prueba.com','2026-02-14', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (2,'Jhon', 'Doe','jhonprueba@prueba.com','2026-01-15', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (3,'Maria', 'Gonzalez','mgonzalez@prueba.com','2026-01-20', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (4,'Pedro', 'Lopez','plopez@prueba.com','2026-02-01', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (5,'Ana', 'Martinez','amartinez@prueba.com','2026-01-05', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (6,'Luis', 'Fernandez','lfernandez@prueba.com','2026-02-10', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (7,'Laura', 'Diaz','ldiaz@prueba.com','2026-01-25', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (8,'Carlos', 'Ramirez','cramirez@prueba.com','2026-02-03', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (9,'Sofia', 'Torres','storres@prueba.com','2026-01-12', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (10,'Miguel', 'Sanchez','msanchez@prueba.com','2026-02-18', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (11,'Elena', 'Ruiz','eruiz@prueba.com','2026-01-08', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (12,'Javier', 'Moreno','jmoreno@prueba.com','2026-02-06', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (13,'Patricia', 'Alvarez','palvarez@prueba.com','2026-01-30', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (14,'Diego', 'Romero','dromero@prueba.com','2026-02-11', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (15,'Carmen', 'Navarro','cnavarro@prueba.com','2026-01-17', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (16,'Roberto', 'Molina','rmolina@prueba.com','2026-02-08', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (17,'Isabel', 'Ortega','iortega@prueba.com','2026-01-22', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (18,'Fernando', 'Delgado','fdelgado@prueba.com','2026-02-13', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (19,'Rosa', 'Castro','rcastro@prueba.com','2026-01-19', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (20,'Andres', 'Vargas','avargas@prueba.com','2026-02-16', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (21,'Beatriz', 'Iglesias','biglesias@prueba.com','2026-01-27', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (22,'Manuel', 'Guerrero','mguerrero@prueba.com','2026-02-04', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (23,'Cristina', 'Peña','cpena@prueba.com','2026-01-10', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (24,'Alberto', 'Cortes','acortes@prueba.com','2026-02-20', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES (25,'Silvia', 'Reyes','sreyes@prueba.com','2026-01-14', '');
--ALTER TABLE clientes ALTER COLUMN id RESTART WITH 3;


----cuando es con DB
--INSERT INTO clientes (id, nombre, apellido, email, create_at) VALUES ('Cristian', 'Jacson','cjprueba@prueba.com','2026-02-14');
--INSERT INTO clientes (id, nombre, apellido, email, create_at) VALUES ('Jhon', 'Doe','jhonprueba@prueba.com','2026-01-15');

/* tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic Pantalla LCD', 259990, CURDATE());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Camara digital DSC-W320B', 123490, CURDATE());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple iPod shuffle', 1499990, CURDATE());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Notebook Z110', 37990, CURDATE());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Hewlett Packard Multifuncional F2280', 69990, CURDATE());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Bianchi Bicicleta Aro 26', 69990, CURDATE());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Mica Comoda 5 Cajones', 299990, CURDATE());

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3, 2, 6);

/* Creamos usuarios y roles */
insert into users (username, password, enabled) values ('cristian','$2a$10$iVPORGzBjBfgXPymFbQNk.ntPagpDHPpUlLty8QBPi39oftHU./Om',1)
insert into users (username, password, enabled) values ('admin','$2a$10$NJqtIc5G27a/ZRScX/KlTucyO3D7pTdsYWkTe4D.vRCRgiNO79xQG',1)


INSERT INTO authorities (user_id,authority) values(1,'ROLE_USER');
INSERT INTO authorities (user_id,authority) values(2,'ROLE_USER');
INSERT INTO authorities (user_id,authority) values(2,'ROLE_ADMIN');