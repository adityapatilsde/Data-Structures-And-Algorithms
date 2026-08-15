package RandomCodesPracticeFile;
import java.util.Scanner;
public class ex2q3 {
    static public class Student{
        String name;
        int rollno;

        void takeInput(Scanner sc){
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            System.out.print("Enter student roll no: ");
            rollno = sc.nextInt();
            sc.nextLine();
        }
        void display(){
            System.out.println("Student name: "+name);
            System.out.println("Student roll number: "+rollno);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();
            Student students[] = new Student[n];

            for (int i = 0; i < n; i++){
                students[i] = new Student();
                System.out.println("\nEnter student details: "+(i+1));
                students[i].takeInput(sc);
            }
            System.out.println("\n ***** Student details *****");
            for (int i = 0; i < n; i++){
                System.out.println("\nStudent "+(i+1));
                students[i].display();
            }
        }
    }
}
