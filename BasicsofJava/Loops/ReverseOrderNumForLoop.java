package BasicsofJava.Loops;

import java.util.Scanner;
public class ReverseOrderNumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int num = n; num >= 1; num--){
            System.out.println(num);
        }
    }
}