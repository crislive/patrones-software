package Adapter;

public class PaypalAdapter implements ProcessPage {

    private Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void process(double mount, String receptor) {
        paypal.processPayment(mount, receptor);
    }

    //getter
    public Paypal getPaypal() {
        return paypal;
    }



}
