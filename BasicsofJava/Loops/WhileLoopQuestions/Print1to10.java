package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class Print1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        while (num <= 10 ){
            System.out.println(num);
            num++;
        }
    }
}
