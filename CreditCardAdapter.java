package Adapter;

public class CreditCardAdapter implements ProcessPage {

    private CreditCard creditCard;

    public CreditCardAdapter(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void process(double mount, String receptor) {
        creditCard.processPayment(mount, receptor);
    }

    //getter
    public CreditCard getCreditCard() {
        return creditCard;
    }



}
