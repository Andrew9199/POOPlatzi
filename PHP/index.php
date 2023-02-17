<?php
//Aqui tenemos como se invocan las dependencias en PHP
    require_once('Car.php');
    require_once('Account.php');


    //Esta seria la invocacion e instanciacion del objeto car la cual recuerda mucho a su forma en Java
    $car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
    //Aqui podemos ver la invocacion del metodo de car y si, definitivamente el this-> representa this. de java
    $car->PrintDataCar();

    /*Conclusiones
    Se pueden ver ciertas diferencias pero las mas destacables o mas
    faciles de recordar serian el cambio de this. por this-> y el hecho
    de tener que poner en las variables el simbolo $ en lugar del tipo de
    dato y se debe poner siempre no como en Java que solo se los pone al 
    declarar el metodo
    */
?>