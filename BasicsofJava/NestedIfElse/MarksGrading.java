package BasicsofJava.NestedIfElse;

import java.util.Scanner;
public class MarksGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if((marks <= 100) && (marks >= 0)) {
            if ((marks > 90) && (marks <= 100)){
                System.out.println("A grade");
            }
            else if ((marks > 80) && (marks <= 90)){
                System.out.println("B grade");
            }
            else if ((marks > 70) && (marks <= 80)){
                System.out.println("C grade");
            }
            else if ((marks > 50) && (marks <= 65)){
                System.out.println("D grade");
            }
            else {
                System.out.println("F grade");
            }
        }
        else {
            System.out.println("Invalid marks input");
        }
    }
}
