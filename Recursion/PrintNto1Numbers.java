package Recursion;

import java.util.Scanner;
public class PrintNto1Numbers {
    static void printDecresing(int n ){ // 5 4 3 2 1
        // base case
        if (n == 1){
            System.out.println(1);
            return; // helps in removing stack frame
        }
        // self work
        System.out.println(n);
        //  recursive work
        printDecresing(n - 1);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printDecresing(n);
    }
}
