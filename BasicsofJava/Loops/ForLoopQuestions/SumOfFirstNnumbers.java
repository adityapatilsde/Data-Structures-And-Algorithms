package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class SumOfFirstNnumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        int answer = 0;

        for (int i = 1; i <= num; i++){
           answer += i;
        }
        System.out.println(answer);
    }
}
