package Recursion;

public class SumOfDigitsOfTheNumber {
    static int sumOfDigits(int n){
        if (n >= 0 && n <= 9){
            return n;
        }
        return sumOfDigits(n/10)+ n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(5012));
    }
}
