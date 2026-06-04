package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class EvenNumbers1to100 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int num = 100;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
