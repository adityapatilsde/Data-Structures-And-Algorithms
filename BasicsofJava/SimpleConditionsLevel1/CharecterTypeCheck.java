package BasicsofJava.SimpleConditionsLevel1;

import java.util.Scanner;
public class CharecterTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single charecter: ");
        char input = sc.next().charAt(0);

        if (input >= 'A' && input <= 'Z'){
            System.out.println("Its an upper case charecter");
        }
        else if (input >= 'a' && input <= 'z') {
            System.out.println("Its an lower case charecter");
        }
        else if (input >= '1' && input <= '9') {
            System.out.println("Its a number");
        }
        else {
            System.out.println("Its a special charecter");
        } // improve question to only user to enter single input if more than one character invalidate input and print error : enter only single charcter
    }
}
