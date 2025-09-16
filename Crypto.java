package Adapter;

public class Crypto {

    protected String walletAddress;
    protected String typeCrypto;

    public Crypto(String walletAddress, String typeCrypto) {
        this.walletAddress = walletAddress;
        this.typeCrypto = typeCrypto;
    }

    //metodo procesar pago con crypto
    public void processPayment(double amount, String receptor) {
        System.out.println("Procesando un pago de " + amount + " a " + receptor + " con Crypto: " + walletAddress);
    }

    //getters
    public String getWalletAddress() {
        return walletAddress;
    }

    public String getTypeCrypto() {
        return typeCrypto;
    }

}
