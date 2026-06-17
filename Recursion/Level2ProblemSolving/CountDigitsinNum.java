package Recursion.Level2ProblemSolving;

public class CountDigitsinNum {
    static int ans = 0;
    static void count(int x){
        if (x == 0) {
            return ;
        }
        ans += 1;
        count(x / 10);
    }
    public static void main(String[] args) {
        count(1256656);
        System.out.println(ans);
    }
}
