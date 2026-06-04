package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class SqaureFrom1toN {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int i = 2;
        int answer = 0;
        int start = 1;

        while (start <= num){
            answer = (int) Math.pow(start , i);
            System.out.println(answer);
            start++;
        }
    }
}
