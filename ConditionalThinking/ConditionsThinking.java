package ConditionalThinking;
import java.util.Scanner;
public class ConditionsThinking {
  static void perfectSqaure(int num){
      boolean isPerfectSquare = false;
      for (int i = 1; i <= num; i++){
          if (i * i == num){
              isPerfectSquare = true;
              break;
          }
      }
      if (isPerfectSquare){
          System.out.println("Is a perfect square");
      }
      else {
          System.out.println("Is not a perfect square");
      }
  }
  static int fibonacci(int num){
      if (num == 0 || num == 1) return num;
      return fibonacci(num - 1) + fibonacci(num - 2);
  }
  static int factorial(int num){
      int fact = 1;
      for (int i = 1; i <= num; i++){
          fact *= i;
      }
      return fact;
  }
  static void primeNumber(int num){
      boolean isPrime = true;
      if (num <= 1){
          isPrime = false;
      }
      for (int i = 2; i < num; i++){
          if (num % i == 0){
              isPrime = false;
              break;
          }
      }
      if (isPrime){
          System.out.println("Prime Number");
      }
      else {
          System.out.println("Not a Prime Number");
      }
  }
  static void ArmstrongNumber(int num){
      boolean isArmsStrong = false;
      int sum = 0 , orignal = num;
      int arr[] = new int[3];
      for (int i = 0; i < arr.length; i++) {
          int digit = num % 10;
          int cube = digit * digit * digit;
          arr[i] = cube;
          num /= 10;
      }
      for (int i = 0; i < arr.length; i++){
          sum += arr[i];
      }
      if (orignal == sum){
          isArmsStrong = true;
      }
      if (isArmsStrong){
          System.out.println("It is an armstrong number");
      }
      else {
          System.out.println("It is not an armstrong number");
      }
  }
  static void armstrongNumber(int num){
      int original = num;
      int temp = num;
      int digits = 0;
      int sum = 0;

      //Count number of digits
      while (temp > 0){
          digits++;
          temp /= 10;
      }
      temp = num;

      while (temp > 0){
          int digit = temp % 10;
          sum += (int) Math.pow(digit,digit);
          temp /= 10;
      }
      if (sum == original) {
          System.out.println("It is an Armstrong Number");
      } else {
          System.out.println("It is not an Armstrong Number");
      }
  }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     armstrongNumber(150);
    }
}
