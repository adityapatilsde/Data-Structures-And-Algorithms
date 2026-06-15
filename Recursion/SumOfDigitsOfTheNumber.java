package Recursion;

public class SumOfDigitsOfTheNumber {
   static int PrintSumOfFirstN(int n){
       if (n == 0){
           return n;
       }
       return n+ PrintSumOfFirstN(n-1);

   }
   public static void main(String[] args) {
       System.out.println(PrintSumOfFirstN(51));
   }
}
