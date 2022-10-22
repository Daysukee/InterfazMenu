CREATE DATABASE IF NOT EXISTS inventario_farmacia;
use inventario_farmacia;
CREATE TABLE if not exists Usuarios(
Usuario_id int NOT NULL AUTO_INCREMENT,
Usuario_nombre varchar(255) NOT NULL,
Usuario_nickname varchar(255) NOT NULL,
Usuario_contrasena varchar(255) NOT NULL,
Usuario_rol varchar(255) NOT NULL,
PRIMARY KEY (Usuario_id)
);
-- sha256 algorythm;
-- r -> 886776260903d90f9c86b96d845b1b2f94cbf0fdcfab01310af6b3733e799e09;
-- invitado -> 75cee5b221098c39dc19feca49b7b7cfe46405057d0361b18726990a5f91bf25;
INSERT INTO Usuarios(Usuario_nombre, Usuario_nickname, Usuario_contrasena, Usuario_rol) VALUES ("Cuenta de invitado", "invitado", "75cee5b221098c39dc19feca49b7b7cfe46405057d0361b18726990a5f91bf25", "invitado");
INSERT INTO Usuarios(Usuario_nombre, Usuario_nickname, Usuario_contrasena, Usuario_rol) VALUES ("Administrador", "admin", "886776260903d90f9c86b96d845b1b2f94cbf0fdcfab01310af6b3733e799e09", "administrador");

CREATE TABLE if not exists Categorias(
Categoria_id int NOT NULL AUTO_INCREMENT,
Categoria_nombre varchar(255) NOT NULL,
Categoria_descripcion varchar(510),
Categoria_activo boolean NOT NULL default 1,
PRIMARY KEY (Categoria_id)
);
ALTER TABLE Categorias AUTO_INCREMENT=100;
INSERT INTO Categorias(Categoria_nombre, Categoria_descripcion) VALUES ("Cosmetica","Preparaciones de uso externo usado para la mejorar la apariencia, especialmente del rostro");
INSERT INTO Categorias(Categoria_nombre, Categoria_descripcion) VALUES ("Cuidado bucal","Productos destinados al cuidado oral como parte de las necesidades del cliente");
INSERT INTO Categorias(Categoria_nombre, Categoria_descripcion) VALUES ("Analgesicos","Reducen o alivian distintos tipos de dolores");
INSERT INTO Categorias(Categoria_nombre, Categoria_descripcion) VALUES ("Antihistaminico","Tratamiento de alergias, tos y resfriados");

CREATE TABLE if not exists Productos(
Producto_id int NOT NULL AUTO_INCREMENT,
Producto_nombre varchar(255) NOT NULL UNIQUE, 
Producto_descripcion varchar(510),
Producto_precio_compra decimal(8,2),
Categoria_id int NOT NULL,
Producto_stock_actual int,
Producto_unidad_medida varchar(255),
Producto_cantidad_unidades int,
Producto_activo boolean NOT NULL default 1,
PRIMARY KEY (Producto_id),
FOREIGN KEY (Categoria_id) REFERENCES Categorias(Categoria_id)
);
ALTER TABLE Productos AUTO_INCREMENT=1000;
INSERT INTO Productos(Producto_nombre,Producto_descripcion, Producto_precio_compra, Categoria_id, Producto_stock_actual, Producto_unidad_medida, Producto_cantidad_unidades) VALUES ("Paracetamol 500 mg","Alivio de dolores de cabeza, migrana, neuralgia y otros dolores",15.50,102,40,"unidades",100);
-- STR_TO_DATE("01/02/2023", "%d/%m/%Y");
INSERT INTO Productos(Producto_nombre,Producto_descripcion, Producto_precio_compra, Categoria_id, Producto_stock_actual, Producto_unidad_medida, Producto_cantidad_unidades) VALUES ("Ibuprofeno 400 mg","Tratamiento de la fiebre y dolor de intensidad leve o moderada",11.50,102,30,"unidades",20);
INSERT INTO Productos(Producto_nombre,Producto_descripcion, Producto_precio_compra, Categoria_id, Producto_stock_actual, Producto_unidad_medida, Producto_cantidad_unidades) VALUES ("Cetirizina 10 mg","Tratamiento de alergias",8.30,102,60,"unidades",10);
-- lote_id es el numero de lote que figura en caja;
CREATE TABLE if not exists Lotes(
Producto_id int NOT NULL,
Lote_id int NOT NULL,
Lote_stock int,
Lote_fecha_venc date,
Lote_fecha_registro date default(CURRENT_DATE),
-- used on mysql 5.3 TIMESTAMP CURRENT_TIMESTAMP;
PRIMARY KEY (Lote_id),
FOREIGN KEY (Producto_id) REFERENCES Productos(Producto_id)
);
INSERT INTO Lotes(Producto_id,Lote_id,Lote_stock,Lote_fecha_venc) VALUES(1001,2077850,20,STR_TO_DATE("01/07/2023", "%d/%m/%Y"));
INSERT INTO Lotes(Producto_id,Lote_id,Lote_stock,Lote_fecha_venc) VALUES(1001,4027376,40,STR_TO_DATE("01/02/2024", "%d/%m/%Y"));

CREATE TABLE if not exists Alertas(
Alerta_id int NOT NULL AUTO_INCREMENT,
Producto_id int NOT NULL,
Alerta_titulo varchar(255) NOT NULL,
Alerta_contenido varchar(510) NOT NULL,
Alerta_fecha_creacion date default(CURRENT_DATE),
Alerta_activo boolean NOT NULL default 1,
PRIMARY KEY (Alerta_id),
FOREIGN KEY (Producto_id) REFERENCES Productos(Producto_id)
);
ALTER TABLE Alertas AUTO_INCREMENT=1000;
INSERT INTO Alertas(Producto_id,Alerta_titulo,Alerta_contenido) VALUES (1000,"El producto esta pronto a vencer","Revisa el producto Paracetamol. Su fecha de vencimiento esta muy cerca.");
