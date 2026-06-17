package Recursion.Level1ProblemSolving;

public class FactorialNum {
    static int factorial(int x){
        if (x == 0){
            return 1;
        }
        return x * factorial(x-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
