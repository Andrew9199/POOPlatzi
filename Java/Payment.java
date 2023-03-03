class Payment {
    Integer id;    

    public Payment(Integer id){
        this.id = id;
    };

    void printDataCar() {
        System.out.println("ID: " + id);
        //Aqui al actualizar el metodo de Car debemos poner que en lugar de drive se imprima driver.name
    }
}
