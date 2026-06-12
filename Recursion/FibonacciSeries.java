package Recursion;

import java.util.Scanner;
public class FibonacciSeries {
    static int fibonacci(int n ){
        // base case
      if (n == 0 || n == 1) return n;
     return fibonacci(n-1) + fibonacci(n-2);

      // subproblems
//        int prev = fibonacci(n-1);
//      int preprev = fibonacci(n-2);
//      // selfwork
//      return prev + preprev;

    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println(fibonacci(i));
        }
    }

}
