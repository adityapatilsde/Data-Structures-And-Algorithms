package Arrays;

import java.util.Random;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"Rock","Paper","Scissors"};

        System.out.println("Enter 0 - rock, enter 1 - paper, enter 2 - Sccissors");
        System.out.println();
        System.out.print("Enter user choice: ");
        int userChoice = sc.nextInt();
        System.out.println();
        Random random = new Random();
        int computerChoice = random.nextInt(3);
        System.out.println("User choice "+arr[userChoice]);
        System.out.println("Computer choice "+arr[computerChoice]);

        System.out.println();

            System.out.println("RESULT");
            if (userChoice == computerChoice) {
                System.out.println("Its a drawl");
            }
        else if (userChoice == 0 && computerChoice == 2) {
                System.out.println("User wins");
            } else if (userChoice == 1 && computerChoice == 0) {
                System.out.println("User wins");
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("User wins");
            } else {
                System.out.println("Computer wins");
            }
    }
   }


