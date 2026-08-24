package OOPSRevision;

abstract class Student {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Abstract method
    abstract void calculateGrade();

    // Concrete method
    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }
}

class RegularStudent extends Student {

    RegularStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade   : A+");
        else if (marks >= 80)
            System.out.println("Grade   : A");
        else if (marks >= 70)
            System.out.println("Grade   : B");
        else if (marks >= 60)
            System.out.println("Grade   : C");
        else if (marks >= 50)
            System.out.println("Grade   : D");
        else
            System.out.println("Grade   : F");
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Student s1 = new RegularStudent(101, "Aditya", 85);

        s1.displayStudent();
        s1.calculateGrade();
    }
}