package RevisionFolder;

import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks > 90 && marks <= 100){
            System.out.println("Excellent");
        }
        else if(marks > 80 && marks <= 90){
            System.out.println("Very good");
        }
        else if(marks > 70 && marks <= 80){
            System.out.println("good");
        }
        else if(marks > 60 && marks <= 70){
            System.out.println("Can dp better");
        }
        else if(marks > 50 && marks <= 60){
            System.out.println("Average");
        }
        else if(marks > 40 && marks <= 50){
            System.out.println("Below average");
        }
        else {
            System.out.println("Fail");
        }
    }
}
