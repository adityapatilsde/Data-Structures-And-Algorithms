package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        int answer = 0;

        for (int i = 2; i <= num; i += 2) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
