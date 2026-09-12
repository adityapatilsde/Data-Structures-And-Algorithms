package Strings;
import  java.util.Scanner;
class Name{
    String name;
    void takeInput(Scanner sc){
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    void checkReq(){
        System.out.println("Starts with Aditya: "+name.startsWith("Aditya"));
        System.out.println("Contains patil: "+name.contains("patil"));
        System.out.println("Extract student name: "+name.substring(0,12));
        System.out.println("Replace: "+name.replace("Patil","Kumar"));
        System.out.println("uppercase print: "+name.toUpperCase());
    }

}
public class DetailsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Name b = new Name();
        b.takeInput(sc);
        b.checkReq();
    }
}
