package ObjectOrientedProgramming;

import java.util.Scanner;

public class StudentManagmentSystem {
    public static class Student{
        int rno;
        String name;
        String department;
        int subjects;
        int[] marks;
        int total;
        double percentage;

        void takeinput(Scanner sc){
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            System.out.print("Enter student registration no: ");
            rno = sc.nextInt();
            System.out.print("Enter number of subjects: ");
            subjects = sc.nextInt();
            marks = new int[subjects];
            sc.nextLine();
            System.out.print("Enter student department: ");
            department = sc.nextLine();
        }
        void takeMarksInput(Scanner sc) {
            for (int i = 0; i < subjects; i++) {
                while (true) {
                    System.out.print("Enter subject " + (i + 1) + " marks: ");
                    marks[i] = sc.nextInt();

                    if (marks[i] >= 0 && marks[i] <= 100) {
                        total += marks[i];
                        break; // valid mark, move to next subject
                    } else {
                        System.out.println("Invalid mark! Please enter marks between 0 and 100.");
                    }
                }
            }

            System.out.println();
            System.out.println(name + " total marks scored: " + total);
            System.out.println();
        }
        void calculatePercentage(){
            percentage = (double) total / subjects;
            System.out.println(name+" overall percentage scored: "+percentage);
        }
        void displaymarks(){
            for (int i = 0; i < subjects; i++){
                System.out.println(name+" Subject "+(i+1)+": "+marks[i]);
            }
        }
        void grading(){
            if (percentage >= 90 && percentage <= 100){
                System.out.println("O Grade");
            }
            else if (percentage >= 80 && percentage < 90) {
                System.out.println("A+ Grade");
            }
            else if (percentage >= 70 && percentage < 80) {
                System.out.println("A Grade");
            }
            else if (percentage >= 60 && percentage < 70) {
                System.out.println("B Grade");
            }
            else if (percentage >= 50 && percentage < 60) {
                System.out.println("C Grade");
            }
            else {
                System.out.println("Failed");
            }
        }
        void displayDetails(){
            System.out.println("Student Name   : "+name);
            System.out.println(name+" Roll no: "+rno);
            System.out.println(name+" Department: "+department);
            System.out.println();
            System.out.println("Marks scored");
            System.out.println();
            displaymarks();
            System.out.println();
            System.out.println(name+" Total marks scored: "+total);
            calculatePercentage();
            System.out.print("Grade scored: ");
            grading();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("******* Enter Student Details *******");
        System.out.println();
        s.takeinput(sc);
        System.out.println();
        System.out.println("******* Enter Marks Details ********");
        System.out.println();
        s.takeMarksInput(sc);
        System.out.println("******** Student Report *********");
        System.out.println();
        s.displayDetails();
    }
}
