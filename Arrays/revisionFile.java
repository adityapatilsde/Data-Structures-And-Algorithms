package Arrays;
import ObjectOrientedProgramming.StudentDetails;

import java.util.Scanner;

public class revisionFile {
    public static class StudentDetails{
        String name;
        int rno;
        double cgpa;

        void takeInput(Scanner sc){
            System.out.print("Enter the name of the student: ");
            name = sc.nextLine();
            System.out.print("Enter the reg no of the student: ");
            rno = sc.nextInt();
            System.out.print("Enter the cgpa of student: ");
            cgpa = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }
        void display(){
            System.out.println("Student name: "+name);
            System.out.println("Student reg no: "+rno);
            System.out.println("Student cgpa: "+cgpa);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students data to be entered: ");
        int datacount = sc.nextInt();
        sc.nextLine();

        StudentDetails student[] = new StudentDetails[datacount];

        for (int i = 0; i < datacount; i++){
            student[i] = new StudentDetails();
            System.out.println("Enter student "+(i+1)+" details");
            student[i].takeInput(sc);
        }
        System.out.println("******* Student details *******");
        System.out.println();
        for (int i = 0; i < datacount; i++){
            student[i].display();
        }
        sc.close();
    }
}
