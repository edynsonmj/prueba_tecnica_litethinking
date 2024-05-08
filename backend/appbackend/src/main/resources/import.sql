insert into empresa values("carrera x #x-x, bogota", "00001", "Asus");
insert into empresa values("carrera x #x-x, cali", "00002", "Lenovo");
insert into empresa values("carrera x #x-x, medellin", "00003", "Apple");
insert into empresa values("carrera x #x-x, popayan", "00004", "Samsung");
insert into empresa values("carrera x #x-x, bogota", "00005", "Microsoft");
insert into empresa values("carrera x #x-x, bogota", "00006", "Acer");
insert into empresa values("carrera x #x-x, bogota", "00007", "LG");

insert into telefono values("00001", "0123456789");
insert into telefono values("00001", "1123456789");
insert into telefono values("00002", "2123456789");
insert into telefono values("00002", "3123456789");
insert into telefono values("00002", "4123456789");
insert into telefono values("00003", "5123456789");
insert into telefono values("00004", "6123456789");
insert into telefono values("00004", "7123456789");
insert into telefono values("00005", "8123456789");
insert into telefono values("00006", "9123456789");
insert into telefono values("00007", "1023456789");

INSERT INTO producto(pro_codigo,pro_nombre,pro_caracteristicas,pro_empresa_nit) VALUES("1","vivovook","portatil con windows 11 home","00001");
INSERT INTO producto(pro_codigo,pro_nombre,pro_caracteristicas,pro_empresa_nit) VALUES("2","TUF Gaming A15","con procesador ryzen y graficos rtx","00001");
INSERT INTO producto(pro_codigo,pro_nombre,pro_caracteristicas,pro_empresa_nit) VALUES("3","expert book b2","perfecto para el trabajo","00001");

INSERT INTO producto(pro_codigo,pro_nombre,pro_caracteristicas,pro_empresa_nit) VALUES("4","thinkbook","portatiles para pequeñas y medianas empresas con estilo","00002");
INSERT INTO producto(pro_codigo,pro_nombre,pro_caracteristicas,pro_empresa_nit) VALUES("5","legion","gran estilo por fuera, rendimiento salvaje por dentro","00002");
INSERT INTO producto(pro_codigo,pro_nombre,pro_caracteristicas,pro_empresa_nit) VALUES("6","yoga","portatiles ultra premium","00002");

INSERT INTO precio(pre_moneda, pre_producto_codigo, pre_valor) VALUES("COP","1",100);
INSERT INTO precio(pre_moneda, pre_producto_codigo, pre_valor) VALUES("USD","1",100);

INSERT INTO categoria(cat_nombre, cat_descripcion) VALUES("Computadores", "dispositivos de computo, portatiles y escritorio");
INSERT INTO categoria(cat_nombre, cat_descripcion) VALUES("Laptop", "dispositivos de computo ligeros y faciles de transportar");
INSERT INTO categoria(cat_nombre, cat_descripcion) VALUES("Gaming", "dispositivos diseñador hacer uso de videojuegos y grandes rendimientos en graficos");

INSERT INTO clasificacion(cla_categoria_nombre, cla_producto_codigo) VALUES("Computadores", 1);
INSERT INTO clasificacion(cla_categoria_nombre, cla_producto_codigo) VALUES("Laptop", 1);
INSERT INTO clasificacion(cla_categoria_nombre, cla_producto_codigo) VALUES("Gaming", 1);
INSERT INTO clasificacion(cla_categoria_nombre, cla_producto_codigo) VALUES("Gaming", 2);

INSERT INTO cliente(cli_id, cli_nombre) VALUES("1", "Edynson Muñoz Jimenez")
INSERT INTO cliente(cli_id, cli_nombre) VALUES("2", "Stiven Jimenez")

INSERT INTO orden(ord_cliente_id, ord_fecha) VALUES("1", "2022-12-01")
INSERT INTO orden(ord_cliente_id, ord_fecha) VALUES("1", "2022-12-02")

UPDATE producto SET pro_orden_codigo = 1 where pro_codigo="1"
UPDATE producto SET pro_orden_codigo = 1 where pro_codigo="2"
UPDATE producto SET pro_orden_codigo = 1 where pro_codigo="3"
UPDATE producto SET pro_orden_codigo = 2 where pro_codigo="4"
UPDATE producto SET pro_orden_codigo = 2 where pro_codigo="5"
UPDATE producto SET pro_orden_codigo = 2 where pro_codigo="6"