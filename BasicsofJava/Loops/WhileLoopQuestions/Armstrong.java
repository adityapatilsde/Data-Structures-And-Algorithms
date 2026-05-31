package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check whether it is a armstrong number or not: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 0;
        int count = 0;
        int orignl_num = num;

        while (num > 0) {
            a = num % 10;
            num = num / 10;
            count += 1;
        }
        int temp = orignl_num;
        int answer = 0;

        while (temp > 0) {
            b = temp % 10;
            answer += (int) Math.pow(b, count);
            temp = temp / 10;

        }

        if (answer == orignl_num) {
            System.out.println(orignl_num + " is an armstrong number");
        } else {
            System.out.println(orignl_num + " is not an armstrong number");
        }

    }
}

