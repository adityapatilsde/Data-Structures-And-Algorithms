package Strings.OOPSProblems;

class Notification{
    void sendMessage(){
        System.out.println("Normal notification recieved");
    }
}
class EmailNotification extends Notification{
    @Override
    void sendMessage(){
        System.out.println("Email notification recieved");
    }
}
class SMSNotification extends Notification{
    @Override
    void sendMessage(){
        System.out.println("SMS notification recieved");
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        Notification n1 = new Notification();
        n1.sendMessage();
        Notification n2 = new EmailNotification();
        n2.sendMessage();
        Notification n3 = new SMSNotification();
        n3.sendMessage();
    }
}
