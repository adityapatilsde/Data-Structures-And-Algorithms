package BasicsofJava.Loops.ForLoopQuestions;

import java.util.Scanner;
public class ReverseOrder1to10 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int num = 1;

        for (int i = 10 ; i >= num; i-- ){
            System.out.println(i);
        }
    }
}
