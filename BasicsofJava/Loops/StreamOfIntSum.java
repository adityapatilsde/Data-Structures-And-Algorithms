package BasicsofJava.Loops;

/*User will input a stream of numbers at the end all should be calculated
* and a sum should be printed of various numbers (use = while loop )*/
import java.util.Scanner;
public class StreamOfIntSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers to be added: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != -1){
            sum = sum + num;
             num = sc.nextInt();
        }
        System.out.println("Total : "+sum);
        }
}
