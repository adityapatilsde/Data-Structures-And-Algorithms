package BasicsofJava.Loops;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int count;
        int sum = 0;

        while (a > 0){
            count = a % 10;
            sum += count;
            a = a/10;
        }
        System.out.println("The sum of digits in the following number is: "+sum);
    }
}
