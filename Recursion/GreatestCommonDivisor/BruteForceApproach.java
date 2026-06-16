package Recursion.GreatestCommonDivisor;

import java.util.Scanner;
public class BruteForceApproach {
    static int gcd(int x, int y){
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers to find the greatest common divisor = ");
        int num = sc.nextInt();
        int num_2 = sc.nextInt();

        System.out.println(gcd(num, num_2));
    }
}
