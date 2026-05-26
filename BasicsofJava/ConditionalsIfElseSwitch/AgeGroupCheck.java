package BasicsofJava.ConditionalsIfElseSwitch;
import java.util.Scanner;
public class AgeGroupCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

            if ((age < 12) && (age >= 1)) {
                System.out.print("Age Group: Child");
            } else if ((age >= 12) && (age <= 18)) {
                System.out.println("Age Group: Teenager");
            }
            else if (age < 0) {
                System.out.println("Inavlid age entry");

            } else {
                System.out.println("Age Group: Adult");
            }

        }
    }

