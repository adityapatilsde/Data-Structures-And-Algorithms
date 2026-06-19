package RandomCodesPracticeFile;

import java.util.Scanner;
public class practice {
static int  Fibonacci(int n) {
   if (n == 0 || n == 1) return n;
   return Fibonacci(n-1) + Fibonacci(n - 2);
}
 static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number: ");
     int n = sc.nextInt();
    System.out.println(Fibonacci(n));

     System.out.println();
     System.out.println("================================");
     System.out.println();

     System.out.println("Fibonacci term according to 0th term series: ");
     for (int i = 0; i < 10; i++){
         System.out.println(Fibonacci(i));
     }
 }
}
