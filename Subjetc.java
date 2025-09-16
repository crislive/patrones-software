package Observer;

public interface Subjetc {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(String alert);

}
