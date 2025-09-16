package Observer;

public class Main {

    public static void main(String[] args) {

        Alert alert = new Alert();

        Observer mailObserver1 = new MailObserver("admin@gmail.com");
        Observer mailObserver2 = new MailObserver("venta@gmail.com");
        Observer smsObserver1 = new SMSObserver("123456789");
        Observer smsObserver2 = new SMSObserver("987654321");
        Observer smsObserver3 = new SMSObserver("456789123");
        
        alert.registerObserver(mailObserver1);
        alert.registerObserver(mailObserver2);
        alert.registerObserver(smsObserver1);
        alert.registerObserver(smsObserver2);
        alert.registerObserver(smsObserver3);
        
        alert.notifyObservers("Alerta de seguridad: Se ha detectado un acceso no autorizado.");
        alert.removeObserver(smsObserver2);
        alert.notifyObservers("Alerta de seguridad: Se ha detectado un acceso no autorizado.");
        alert.removeObserver(mailObserver1);
        alert.notifyObservers("Alerta de seguridad: Se ha detectado un acceso no autorizado."); 



}
