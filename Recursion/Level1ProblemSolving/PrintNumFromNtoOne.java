package Recursion.Level1ProblemSolving;

public class PrintNumFromNtoOne {
    static void printNum(int n){
        if (n == 0) { // Base case
            return;
        }
        System.out.println(n); // Self work
        printNum(n-1); // Recursive work

    }
    public static void main(String[] args) {
        printNum(10);
    }
}
