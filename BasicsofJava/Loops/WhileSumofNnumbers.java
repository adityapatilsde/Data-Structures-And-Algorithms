package BasicsofJava.Loops;

import java.util.Scanner;
public class WhileSumofNnumbers   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = 1;
        int sum = 0;

        while (num >= n){
            sum = sum + n;
            n++;
        }
        System.out.println(sum);
    }
}
