package BasicsofJava.ConditionalsIfElseSwitch;

/*Take positive integer input and tell if it is divisible by 5 amd 3 */

import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if((a%5 == 0) && (a%3 == 0)){
            System.out.println(a+" is divisible by 5 and 3");
        }
        else {
            System.out.println(a+" is not divisible by 5 and 3");
        }
    }
}
