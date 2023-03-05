<?php
//Aqui estaremos manejando nuestras pruebas
//Aqui tenemos como se invocan las dependencias en PHP
    require_once('Car.php');
    require_once('Account.php');
    require_once('uberBlack.php');
    require_once('uberX.php');
    require_once('uberVan.php');
    require_once('uberPool.php');

//Primeros ejercicios
    //Esta seria la invocacion e instanciacion del objeto car la cual recuerda mucho a su forma en Java
    $car = new car("AW456", new Account("Andres Herrera", "AMS123"));
    //Aqui podemos ver la invocacion del metodo de car y si, definitivamente el this-> representa this. de java
    $car->setPassenger(4);
    $car->PrintDataCar();
    $car->lineJump();
    /*Conclusiones
    Se pueden ver ciertas diferencias pero las mas destacables o mas
    faciles de recordar serian el cambio de this. por this-> y el hecho
    de tener que poner en las variables el simbolo $ en lugar del tipo de
    dato y se debe poner siempre no como en Java que solo se los pone al 
    declarar el metodo
    */
//Segundos ejercicios
    $uber1 = new UberX('12341', new account("Alexis Sanchez", 171321), "Xiaomi", "ALR-364");
    $uber1 -> setPassenger(4);
    $uber1 -> PrintDataCar();
    $uber1 -> lineJump();

    $uberchido = new UberBlack('2343', new account('Genesis Jacome', 2435234), 'Debit', 'Cuero');
    $uberchido -> setPassenger(4);
    $uberchido -> PrintDataCar();
    $uberchido -> lineJump();

    $uberVan1 = new UberVan('123854', new account('Andrew Williams', "23416"), "Debit", "Cuero sintetico");
    $uberVan1 -> setPassenger(6);
    $uberVan1 -> PrintDataCar();
    $uberVan1 -> lineJump();
?>