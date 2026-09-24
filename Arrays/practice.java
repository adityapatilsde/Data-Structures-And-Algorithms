package Arrays;

interface smartDevice{
    void  turnon();
    void  turnOff();
}
class smartPhone implements smartDevice{
    @Override
    public void turnon(){
        System.out.println("SmartPhone is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Smart phone is turned off");
    }
}
class smartTV implements smartDevice{
    @Override
    public  void turnon(){
        System.out.println("Tv is on");
    }
    @Override
    public void turnOff(){
        System.out.println("Tv is off");
    }
}
public class practice {
    public static void main(String[] args) {

        smartDevice d;
        d = new smartTV();
        d.turnOff();
        d.turnon();

    }
}