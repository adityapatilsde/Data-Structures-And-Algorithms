package BasicsofJava.Loops.WhileLoopQuestions;

import java.util.Scanner;
public class FactorialofTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which u need the factorial value: ");
        int num = sc.nextInt();

        int ans = 1;
        int  i = 1;

        while (i <= num){
            ans = ans * i;
            i++;
        }
        System.out.println("The factorial value is: "+ans);
    }
}
