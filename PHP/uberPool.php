<?php
require_once('car.php');
class UberPool extends Car {
    //Declaracion de los atributos propios de UberX
    public $brand;
    public $model;

    //Usamos la funcion de Car como base para pasarle los parametros propios de Uber X
    public function __construct($license, $driver, $brand, $model) {
        //Aqui en lugar de super usamos parent
        parent::__construct($license, $driver);
        //Y designamos los nuevos atributos a las variables correspondientes
        $this->brand = $brand;
        $this->model = $model;
      }
}
?>