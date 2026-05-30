package BasicsofJava.SimpleConditionsLevel1;

import java.util.Scanner;
public class DivisbleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if((a %5 ==0 ) && (a %3 == 0)) {
            System.out.println(a+ " is divisible by both 3 and 5 ");
        }
        else {
            System.out.println(a+" is not divisible by 3 and 5");
        }
    }

}
