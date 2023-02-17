function Car(license, driver) {
    /*En JS es mas sencillo ya que se van tomando como si fuera su metodo constructor y 
    se toma de manera tal que no es necesario crear otro metodo*/ 
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

    /*Aqui ponemos que se invoquen los datos en la consola de depuracion 
    del navegador*/
Car.prototype.printDataCar = function () {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}
