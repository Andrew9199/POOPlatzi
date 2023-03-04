    import java.util.ArrayList;
    import java.util.Map;
    
    class UberVan extends Car{
        //Atributo propios de UberBlack
        //Aqui ocurre algo curioso con el tipo de dato ya que el arraylist solo permite un argumento
        //Map<String, ArrayList<String, Integer>> typeCardAccepted;
        //Y de necesitar dos quedaria con un map que contiene a otro map
        Map<String, Map<String, Integer>> typeCardAccepted;
        ArrayList<String> seatsMaterial;
        private Integer passenger;
        //Creación del metodo constructo que a su vez hereda las cosas de Car
        public UberVan(String license, Account driver/*, Map<String, Map<String, Integer>> typeCardAccepted, ArrayList<String> seatsMaterial*/){
            super(license, driver);
            /*this.typeCardAccepted = typeCardAccepted;
            this.seatsMaterial = seatsMaterial;*/
        }

        //33 el @Override nos dice que estamos sobreescribiendo este metodo/comportamiento lo cual es señal de que estamos usando polimorfismo
        @Override
        public void setPassenger(Integer passenger) {
            // TODO Auto-generated method stub
            if (passenger == 6) {
                this.passenger = passenger;
            } else {
                System.out.println("Necesitas poner 4 pasajeros");
            }
        }
    }
