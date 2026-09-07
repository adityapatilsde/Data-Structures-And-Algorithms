package OOPSRevision;

import Arrays.Level1ArrayProblemSolving.AverageOfALLElements;

import java.util.Scanner;

public class StudentAttendance {
    String name;
    double regNo;
    double Attendance;
    double TotalAttendace = 0;
    double Average;


    void takeInput(Scanner sc){
        System.out.print("Enter Student name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Reg Number: ");
        regNo = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Student attendance: ");
        Attendance = sc.nextDouble();
        TotalAttendace += Attendance;
        sc.nextLine();
    }
    void EligibiltyDisplay(){
        if (Attendance < 0 || Attendance > 100){
            System.out.println("Invalid attendance entry");
        }
        else  if (Attendance >= 75 ){
            System.out.println();
            System.out.println(name+" "+Attendance+" "+"Eligible");
            System.out.println();
        }
        else {
            System.out.println(name+" "+Attendance+" "+"Detained");
            System.out.println();
        }
    }
     void classAvgAttendance(int student[]){
        int count  = student.length;
        Average = TotalAttendace / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentAttendance obj = new StudentAttendance();
        System.out.print("Enter number of students: ");
        int count = sc.nextInt();
        sc.nextLine();
        int student[] = new int[count];

        for (int i = 0; i < student.length; i++){
            obj.takeInput(sc);
            obj.EligibiltyDisplay();
        }
    }
}
