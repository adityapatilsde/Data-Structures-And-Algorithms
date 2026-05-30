package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class ValidTriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        int c = sc.nextInt();

        if ((a + b > c) && (b + a > c) && (c + a > b)){
            System.out.println("Valid triangle sides");
        }
        else {
            System.out.println("Invalid trainagle sides");
        }
    }
}
