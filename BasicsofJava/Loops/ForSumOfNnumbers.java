package BasicsofJava.Loops;

//print the sum of first n natural numbers
import java.util.Scanner;
public class ForSumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
       int  sum = 0;

        for(int n = 1; n <= num ; n++ ){
            sum = sum + n;
        }
        System.out.println("Sum of the first n natural numbers: "+sum);
    }
}
