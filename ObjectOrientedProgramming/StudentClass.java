package ObjectOrientedProgramming;
import java.util.Scanner;
public class StudentClass {
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter student name: ");
        s.name = sc.nextLine();
        System.out.print("Enter student roll no: ");
        s.rno = sc.nextInt();
        System.out.print("Enter student cgpa: ");
        s.cgpa = sc.nextDouble();

        System.out.println();
        System.out.println("********************* Student details ******************");
        System.out.println();

        System.out.println("Name: "+s.name);
        System.out.println("Roll no: "+s.rno);
        System.out.println("CGPA: "+s.cgpa);

    }
}
