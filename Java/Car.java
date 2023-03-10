class Car {
    private Integer id;
    private String license;
    private Account driver;
    // En esta parte del Account
    private Integer passenger;

    public Car(String license, Account name) {
        /*
         * Aqui tambien podemos ver que las variables de arriba son las que se piden
         * segun su
         * tipo de dato y abajo se les designa a que valor iran, es similar a JS
         */
        this.license = license;
        this.driver = name;
        // El poner el nombre del atributo en la super clase de la siguiente forma
        // this.atributo = atributo
        /*
         * Dicho esto vamos construyendo el metodo constructor teniendo cuidado con
         * tener
         * consistencia de los tipos de datos
         */
    }

    void printDataCar() {
        if (passenger != null) {
            System.out.println("License: " + license + " name Driver: " + driver.name + " Passengers = " + passenger);
            // Aqui al actualizar el metodo de Car debemos poner que en lugar de drive se
            // imprima driver.name
        } else {

        }
    }

    // Creando el getter, el cual tiene como devolucion entero pues es lo que va a
    // enviar
    public Integer getPassenger() {
        return passenger;
    }

    // Creando el setter el cual no devuelve nada por lo que se deja este como void
    // y tiene como parametro la variable passenger
    public void setPassenger(Integer passenger) {
        //33 Estamos viendo el polimorfismo asi que vamos a ir viendo como esta funcion no tendra el mismo comportamiento en uberVan
        // Aqui agragamos un if para validar que se ingrese el valor que queremos
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas poner 4 pasajeros");
        }
    }

    // Aqui dimos click derecho para abrir el menu, nos fuimos a acciones del codigo
    // fuente y generate getter and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
