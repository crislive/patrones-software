package Observer;

public class SMSObserver implements Observer {

    private String phoneNumber;

    public SMSObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String alert) {
        System.out.println("SMS a " + phoneNumber + ": " + alert);
    }

    //getters

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
