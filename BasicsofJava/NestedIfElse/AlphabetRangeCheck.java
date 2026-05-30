package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class AlphabetRangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a alphabet: ");
        char input = sc.next().charAt(0);

        if ((input >= 'a') && (input <= 'm')){
            System.out.println("Aplhabet lies between a and m");
        }
        else if ((input >= 'n') && (input <= 'z')) {
            System.out.println("Alphabet lies between n and z");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
