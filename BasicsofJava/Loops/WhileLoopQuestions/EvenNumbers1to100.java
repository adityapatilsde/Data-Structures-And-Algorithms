package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class EvenNumbers1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 2;
        while (num <= 100){
            System.out.println(num);
            num += 2;
        }
    }
}
