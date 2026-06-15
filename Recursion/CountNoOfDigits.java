package Recursion;

public class CountNoOfDigits {
    static int CountDigits(int n) {
        if (n >= 0 && n <= 9) {
            return 1;
        }
        return 1 + CountDigits(n/10);
    }
    static void main(String[] args) {
        System.out.println(CountDigits(12785));
    }
}
