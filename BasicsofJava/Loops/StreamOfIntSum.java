package BasicsofJava.Loops;

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
