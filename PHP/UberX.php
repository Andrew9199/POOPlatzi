<?php
//Debemos poner la dependencia llamandola de esta forma, su manera de fucnionar es similar a export de java
require_once('car.php');
class UberX extends Car {
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

      public function printDataCar()
      {
        if ($this -> passenger != null){
          //AL parecer el "." es el + de PHP y de la forma que esta comentada
          echo "--> Licencia: {$this->license} Driver: {$this->driver->name} brand {$this->brand} model {$this->model}";
          /*echo "Licencia:" .$this->license ."Driver: " .$this->driver->name;*/
        }
         //Aqui no se pone un else ya que si no se cumple la condicion solo se quiere que el codigo no se ejecute
      }

      public function getPassenger(){
        return $this->passenger;
      }

      public function setPassenger($passenger){

        if ($passenger == 4) {
          $this->passenger = $passenger;
        }
        else {
          echo 'Necesitas asignar 4 pasajeros';
        }
      }
}
