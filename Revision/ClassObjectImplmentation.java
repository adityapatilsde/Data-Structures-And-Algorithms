package Revision;
import java.util.Scanner;
public class ClassObjectImplmentation {
    static public class Student{
        String name;
        int rno;
        double cgpa;
        String department;

        void takeInput(Scanner sc){
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            System.out.print("Enter student registration number: ");
            rno = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student department: ");
            department = sc.nextLine();
            System.out.print("Enter student cgpa: ");
            cgpa = sc.nextDouble();
            sc.nextLine();
        }
        void displayStudentDetails(){
            System.out.println("Student name: "+name);
            System.out.println("Student reg no: "+rno);
            System.out.println("Student department: "+department);
            System.out.println("Student cgpa: "+cgpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("****** Enter student details ******");
        System.out.println();
        s.takeInput(sc);

        System.out.println();
        System.out.println("****** Student details ******");
        s.displayStudentDetails();
    }

}
