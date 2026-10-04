package Threading;

class shared{
    int totalseats;
    shared(int totalseats){
        this.totalseats = totalseats;
    }
}
class Booking extends Thread{
    shared s;
    String passengerName;
    int seats;

    Booking(shared s,String passengerName,int seats){
        this.s = s;
        this.passengerName = passengerName;
        this.seats = seats;
    }
    public void run(){
        synchronized (s) {
            if (seats <= s.totalseats) {
                s.totalseats -= seats;

                System.out.println(Thread.currentThread().getName() + " " + passengerName + " Booking started");

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + passengerName + " Booked failed - Insufficient seats");
                return;
            }
        }
        System.out.println(Thread.currentThread().getName()+" "+passengerName+" "+seats+" Booked ");
    }
}
public class Ticketreservation {
    public static void main(String[] args) {

        shared s = new shared(10);

        Booking b1 = new Booking( s,"A",6);
        Booking b2  = new Booking(s,"B",5);
        Booking b3 = new Booking(s,"C",2);

        b1.setName("Passenger");
        b2.setName("Passenger");
        b3.setName("Passenger");

        b1.start();
        b2.start();
        b3.start();

        try {
            b1.join();
            b2.join();
            b3.join();
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }

        System.out.println("Reamaining seats: "+s.totalseats);

    }
}