package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class PrintPalindrome1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check up to the number how many are palindrome:  ");
        int n = sc.nextInt();

        int i = 1;
        int orignal_num = n;

        while (i <= n) {
            int t = i;
            int r = 0;
            while (t > 0) {
               r = r * 10 + i % 10;
               t = t / 10;
            }
            if (i == r){
                System.out.println(i);
            }
            i++;
        }
    }
}
