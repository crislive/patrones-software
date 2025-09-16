package Adapter;

public class CreditCard {

    protected String cardNumber;
    protected String cardHolder;
    protected String expirationDate;
    protected String cvv;

    public CreditCard(String cardNumber, String cardHolder, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    //metodo procesar tarjeta de credito
    public void processPayment(double amount, String receptor) {
        System.out.println("Procesando un pago de " + amount + " con tarjeta de credito: " + cardNumber);
    }

    //getters
    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

}
