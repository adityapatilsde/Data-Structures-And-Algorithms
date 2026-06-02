package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class CubeFrom1toN {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int answer = 0;
        int start = 1;
        int i = 3;

        while (start <= num){
            answer = (int) Math.pow(start, i);
            System.out.println(answer);
            start++;
        }
    }
}
