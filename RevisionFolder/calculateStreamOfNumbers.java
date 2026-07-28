package RevisionFolder;
import java.util.Scanner;
public class calculateStreamOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        while (n > -1){
            sum += n;
            n = sc.nextInt();
        }
        System.out.println("sum of the numbers: "+sum);
    }
}
