package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number which needs to be reversed: ");
        int num = sc.nextInt();

        int r = 0;

        while ( num > 0){
            r = r * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(r);
    }
}
