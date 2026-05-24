package BasicsofJava.javaInput;
import java.util.Scanner;
public class findRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Divisor: ");
        int a = sc.nextInt();
        System.out.print("Enter Dividend: ");
        int b = sc.nextInt();
        int q = a % b ;
        System.out.print("The Divisor "+a+" is divided by "+b+" the remainder is "+q);
    }
}
