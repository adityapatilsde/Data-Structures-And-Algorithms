package Strings;

import java.util.Scanner;

class GeneratePass{
    String userName;
    String password;

    void takeInput(Scanner sc){
        System.out.println();
        System.out.print("Enter userName: ");
        userName = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
    }

    String maskPassword(){
        StringBuilder sb = new StringBuilder(password);
        for (int i = 0; i < sb.length(); i++){
            sb.setCharAt(i,'*');
        }
        password = sb.toString();
        return password;
    }

    void display(){
        System.out.println("UserName: "+userName);
        System.out.println("Masked password: "+maskPassword());
    }
}
public class MaskedPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GeneratePass g = new GeneratePass();
        g.takeInput(sc);
        g.display();
    }
}
