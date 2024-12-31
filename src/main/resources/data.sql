INSERT INTO rol (rol,estado) VALUES ('Administrador',true);
INSERT INTO rol (rol,estado) VALUES ('Usuario',true);
INSERT INTO rol (rol,estado) VALUES ('Moderador',true);

INSERT INTO persona (nombre, apellido, dni, celular, correo)
VALUES ('Juan', 'Pérez', '123456789', '987654321', 'juan.perez@example.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo)
VALUES ('María', 'López', '987654321', '123456789', 'maria.lopez@example.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo)
VALUES ('Carlos', 'Ramírez', '567894321', '456789123', 'carlos.ramirez@example.com');

INSERT INTO clasificacion (grupo) VALUES ('Electrónica');
INSERT INTO clasificacion (grupo) VALUES ('Hogar');
INSERT INTO clasificacion (grupo) VALUES ('Ropa');

INSERT INTO competencia (nombre, descripcion)
VALUES ('Gestión de Proyectos', 'Capacidad para gestionar proyectos eficientemente.');

INSERT INTO competencia (nombre, descripcion)
VALUES ('Liderazgo', 'Habilidad para guiar y motivar equipos de trabajo.');

INSERT INTO competencia (nombre, descripcion)
VALUES ('Comunicación', 'Capacidad para comunicarse de manera efectiva tanto verbal como escrita.');

INSERT INTO proveedores (ruc, telefono, pais , correo, moneda) VALUES ('0160588672001', '0987654321', 'ECUADOR','morelos@gmail.com','dolar americano');
INSERT INTO proveedores (ruc, telefono, pais , correo, moneda) VALUES ('0105833958001', '0987654322', 'ESPAÑA','hotspain@gmail.com','euros');
INSERT INTO proveedores (ruc, telefono, pais , correo, moneda) VALUES ('0150066683001', '0987654323', 'COLOMBIA','colombus@hotmail.com','pesos colombianos');

INSERT INTO tipo_pago (tipo, descrip) VALUES ('Efectivo', 'Pago directo en efectivo');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Tarjeta', 'Pago mediante tarjeta de crédito o débito');
INSERT INTO tipo_pago (tipo, descrip) VALUES ('Transferencia', 'Pago mediante transferencia bancaria');

INSERT INTO factura (ruc, id_persona, fecha, id_tipo_pago, descuento, total)
VALUES ('1234567890', 1, '2024-12-01', 1, 10.0, 90.0);

INSERT INTO factura (ruc, id_persona, fecha, id_tipo_pago, descuento, total)
VALUES ('9876543210', 2, '2024-12-02', 2, 20.0, 180.0);

INSERT INTO factura (ruc, id_persona, fecha, id_tipo_pago, descuento, total)
VALUES ('5678943210', 3, '2024-12-03', 3, 30.0, 270.0);

INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva)
VALUES (100, 50.0, 'Unidad', 1, 1, true);

INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva)
VALUES (200, 30.0, 'Caja', 2, 2, false);

INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva)
VALUES (150, 70.0, 'Paquete', 3, 3, true);

INSERT INTO persona (nombre, apellido, dni, celular, correo)
VALUES ('Ana', 'Martínez', '234567890', '123456780', 'ana.martinez@example.com');
INSERT INTO persona (nombre, apellido, dni, celular, correo)
VALUES ('Luis', 'González', '345678901', '098765432', 'luis.gonzalez@example.com');

INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal)
VALUES (1, 1, 2, 50.0, 100.0);

INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal)
VALUES (1, 2, 1, 200.0, 200.0);

INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal)
VALUES (2, 3, 3, 70.0, 210.0);

INSERT INTO rol_competencia (id_rol, id_competencias)
VALUES (1, 1), (1, 2), (2, 3);

INSERT INTO rol_competencia (id_rol, id_competencias)
VALUES (2, 1), (2, 2), (3, 1);

INSERT INTO rol_competencia (id_rol, id_competencias)
VALUES (3, 2), (3, 3);