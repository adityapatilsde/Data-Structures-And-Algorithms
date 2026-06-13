package Recursion;

public class ReverseNumber {
    static int ReverseNum(int n, int rev){
        if (n == 0){
            return rev ;
        }
        return ReverseNum(n / 10 , rev * 10+ n % 10);
    }
   public static void main(String[] args) {
        System.out.println(ReverseNum(1234,0));
    }
}
