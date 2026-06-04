package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        for (int i = 1;i <= 10; i++){
            System.out.println(num+" x " +i+" = "+ num * i);
        }
    }
}
