package Recursion.Level1ProblemSolving;

public class EvenNumOneToN {
    static void EvenNumPrint(int n){
        if (n == 1) {
            return;
        }
        EvenNumPrint(n-1);
        if (n %2 == 0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        EvenNumPrint(10);
    }
}
