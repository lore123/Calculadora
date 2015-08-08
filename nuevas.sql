set foreign_key_checks = 0;
truncate table catalogo;
truncate table cortedecaja;
truncate table doctores;
truncate table entradas;
truncate table entregadecambio;
truncate table productosventa;
truncate table salidas;
truncate table usuarios;
truncate table ventas;
set foreign_key_checks = 1;
INSERT INTO `farmacia_innova`.`usuarios` (`Nombre`, `Apellido`, `Usuario`, `Contrasena`, `Cargo`) 
VALUES ('Administrador','Administrador', 'admin', '123', 'Administrador');
insert into `farmacia_innova`.`ticket`(`mensaje`)
values ('Gracias por su compra, vuelva pronto');
insert into `farmacia_innova`.`entregadecambio` (`dinero`)
VALUES (270);


  select 
        `productosventa`.`Cantidad` AS `Cantidad`,
        `catalogo`.`Nombre` AS `Producto`,
        `entradas`.`Precio` AS `Precio_Compra`,
        `catalogo`.`Precio` AS `Precio_Venta`,
        truncate(((`productosventa`.`Cantidad` * `catalogo`.`Precio`) - (`productosventa`.`Cantidad` * `entradas`.`Precio`)),
            2) AS `Ganancia`,
        `ventas`.`Fecha` AS `Fecha`
    from
        (((`ventas`
        join `productosventa`)
        join `catalogo`)
        join `entradas`)
    where
        ((`ventas`.`Folio` = `productosventa`.`Folio`)
            and (`catalogo`.`Codigo` = `productosventa`.`Codigo`)
            and (`entradas`.`Lote` = `productosventa`.`Lote`));




INSERT INTO `farmacia_innova`.`productosventa`
    (
		`Folio`,`Codigo`,`Lote`,`FechaCaducidad`,`Cantidad`,`Precio`, `IdEntrada`
	)
	VALUES
	(
		1,'09876','1','2017-10-10',1,300, 1
	);