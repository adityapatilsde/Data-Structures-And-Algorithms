package Revision;

import ObjectOrientedProgramming.StudentManagmentSystem;

public class Constructors {
    static public class StudentDetails{
        private String name;
        private String studentId;
        private int rollno;
        private double cgpa;

        StudentDetails(){ // default constructor
            System.out.println("This is a default constructor");
        }
         StudentDetails(String name, String studentId, int rollno){ // parametrized constructor
             this.name = name;
             this.rollno = rollno;
             this.studentId = studentId;
         }
         StudentDetails(double cgpa){ //  constructor overloading
            this.cgpa = cgpa;
         }
         StudentDetails(StudentDetails s){ // copy constructor
            this.name = s.name;
            this.rollno = s.rollno;
            this.studentId = s.studentId;
         }
         void display(){
             System.out.println("Student name: "+name);
             System.out.println("Student rollno: "+rollno);
             System.out.println("Student ID: "+studentId);
         }
         void displayCgpa(){
             System.out.println("Student cgpa: "+cgpa);
         }
    }
    public static void main(String[] args) {
        StudentDetails s1;
        StudentDetails s2 = new StudentDetails("Aditya","992",2004);
        StudentDetails s3 = new StudentDetails(9.5);
        s2.display();
        System.out.println();
        System.out.println("Constructor overloading: ");
        s3.displayCgpa();

        System.out.println();
        System.out.println("Copied constructor");
        StudentDetails s4 = new StudentDetails(s2);
        s4.display();
    }
}
