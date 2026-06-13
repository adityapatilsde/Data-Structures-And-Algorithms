package Recursion;

public class PrintFirstEvenNumbers {
static void PrintEvenNumbers(int n){
    if (n == 1)
        return ;
        PrintEvenNumbers(n-1);
    if (n %2 == 0)
        System.out.println(n);
}

    static void main(String[] args) {
      PrintEvenNumbers(10);
    }
}
