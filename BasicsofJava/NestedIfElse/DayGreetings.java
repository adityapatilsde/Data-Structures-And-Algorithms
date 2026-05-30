package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class DayGreetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hour of the day: ");
        int hour = sc.nextInt();

        if((hour >= 0 ) && (hour <= 2)){
            System.out.println("Good night");
        } else if ((hour >= 3) && (hour <= 12)) {
            System.out.println("Good morning");
        } else if ((hour >= 13) && (hour <= 19)) {
            System.out.println("Good evening");
        } else if ((hour >= 20 ) && (hour <= 23)) {
            System.out.println("Good night");
        }
        else {
            System.out.println("Enter valid hour");
        }
    }
}
