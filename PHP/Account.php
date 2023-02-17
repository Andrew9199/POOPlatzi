<?php

class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

//     public Account(String name, String document){
//         this.name = name;
//         this.document = document;
// }

/*Las diferencias con Java no son muy grandes, solo se
cambian algunos detalles como el hecho de que en lugar de 
declarar el tipo de variable se pone un simbolo de pesitos $
y eb lugar del thi. se usa $thin-> junto con que las variables
llevan consigo el $ tal parece en todo momento*/

    public function __construct($name, $document) {
    $this->name = $name;
    $this->document = $document;
  }
  
}
?>