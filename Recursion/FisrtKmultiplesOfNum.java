package Recursion;

import java.util.Scanner;
public class FisrtKmultiplesOfNum {
    static void printMultiples(int n, int k){
        if (k == 0)
            return ;
        printMultiples(n,k-1);
        System.out.println(k * n);
    }
    static void main(String[] args) {
        printMultiples(3,8);
    }
}
