package Observer;

public class MailObserver implements Observer {

    private String email;

    public MailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String alert) {
        System.out.println("Email a " + email + ": " + alert);
    }

    //getters

    public String getEmail() {
        return email;
    }

}
