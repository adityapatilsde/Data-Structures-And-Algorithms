package Recursion.Level2ProblemSolving;

public class ReverseNum {
    static int reverse(int x){
        if (x == 0){
            return 0;
        }
        return 1+ reverse(x/10);
    }
    public static void main(String[] args) {
        System.out.println(reverse(134));
    }
}
