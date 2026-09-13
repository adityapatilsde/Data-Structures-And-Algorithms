package OOPSConcepts;


class Student {
    String name;
    int age;
    String department;

    Student() {
        this("Aditya");
        System.out.println("Default constructor");
    }

    Student(String name) {
        this(name, 19);
        System.out.println("One parameter constructor");
    }

    Student(String name, int age) {
        this(name, age, "CSE");
        System.out.println("Two parameter constructor");
    }

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        System.out.println("Three parameter constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println();

        s1.display();
    }
}

