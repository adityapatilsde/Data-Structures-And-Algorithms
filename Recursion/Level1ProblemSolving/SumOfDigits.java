package Recursion.Level1ProblemSolving;

import java.util.Scanner;

public class SumOfDigits {
    static int SumDigits(int x){
        if (x == 0) {
            return x;
        }
        int sm = x % 10;
        return sm + SumDigits(x / 10);
    }
    public static void main(String[] args) {
        System.out.println(SumDigits(55));
    }
}
