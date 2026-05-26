package BasicsofJava.Loops;

import java.util.Scanner;
public class ReverseOrderNumDoWgile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        do{
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}
