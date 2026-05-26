package BasicsofJava.ConditionalsIfElseSwitch;
/*Take a positive integer input and tell if it is a
 * two digit number*/

import java.util.Scanner;
public class twodigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if(a > 9 && a < 100){
            System.out.println(a+" is a two digit number");
        }
        else{
            System.out.println(a+" is not a two digit number");
        }
    }
}
