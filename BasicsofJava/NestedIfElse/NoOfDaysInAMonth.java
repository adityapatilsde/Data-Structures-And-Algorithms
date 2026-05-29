package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class NoOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days in the month: ");
        int days = sc.nextInt();

        if(days == 28 ) {
            System.out.println("February");
        } else if (days == 31) {
            System.out.println("April , June , September , November");
        }
        else if(days == 30) {
            System.out.println("January , February , March , May , July , August , October , December");
        }
        else {
            System.out.println("Invalid days input");
        }
    }
}
