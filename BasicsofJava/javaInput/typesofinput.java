package BasicsofJava.javaInput;
import java.util.Scanner;
public class typesofinput {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Namw is: "+ name);

        /* This is a string input method ==
        sc.next = this feature does not read anything after the space
        entered in the terminal for example : user enters "Aditya patil"
        it will the print the output only as Aditya .
         */

        System.out.print("Enter reg no: ");
        int reg = sc.nextInt();
        System.out.println("The reg no is: " + reg);

        //input method for integer number values
       // sc.nextInt();

        /*nextInt() does not read the Enter key after the number.
       So we will add sc.nextLine() once to clear that Enter key before taking
        string input.*/
        sc.nextLine();


        System.out.println("Enter your feedback: ");
        String feedback = sc.nextLine();
        System.out.println("Thank you for the response: "+ feedback);


    }
}