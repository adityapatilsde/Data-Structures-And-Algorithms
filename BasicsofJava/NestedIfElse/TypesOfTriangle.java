package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class TypesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        int c = sc.nextInt();

            if ((a == b) && (b == a) && (c == a)) {
                System.out.println("Equilateral triangle");
            } else if ((a != b) && (b != a) && (c != a)) {
                System.out.println("Scalene triangle");
            } else {
                System.out.println("Isoceles triangle");
            }

    }
}
