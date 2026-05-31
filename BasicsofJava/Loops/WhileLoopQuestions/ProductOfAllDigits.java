package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class ProductOfAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which u need the product of the digits: ");
        int num = sc.nextInt();

        int ans = 1;
        int n = 0;

        while (num > 0){
            n = num%10;  // 123 = 12 quotient , 3 remainder
            ans *= n;
            num = num/10 ; // 123 = 123 divided by 10 = 12
        }
        System.out.println(ans);
    }
}
