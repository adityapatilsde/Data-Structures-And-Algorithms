package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class MultipleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if(a %b == 0){
            System.out.println(b+" is a multiple of "+a);
        }
        else if (b %a == 0) {
            System.out.println(a+" is a multiple of "+b);
        }
        else {
            System.out.println("Both are not the multiples of each other");
        }
    }
}
