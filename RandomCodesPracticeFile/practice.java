package RandomCodesPracticeFile;

import java.util.Scanner;
public class practice {
    static int reversenum(int num){
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;       // Get the last digit
            reverse = reverse * 10 + digit;
            num = num / 10;             // Remove the last digit
        }
        return reverse;
    }
 static void isPalindrome(int n){
     int temp = n;
     int reverse = reversenum(n);
     if (temp == reverse){
         System.out.println("Is palindrome");
     }
     else {
         System.out.println("Is not palindrome");
     }
 }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter the num to check if its palindrome: ");
     int n = sc.nextInt();
     isPalindrome(n);
 }
}
