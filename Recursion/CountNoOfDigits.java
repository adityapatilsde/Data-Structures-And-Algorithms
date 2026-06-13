package Recursion;

public class CountNoOfDigits {
    static int CountDigits(int n) {
        int ans = 1;
        if (n >= 0 && n <= 9) {
            return ans;
        }
        return 1+ CountDigits(n/10);
    }

    static void main(String[] args) {
        System.out.println(CountDigits(78920));
    }
}
