package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class TwoNumbersEvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if((a %2 == 0) && (b %2 == 0)) {
            System.out.println("Both are even numbers ");
        }
        else if((a %2 != 0) && (b %2 != 0)) {
            System.out.println("Both are odd numbers ");
        }
        else if((a %2 == 0) && (b %2 != 0)) {
            System.out.println("first number is even second number is odd");
        }
        else if((a %2 != 0) && (b %2 == 0)) {
            System.out.println("first number is odd second number is even");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
