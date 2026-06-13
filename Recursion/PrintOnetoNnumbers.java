package Recursion;

import java.util.Scanner;
public class PrintOnetoNnumbers {
    public static void printNnumbers(int n){
        if (n == 0){ // base case
            return ;
        }
        printNnumbers(n-1); // recursion
        System.out.println(n); // self work
    }
    public static void main(String[] args) {
        printNnumbers(5);
    }
}
