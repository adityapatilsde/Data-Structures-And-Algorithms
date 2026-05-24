package BasicsofJava.Conditionals;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if(year%4 == 0){
            System.out.println("The following year " + year + " is a leap year");
        }
        else{
            System.out.println("The following year "+year+ " is not a leap year");
        }
//        Every 4 years:
//        0.25×4=1
//        So if a year is divisible by 4, it is  a leap year.
//        2024 ÷ 4 is divisble so it's a leap year
    }
}
