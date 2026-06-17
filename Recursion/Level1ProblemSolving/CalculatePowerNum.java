package Recursion.Level1ProblemSolving;

public class CalculatePowerNum {
    static int Power(int n, int p){
        if (p == 0){
            return 1;
        }
        return  Power(n , p - 1) * n;
    }
    public static void main(String[] args) {
        System.out.println(Power(5,3));
    }
}
