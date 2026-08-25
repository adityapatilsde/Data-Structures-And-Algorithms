package OOPSRevision;

class ParentStudent {
    String name = "Student";

    void display() {
        System.out.println("This is Student class");
    }
}

class CollegeStudent extends ParentStudent {
    String name = "Aditya";

    void display() {
        System.out.println("This is CollegeStudent class");
    }

    void show() {

        // Access parent class variable
        System.out.println("Parent name: " + super.name);

        // Access child class variable
        System.out.println("Child name: " + name);

        // Call parent class method
        super.display();

        // Call child class method
        display();
    }
}

public class superKeyword {

    public static void main(String[] args) {

        CollegeStudent s = new CollegeStudent();

        s.show();
    }
}
