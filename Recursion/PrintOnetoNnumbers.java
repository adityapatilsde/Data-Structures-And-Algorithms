package Recursion;

import java.util.Scanner;
public class PrintOnetoNnumbers {
    static void printIncreasing(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
