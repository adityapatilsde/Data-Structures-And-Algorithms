package ObjectOrientedProgramming;
import java.util.Scanner;
public class HospitalManagmentSystem {
    public static class Hospital{
        int patientID;
        String name;
        int age;
        String disease;
        float bill;

        void takeinput(Scanner sc){
            System.out.print("Enter patient Name: ");
            name = sc.nextLine();
            System.out.print("Enter patient Age: ");
            age = sc.nextInt();
            System.out.print("Enter patient Id: ");
            patientID = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter patient disease: ");
            disease = sc.nextLine();
            System.out.print("Enter patient total bill: ");
            bill = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }
        void display(){
          //  System.out.println("******** Patient Details ********");
            System.out.println("Patient Name  : "+name);
            System.out.println(name+" Age     : "+age);
            System.out.println(name+" Id      : "+patientID);
            System.out.println(name+" disease : "+disease);
            System.out.println(name+" Bill    : "+bill);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients data to be entered: ");
        int patientCount = sc.nextInt();
        System.out.println();
        sc.nextLine();
        Hospital h[] = new Hospital[patientCount];

        for (int i = 0; i < patientCount; i++){
            h[i] = new Hospital();
            System.out.println("Enter Patient "+(i+1)+" details ");
            h[i].takeinput(sc);
        }
        System.out.println("******* Patient details *******");
        System.out.println();
        for (int i = 0; i < patientCount; i++){
            System.out.println("Patient "+(i+1)+" details");
            System.out.println();
            h[i].display();
        }
        int revenue = 0;
        for (int i = 0; i < patientCount; i++){
            revenue += h[i].bill;
        }
        System.out.println();
        System.out.println("****** Branch analysis ******");
        System.out.println();
        System.out.println("Total patients attended today: "+patientCount);
        System.out.println("Total hospital revenue generated: "+revenue);
        System.out.println("Today's Latest id no: "+h[patientCount - 1].patientID);




    }
}
