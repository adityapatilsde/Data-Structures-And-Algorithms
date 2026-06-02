package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class AmstrongNumbers1to100 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = 100;
        int orignal_num = num;
        int a = 0;
        int count = 0;

        while (num > 0){
            a = num%10;
            count += 1;
            num = num/10;
        }
        int temp = orignal_num;
        int b = 0;
        int answer = 0;

        while (temp > 0){
           b = temp%10;
           answer += (int) Math.pow(b,count);
           temp = temp/10;
        }
        if (answer == orignal_num) {
            System.out.println(answer);
        }
    }
}
