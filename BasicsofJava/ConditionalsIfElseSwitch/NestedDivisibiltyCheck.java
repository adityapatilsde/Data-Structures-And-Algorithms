package BasicsofJava.ConditionalsIfElseSwitch;
/*Take positive integer input and tell if it is divisible by 5 or 3
* but not divisible by 15 .*/

import java.util.Scanner;
public class NestedDivisibiltyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int a = sc.nextInt();
        if(((a%5 == 0) || (a%3 == 0)) && (a%15 != 0)){
            System.out.println("it is divisble by 5 or 3 but not by 15 test condition passed");
        }
        else if ((a%5 == 0) && (a%3 == 0) && (a%15 == 0)) {
            System.out.println("It is divisible by 5 or 3 but also divisible by 15 " +
                    "test conditions failed ");
        } else{
            System.out.println("divisibilty test failed! ");
        }
    }
}
