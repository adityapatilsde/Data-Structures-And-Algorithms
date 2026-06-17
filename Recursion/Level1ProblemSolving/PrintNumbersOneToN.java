package Recursion.Level1ProblemSolving;

import java.util.Scanner;
public class PrintNumbersOneToN {
    static void printNumbers(int n){
        if (n == 0){ // Base case
            return ;
        }
         printNumbers(n - 1); // recursive work
        System.out.println(n);  // self work
    }
    public static void main(String[] args) {
        printNumbers(10);
    }
}
