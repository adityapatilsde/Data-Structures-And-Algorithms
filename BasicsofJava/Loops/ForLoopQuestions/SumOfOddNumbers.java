package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int answer = 0;

        for (int i = 1; i <= num; i += 2){
          answer += i;
        }
        System.out.println(answer);
    }
}
