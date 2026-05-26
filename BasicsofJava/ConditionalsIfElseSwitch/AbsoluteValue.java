package BasicsofJava.ConditionalsIfElseSwitch;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer value: ");
        int a = sc.nextInt();

        if (a < 0){
            a *= -1;
        }
        System.out.println("The absolute value is: "+a);
    }
}
