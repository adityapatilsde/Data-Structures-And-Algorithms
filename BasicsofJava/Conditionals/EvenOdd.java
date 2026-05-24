package BasicsofJava.Conditionals;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("The number is an even number");
        }
        else{
            System.out.println("The number is an odd number");
        }
    }

}
