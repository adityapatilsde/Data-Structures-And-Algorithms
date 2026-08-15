package RandomCodesPracticeFile;
import java.util.Scanner;
public class ex3q3 {
    public static class Employee{
        String name;
        int id;
        double salary;

        Employee(String name,int id,double salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        void displayDetails(){
            System.out.println("Employee name: "+name);
            System.out.println("Employee id: "+id);
            System.out.println("Employee salary: "+salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee obj1 = new Employee("Aditya",992,60000);
        obj1.displayDetails();
    }
}
