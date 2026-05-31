package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class SumofFirstnNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the natural number up to which sum is required: ");
        int num = sc.nextInt();
        int n = 1;
        int ans = 0; ;

        while (n <= num){
            ans += n;
            n++;

        }
        System.out.println(ans);

    }
}
