public class Card extends Payment {
    Integer number;
    Integer CVV;
    String date;

    public Card (Integer id, Integer number, Integer CVV, String date){
        super(id);
        this.number = number;
        this.CVV = CVV;
        this.date = date;
    }
}
