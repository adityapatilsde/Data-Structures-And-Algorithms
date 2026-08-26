package OOPSConcepts;

import java.util.Scanner;

public class Encapsulation {
    String studentName;
    String mailID;
    private String mailIDPass;

    void setMailIDPass(String mailIDPass){
        this.mailIDPass = mailIDPass;
    }
    String getMailIDPass(){
        return mailIDPass;
    }


    void takeInput(Scanner sc){
        System.out.println();
        System.out.print("Enter student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter student mailId: ");
            mailID = sc.nextLine();
    }
    void diaplay(){
        System.out.println("**** Student Details *****");
        System.out.println("Student name: "+studentName);
        System.out.println("Student mailID: "+mailID);

        System.out.println();
        System.out.println("This the password alloted for your account do not share with anyone");
        System.out.println("Student password: "+getMailIDPass());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Encapsulation obj = new Encapsulation();
        obj.setMailIDPass("UserAdu9898");

        obj.takeInput(sc);
        obj.diaplay();
    }
}
