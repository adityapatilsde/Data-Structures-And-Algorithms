package BasicsofJava.Loops;

import java.util.Scanner;
public class NumberofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int orignal_a = a;
        int count = 0;

        while (a > 0){
            a = a/10;
            count++;
        }
        System.out.println("Number of digits in " + orignal_a + " = "+count);

    }
}
