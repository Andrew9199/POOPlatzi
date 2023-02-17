class Car {
    Integer id;
    String license;
    Account driver;
    //En esta parte del Account
    Integer passenger;

    public Car(String license, Account name){
        /*Aqui tambien podemos ver que las variables de arriba son las que se piden segun su
        tipo de dato y abajo se les designa a que valor iran, es similar a JS*/
            this.license = license;
            this.driver = name;
            //El poner el nombre del atributo en la super clase de la siguiente forma
            //this.atributo = atributo
            /*Dicho esto vamos construyendo el metodo constructor teniendo cuidado con tener
            consistencia de los tipos de datos*/
            }
            void printDataCar() {
                System.out.println("License: " + license + "name Driver: " + driver.name);
                //Aqui al actualizar el metodo de Car debemos poner que en lugar de drive se imprima driver.name
            }
}


