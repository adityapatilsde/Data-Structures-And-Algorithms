package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get the sum of digits in that number: ");
        int num = sc.nextInt();

        int sum = 0;
        int a = 0;
        while (num > 0){
            a = num % 10;
            sum += a;
            num = num/10;
        }
        System.out.println(sum);
    }
}
