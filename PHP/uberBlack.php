<?php
require_once('car.php');
class UberBlack extends Car {
    //Declaracion de los atributos propios de UberX
    public $typeCardAccepted;
    public $seatsMaterial;

    //Usamos la funcion de Car como base para pasarle los parametros propios de Uber X
    public function __construct($license, $driver, $typeCardAccepted, $seatsMaterial) {
        //Aqui en lugar de super usamos parent
        parent::__construct($license, $driver);
        //Y designamos los nuevos atributos a las variables correspondientes
        $this->typeCardAccepted = $typeCardAccepted;
        $this->seatsMaterial = $seatsMaterial;
      }
    }
?>