package OOPSRevision.Interface;

interface Vehicle{
    void start();
}
class car implements Vehicle{
    public void start(){
        System.out.println("Car starts");
    }
}
public class Car {
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
}
