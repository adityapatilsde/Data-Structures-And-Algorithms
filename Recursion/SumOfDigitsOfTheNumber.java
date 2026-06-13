package Recursion;

public class SumOfDigitsOfTheNumber {
   static void sumOfFirstN(int n){
       if (n == 0){
           return ;
       }
       sumOfFirstN(n-1);
   }
   public static void main(String[] args) {
       sumOfFirstN(5);
   }
}
