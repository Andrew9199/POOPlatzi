<?php
require_once('car.php');
class UberVan extends Car {
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

      public function printDataCar()
      {
        if ($this -> passenger != null){
          //AL parecer el "." es el + de PHP y de la forma que esta comentada
          echo "--> Licencia: {$this->license} Driver: {$this->driver->name} Tipo de tajeta aceptada {$this->typeCardAccepted} Material de los asientos {$this->seatsMaterial}";
          /*echo "Licencia:" .$this->license ."Driver: " .$this->driver->name;*/
        }
      }

      public function getPassenger(){
        return $this->passenger;
      }

      public function setPassenger($passenger){

        if ($passenger == 6) {
          $this->passenger = $passenger;
        }
        else {
          echo 'Necesitas asignar 6 pasajeros';
        }
    }
  }
?>