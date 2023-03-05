<?php
//Invocamos la clase account para tener sus cosas disponibles
require_once('account.php');
class car
{
  public $id;
  public $license;
  public $driver;
  protected $passenger;

  //Metodo constructor
  public function __construct($license, $driver)
  {
    $this->license = $license;
    $this->driver = $driver;
  }
  //Forma de poner salto de linea en PHP tranformando la palabra reservada \n a etiquetas br de HTMl
  public function lineJump()
  {
    $text = "\n";
    echo nl2br($text);
  }

  /*Aqui podemos ver como se declararia
      una funcion en PHP*/

  public function printDataCar()
  {
    /*echo "license: $this->license, 
        conductor: {$this->driver->name}, document: {$this->driver->document}";*/
    if ($this->passenger != null) {
      echo "--> Licencia: $this->license Driver: " . $this->driver->name;
    } else {
    }
    //Es bastante importante entender lo que esta pasando en cuanto a la impresion de los datos del auto siendo que debemos fijarnos en la posicion de las comillas ademas debemos ver que las llaves deben deberse a que estamos accediendo al dato name del driver y lo mismo con document
  }

  public function getPassenger()
  {
    return $this->passenger;
  }

  public function setPassenger($passenger)
  {

    if ($passenger == 4) {
      $this->passenger = $passenger;
    } else {
      echo 'Necesitas asignar 4 pasajeros';
    }
  }

  //void printDataCar() {
  //System.out.println("License: " + license + "name Driver: " + driver.name);
  //Aqui al actualizar el metodo de Car debemos poner que en lugar de drive se imprima driver.name
  // }
}
