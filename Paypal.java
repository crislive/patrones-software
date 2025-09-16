package Adapter;

public class Paypal {

    protected String email;
    protected String password;

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //metodo procesar pago con paypal
    public void processPayment(double amount, String receptor) {
        System.out.println("Procesando un pago de " + amount + " a " + receptor + " con Paypal: " + email);
    }

    //getters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
