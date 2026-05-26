package BasicsofJava.Loops;

/*Print the inout natural number in the reverse order*/
import java.util.Scanner;
public class ReverseOrderNumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--){
            System.out.println(i);
        }
    }
}