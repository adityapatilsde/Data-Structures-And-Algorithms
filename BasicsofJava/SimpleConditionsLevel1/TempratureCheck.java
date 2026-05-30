package BasicsofJava.SimpleConditionsLevel1;

import java.util.Scanner;
public class TempratureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();

        if(temp > 30 && temp < 50) {
            System.out.println("HOT");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("WARM");
        } else if (temp < 0 || temp <= 20) {
            System.out.println("COLD");
        }
        else {
            System.out.println("INVALID TEMPRATURE");
        } // vaidate input and correct the solution
    }
}
