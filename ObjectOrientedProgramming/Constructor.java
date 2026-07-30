package ObjectOrientedProgramming;

public class Constructor {
    public static class student{
        String name;
        int rno;
        double cgpa;

        public student(){ //Default constructor

        }
        public student(String name, int rno, double cgpa){ //Parametrized Constructor
            this.name = name;
            this.rno = rno;
            this.cgpa = cgpa;
        }
        void display(){
            System.out.println("Student name: "+name);
            System.out.println("Student reg no: "+rno);
            System.out.println("Student cgpa: "+cgpa);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        student s1 = new student("Aditya",992,10.0);
        s1.display();
        student s2 = new student("Shubh",996,10.0);
        s2.display();

        //s1 and s2 are accessing parametrized constructor

        student s3 = new student();
        s3.name = "Adi";
        s3.rno = 994;
        s3.cgpa = 9.8;
        s3.display();

        //s3 is accessing default constructor
    }
}
