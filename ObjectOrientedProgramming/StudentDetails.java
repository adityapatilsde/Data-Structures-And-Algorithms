package ObjectOrientedProgramming;
import java.util.Scanner;

public class StudentDetails {
    public static class StudentData {
        int rno;
        String name;
        double cgpa;

         void takeInput(Scanner sc) {
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            System.out.print("Enter student roll no: ");
            rno = sc.nextInt();
            System.out.print("Enter student cgpa: ");
            cgpa = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }
        void display(){
            System.out.println("Student name: "+name);
            System.out.println("Student roll no: "+rno);
            System.out.println("Student cgpa: "+cgpa);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // StudentData s = new StudentData();
        System.out.print("Enter number of students data to be entered: ");
        int studentNum = sc.nextInt();
        sc.nextLine();

        StudentData[] students = new StudentData[studentNum];

        for (int i = 0; i < studentNum; i++){
            students[i] = new StudentData();
            System.out.println("Enter details of student "+(i+1));
            students[i].takeInput(sc);
        }
        System.out.println("******* Student details **********");
        for (int i = 0; i < studentNum; i++){
            students[i].display();
        }
        sc.close();
    }
}