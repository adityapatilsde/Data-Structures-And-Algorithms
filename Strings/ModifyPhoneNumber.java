package Strings;

import java.util.Scanner;
class MobileNumber{
    String name;
    String phoneNumber;

    void takeInput(Scanner sc){
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter mobile number: ");
        phoneNumber = sc.nextLine();
    }
    String  modify(){
        StringBuilder sb = new StringBuilder(phoneNumber);
        for (int i = 5; i < sb.length(); i+=6){
            sb.insert(i,'_');
        }
        phoneNumber = sb.toString();
        return phoneNumber;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Phone number: "+modify());
    }
}
public class ModifyPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MobileNumber m = new MobileNumber();
        m.takeInput(sc);
        m.display();
    }


}
