package BasicsofJava.Loops;
import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int digits;
        int reverse;

        while (a > 0){
            digits = a % 10;
            reverse = digits;
            System.out.print(reverse);
            a = a/10;
        }
    }
}
