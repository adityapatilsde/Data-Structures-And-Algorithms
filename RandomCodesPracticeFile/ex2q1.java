package RandomCodesPracticeFile;

import java.util.Scanner;

public class ex2q1 {
   static public class student{
        String name;
        int rno;
        String department;

        void takeInput(Scanner sc){
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            System.out.print("Enter student rollno: ");
            rno = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student department: ");
            department = sc.nextLine();
        }
        void displayStudentDetails(){
            System.out.println("Student name: "+name);
            System.out.println("Student roll no: "+rno);
            System.out.println("Student department: "+department);
        }

       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           student s = new student();
           System.out.println("***** Enter student details ******");
           s.takeInput(sc);
           System.out.println();
           System.out.println("***** Display details *****");
           s.displayStudentDetails();
       }
    }
}
