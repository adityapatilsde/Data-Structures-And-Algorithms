package OOPSRevision.Interface;

interface paymentMethod{
    void pay();
}
class Upi implements paymentMethod{
    public void pay(){
        System.out.println("Payment done by UPI");
    }
}
public class Payment {
    public static void main(String[] args) {
        Upi u = new Upi();
        u.pay();
    }
}
