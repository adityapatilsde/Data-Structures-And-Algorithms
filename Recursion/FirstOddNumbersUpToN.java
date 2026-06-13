package Recursion;

public class FirstOddNumbersUpToN {
    static void OneToNoddNumbers(int n){
        if (n == 0){
            return;
        }
        OneToNoddNumbers(n-1);
        if (n %2 != 0){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        OneToNoddNumbers(20);
    }
}
