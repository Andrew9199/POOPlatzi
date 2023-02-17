// function Car(license, driver) {
//     /*En JS es mas sencillo ya que se van tomando como si fuera su metodo constructor y 
//     se toma de manera tal que no es necesario crear otro metodo*/ 
//     this.id;
//     this.license = license;
//     this.driver = driver;
//     this.passenger;
// }

//     /*Aqui ponemos que se invoquen los datos en la consola de depuracion 
//     del navegador*/
// Car.prototype.printDataCar = function () {
//     console.log(this.driver)
//     console.log(this.driver.name)
//     console.log(this.driver.document)
// }

//Aqui vamos a ir poniendo el codigo mas nuevo o el que ya se puede usar desde EMASCRIP6

//Vamos a ir poniendo que se cambia por el que

// function Car(license, driver) Antes de EMAS6
//Es igual en Java
class Car {
    constructor(license, driver){
        //Los atributos se mantienen iguales al igual que la declaracion de lo que se debe remplazar sin ser necesario poner algo extra
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }


// Car.prototype.printDataCar = function () Antes de EMAS6
//void printDataCar() En Java solo se le agrega un void, mas que eso son identicos 
    printDataCar(){
        //El ingreso obvio iba a ser diferente ya que uno funciona como .exe y JS funciona para navegador
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}

//Conclusiones
/*En si no hay tantos cambios, solo se cambia la parte de la declaracion en donde empueza a asemejarse mas ael modelado que nos da Java siendo que se declara una clase y dentro se ponen sus atributos metodos y comportamientos sin embargo sigue teniendo ciertas diferencias que estaria bueno ir repasando*/


//Partes y cambios principales
/*1 Debemos poner una clase igual que en Java pero en lugar de dejarlo asi ya que ahora no es una funcion debemos poner constructor() para que el codgio funcione correctamente, ademas de eso podemos solo declarar un metodo igual que en Java en lugar de poner "Car.prototype.printDataCar = function ()"*/

//Para instaciar un objeto seguiremos usando la palabra reservada new y en cuanto a lo demas parece que todo se mantiene igual