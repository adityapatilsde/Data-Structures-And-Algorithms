package Recursion;
import java.util.Scanner;
public class sumofFirstNnumbers {
    static int sumOfDigits(int n ) {
        if (n == 1){
            return n;
        }
        return sumOfDigits(n-1)+n;
    }
    static void main(String[] args) {
        System.out.println(sumOfDigits(4));
    }
}
