class Main {

    public static void main(String[] args) {
        //Pruebas con Account
        User juan = new User("Juan", "123451");
        juan.printDataUser();
        // En java se nos da por defecto un metodo contructor para nuestras clases
        Car car = new Car("AMO123", new Account("Andres Herrera", "12312"));
        /*
         * Cuando ponemos car. nos dara todas las dependencias que tenga la clase en
         * este caso
         * Car
         */
        car.setPassenger(4);
        car.printDataCar();
        //Pruebas con UberX

        UberX uberX1 = new UberX("1657g", new Account("Alex", "345280"), "Ferrary", "AXD45");
        uberX1.setPassenger(4);
        uberX1.printDataCar();
    }
}