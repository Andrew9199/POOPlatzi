//!Primero declaramos la clase UberX
class UberX extends Car /*Nos sale un error que nos dice que necesitamos un metodo constructor que coincida con la clase que se esta heredando*/{
    //Decalracion de los atributos propios de UberX
    String brand;
    String model;
//!Luego declaramos el metodo constructor que nos traera la herencia de Car
    //Declaramos el constructor que debe coincidir con la clase padres
    //En la clase car "public Car(String license, Account name)
    //Y luego agregaremos los parametros propios de UberX
    public UberX(String license, Account driver, String brand, String model){
        //Ahora usaremos la palabra reservada super
        super(license, driver);
        this.brand = brand;
        this.model = model;

        //Si le damos a super. tenemos acceso a todo lo que esta dentro de la clase Car
    }
}
