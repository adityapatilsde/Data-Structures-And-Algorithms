package BasicsofJava.Conditionals;
/*Take three positive integer input and print the greatest of them*/

import java.util.Scanner;
public class GeatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first positive number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second positive number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third positive number: ");
        int c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println(a + " is the greatest number");
        } else if ((b > c) && (b > a)) {
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println(c + " is the greatest number");
        }
    }
}
