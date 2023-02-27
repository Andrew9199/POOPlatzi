class UberPool extends Car {
    //Decalracion de los atributos propios de UberPool
    String brand;
    String model;
    //Creación del metodo constructo que a su vez hereda las cosas de Car
    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}
