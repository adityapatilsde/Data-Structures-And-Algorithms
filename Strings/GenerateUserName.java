package Strings;

import java.util.Scanner;

class UserName{
    String firstName;
    String lastName;
    String userName;

    void takeInput(Scanner sc){
        System.out.print("Enter the first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter the last name: ");
        lastName = sc.nextLine();
    }
    String createUserName(){
        StringBuilder sb = new StringBuilder(firstName);
        sb.append("_");
        sb.append(lastName);
        userName = sb.toString();
        return userName;
    }
    String convertUserName(){
        userName = userName.toLowerCase();
        return userName;
    }
    void display(){
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        createUserName();
        convertUserName();
        System.out.println("Generated username: "+userName);
    }

}
public class GenerateUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserName u = new UserName();
        u.takeInput(sc);
        u.display();
    }
}
