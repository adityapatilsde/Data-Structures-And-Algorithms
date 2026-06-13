package Recursion;

import java.util.Scanner;
public class FactorialOfANumber {

    static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
    public static void main() {

        System.out.println(factorial(4));
    }
}
