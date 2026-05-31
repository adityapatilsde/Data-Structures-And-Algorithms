package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class ReverseNumberApproach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be reversed: ");
        int num = sc.nextInt();

        int ans = 0;

        while (num > 0){
          ans = num%10;
            System.out.print(ans);
          num = num/10;
        }
    }
}
