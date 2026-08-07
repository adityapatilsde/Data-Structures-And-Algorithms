package PatternPrintingrevision;
import Arrays.Level2ArrayProblemSolving.FirstOccurence;

import java.util.Scanner;
public class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int c = sc.nextInt();

        //RECTANGULAR PATTERN
        for (int i = 1; i <= r; i++){ // loop for rows
            for (int j = 1; j <= c; j++){ // loop for coloumns
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();

        //HOLLOW SQUARE
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++){
                if (i == 1 || i == r|| j == 1 || j == c ){
                    //I == 1 First row
                    //I == r Last row
                    //J == 1 First coloumn
                    //J == c Last coloumn
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //RIGHT ANGLED TRIANGLE
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //REVERSE RIGHT ANGLED TRIANGLE
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= (r+1-i); j++){
                //In the first iteration j <= (4+1-1) so j <= 4
                //so it will print stars up to 1 to 4 == 4 stars

                //In the second iteration j <= (4+1-2) so j <= 3
                //so it will print stars up to 1 to 3 == 3 stars

                //And so on

                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //NORMAL NUMERICAL TRIANGULAR PATTERN
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        //NUMERICAL PYRAMID PATTERN
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= r - i; j++){
                System.out.print(" ");

                //Prints leading spaces
                //"","","",""
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);
                //
            }
            for (int l = i - 1; l >= 1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
