package Recursion.Level2ProblemSolving;

public class ReverseNum {
    static void reverse(int x){
        if (x == 0){
            return;
        }
        reverse(x / 10);
        System.out.println(x);
    }
    public static void main(String[] args) {
        reverse(1234);
    }
}
