package BasicsofJava.QuestionsSheet1A;

import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year %4 == 0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("is not a leap year");
        }
    } // repeat
}
