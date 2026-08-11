package OOPSRevision;
import java.util.Scanner;
public class Abstraction {
    abstract class CityBank{
        abstract void interestRate();

        void displayBankName(){
            System.out.print("ABC bank: ");
            System.out.println("Interest free");
        }
    }
    class HDFC extends CityBank{
        void displayBankName(){
            System.out.print("HDFC Bank: ");
        }
        void interestRate(){
            System.out.println("Interest rate: 7%");
        }
    }
    class Axis extends CityBank{
        void displayBankName(){
            System.out.print("Axis Bank: ");
        }
        void interestRate(){
            System.out.println("Interest rate: 15%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Abstraction obj = new Abstraction();
        CityBank cb;



        cb = obj.new HDFC();
        cb.displayBankName();
        cb.interestRate();

        cb = obj.new Axis();
        cb.displayBankName();
        cb.interestRate();;
    }
}
