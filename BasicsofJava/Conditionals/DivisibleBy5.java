package BasicsofJava.Conditionals;
import  java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a%5 == 0){
            System.out.println("The number is divisble by 5");
        }
        else{
            System.out.println("The number is not divisible by 5");
        }
    }
}