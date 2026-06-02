package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class OddNumbers1to100 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int num  = 100;

        for (int i = 1; i <= num; i += 2){
            System.out.println(i);
        }
    }
}
