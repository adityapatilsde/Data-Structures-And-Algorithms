package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class Print1toNnumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}
