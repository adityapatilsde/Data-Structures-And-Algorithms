package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int ans = 0;
        int count = 0;

        while (num > 0){
         ans = num%10; // 123 = 3 remainder
            num = num/10; // 123 = 12
            count += 1;
        }
        System.out.println(count);
    }
}
