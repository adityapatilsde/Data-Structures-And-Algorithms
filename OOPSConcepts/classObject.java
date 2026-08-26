package OOPSConcepts;

import OOPSRevision.StudentAttendance;

import java.util.Scanner;

public class classObject {
    static class Student{
        String name; // variables(data members)
        int rollNo;
        double cgpa;

        void takeInput(Scanner sc){
            System.out.print("Enter the name of the student: ");
            name = sc.nextLine();
            System.out.print("Enter the registration number: ");
            rollNo = sc.nextInt();
            System.out.print("Enter the cgpa of the student: ");
            cgpa = sc.nextDouble();
            sc.nextLine(); // java reader switches to int but it needs string to work properly
            System.out.println();
        }
        void displayDetails(){
            System.out.println("Student name: "+name);
            System.out.println("Student rollNo: "+rollNo);
            System.out.println("Student cgpa: "+cgpa);
            System.out.println();
        }

    } // end of student class

    public static void main(String[] args) { // main function
        Scanner sc = new Scanner(System.in); // calling scanner class and creating sc object for taking input

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("***** Enter "+n+" student details *****");
        for (int i = 0; i < n; i++){
            Student s1 = new Student();
            System.out.println("Enter student "+(i+1)+" Details");
            s1.takeInput(sc); // using s1 object created of student class and calling takeinput function of student class
            s1.displayDetails();// using s1 object created of student class and calling display function of student class
        }
    }
}
