package Observer;

public class UserObserver implements Observer {

    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String alert) {
        System.out.println("Usuario " + name + " recibio alerta: " + alert);
    }

    //getters

    public String getName() {
        return name;
    }



}
