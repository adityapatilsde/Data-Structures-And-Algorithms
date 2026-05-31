package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;

        while (i <= 10){
            System.out.println(num+" x "+i+" = "+ num * i);
            i++;
        }

    }
}
