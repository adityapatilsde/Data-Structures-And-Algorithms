package BasicsofJava.ConditionalsIfElseSwitch;
/*write a program to take a  positive integer input and tell if it
is divisible by 5 but not divisible by 3 */

import java.util.Scanner;
public class DivisbiltyCheckCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int a = sc.nextInt();

        if ((a%5 == 0) && (a%3 != 0)) {
            System.out.println(a+" is divisible by 5 but not divsible by 3");
        }
        else{
            System.out.println("Divisibility test failed");
        }


    }
}
