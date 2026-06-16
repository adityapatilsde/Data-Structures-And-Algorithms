package Recursion.GreatestCommonDivisor;

import java.util.Scanner;
public class RecursiveApproachGcd {
    static int Gcd(int x, int y){
        while (y == 0){
            return x;
        }
        return Gcd(y, x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Gcd(x,y));
    }
}
