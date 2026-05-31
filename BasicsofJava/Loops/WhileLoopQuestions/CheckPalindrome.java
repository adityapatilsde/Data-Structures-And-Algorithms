package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check if its palindrome: ");
        int num = sc.nextInt();

        int reverse = 0;
        int orignal_num  = num;

        while (num > 0){
            reverse = reverse * 10 + num % 10; // 1234 = 0 x 10 + 4 = reverse = 4
            num = num / 10;
        }
        if (orignal_num == reverse){
            System.out.println("It is a palindrome number");
        }
        else {
            System.out.println("It is not a palindrome number");
        }

    }
}
