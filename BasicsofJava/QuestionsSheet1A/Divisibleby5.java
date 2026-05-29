package BasicsofJava.QuestionsSheet1A;

import java.util.Scanner;
public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if(a %5 == 0){ // condition fpr checking if the number is divisible by 5
            System.out.println(a+ " is divisible by 5 ");
        }
         else {
            System.out.println(a+" is not divisible by 5");
        }
    }
}
