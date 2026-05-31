package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class SumofFirstnOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the odd number up to which u need the odd sum of numbers: ");
        int num = sc.nextInt();

        int n = 1;
        int ans = 0;

        while (n < num){
            ans += n;
            n += 2;
        }
        System.out.println(ans);
    }
}
