package Recursion.StringsRecursion;
import Arrays.ProblemSolvingInArrays.SecondMaxValue;

import java.util.Scanner;
public class PalindromeCheckRecursion {
    static String ReverseStringForPalindrome(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        String smallAns = ReverseStringForPalindrome(s, idx + 1);
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String rev = ReverseStringForPalindrome(s, 0);
        if (rev.equals(s)) {
            System.out.printf("%s is Palindrome", s);
        } else {
            System.out.printf("%s is Not Palindrome", s);
        }
    }
}
