package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class SmallestDigit {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find out its smallest digit: ");
        int num = sc.nextInt();

        int a = 0;
        int largest = 9;
        int answer = 0;

        while (num > 0){
            a = num%10 ; // 323 = 3 (a = 3)
            if (a < largest){
                largest = a;
            }
            num = num / 10;
        }
        System.out.println(largest);
    }
}
