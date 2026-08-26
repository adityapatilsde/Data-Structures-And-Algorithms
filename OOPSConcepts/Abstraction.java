package OOPSConcepts;

abstract class Vehicle{

    abstract void modelName();
    abstract void Colour();

    void CompanyName(){
        System.out.println("Tata Motors");
    }
}

class Defender extends Vehicle{
    void modelName(){
        System.out.println("Defender 110");
    }
    void Colour(){
        System.out.println("Maroon Black Fade");
    }
}

class MiniDefender extends Vehicle{
    void modelName(){
        System.out.println("Defender 90");
    }
    void Colour(){
        System.out.println("Black Mat");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Defender d = new Defender();
        d.CompanyName();
        d.modelName();
        d.Colour();

        System.out.println();

        MiniDefender m = new MiniDefender();
        m.CompanyName();
        m.modelName();
        m.Colour();
    }
}
