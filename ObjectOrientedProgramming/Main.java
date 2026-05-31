package ObjectOrientedProgramming;

 class Student {
     int rollno;
     String studentName;
 }
    public class Main {
        public static void main(String[] args) {
            Student obj1 = new ObjectOrientedProgramming.Student();
            obj1.rollno = 1;
            obj1.studentName = "Aditya";
            System.out.println(obj1.rollno);
            System.out.println(obj1.studentName);

            Student obj2 = new Student();
            System.out.println(obj2.rollno);
            System.out.println(obj2.studentName);

    }
}
