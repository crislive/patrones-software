package Observer;

import java.util.ArrayList;
import java.util.List;

public class NotifyingSubject implements Subjetc {

    private List<Observer> observers;
    private List<String> alerts;
    private String subjectName;

    public NotifyingSubject(String subjectName) {
        this.subjectName = subjectName;
        this.observers = new ArrayList<>();
        this.alerts = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Observador registrado a " + subjectName);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observador removido de " + subjectName);
    }

    @Override
    public void notifyObservers(String alert) {
        for (Observer observer : observers) {
            observer.update(alert);
        }
    }

    // Método para agregar una nueva alerta y notificar automáticamente
    public void addAlert(String alert) {
        alerts.add(alert);
        System.out.println("Nueva alerta en " + subjectName + ": " + alert);
        notifyObservers(alert);
    }

    // Método para mostrar el historial de alertas
    public void showAlertHistory() {
        System.out.println("Historial de alertas en " + subjectName + ":");
        for (String alert : alerts) {
            System.out.println("- " + alert);
        }
    }

    //getter
    public String getSubjectName() {
        return subjectName;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getAlerts() {
        return alerts;
    }

    


}
