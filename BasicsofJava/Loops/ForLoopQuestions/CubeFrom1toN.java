package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class CubeFrom1toN {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= num ; i++ ){
            answer = (int) Math.pow(i,3);
            System.out.println(answer);
        }
    }
}
