package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class LargestDigit {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its largest digit: ");
        int num = sc.nextInt();

        int greatest = 0;
        int largest = 0;
        int a = 0;
        int b = 0;

        while (num > 0){
            a = num%10;
            if (a > largest){
               b = largest;
            }
        }
        System.out.println(b);
    }
}
