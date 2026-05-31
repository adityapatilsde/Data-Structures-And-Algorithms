package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class Print1to10Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 10;
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }
}
