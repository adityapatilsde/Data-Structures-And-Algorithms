package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class SumofFirstnEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an even number up to which the even sum is required: ");
        int num = sc.nextInt();

        int n = 2;
        int ans = 0;

        while (n < num){
            ans += n;
            n = n + 2;
        }
        System.out.println(ans);
    }
}
