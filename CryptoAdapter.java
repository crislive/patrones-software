package Adapter;

public class CryptoAdapter implements ProcessPage {

    private Crypto crypto;

    public CryptoAdapter(Crypto crypto) {
        this.crypto = crypto;
    }

    public void process(double mount, String receptor) {
        crypto.processPayment(mount, receptor);
    }

    //getter
    public Crypto getCrypto() {
        return crypto;
    }

}
