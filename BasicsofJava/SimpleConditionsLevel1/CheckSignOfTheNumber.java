package BasicsofJava.SimpleConditionsLevel1;

import java.util.Scanner;
public class CheckSignOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println(a+" is a positive number");
        } else if (a < 0) {
            System.out.println(a+" is a negative number");
        }
        else {
            System.out.println("The number is 0 ");
        }
    }

    //Scope can be improved futther for decimal and float inputs as well
}
