package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class SqaureofNumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int answer= 0;

        for (int i = 1; i <= num; i++){
         answer = (int) Math.pow(i,2);
            System.out.println(answer);
        }
    }
}
