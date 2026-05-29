package BasicsofJava.SimpleConditionsLevel1;

import java.util.Scanner;
public class VowelAndConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a single charecter: ");
        char input = sc.next().charAt(0);


        if ((input >= 'a') && (input <= 'z')) {
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                System.out.println("Is a vowel");
            } else {
                System.out.println("Is a consonant");
            }
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
