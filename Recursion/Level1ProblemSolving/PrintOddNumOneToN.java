package Recursion.Level1ProblemSolving;

public class PrintOddNumOneToN {
    static void printOddNum(int n){
        if (n == 0){
            return;
        }
        printOddNum(n - 1);
        if (n %2 != 0){
            System.out.print(n+" ");
        }
    }

    static void main(String[] args) {
        printOddNum(10);
    }
}
