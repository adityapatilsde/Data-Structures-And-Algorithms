package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class MultiplicationTableReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int i = 10;
        while (i >= 1){
            System.out.println(num+" x "+ i + " = "+ num * i);
            i--;
        }
    }
}
