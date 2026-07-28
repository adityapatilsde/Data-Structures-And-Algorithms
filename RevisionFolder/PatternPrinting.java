package RevisionFolder;

import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j <= 5; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
