package Strings;
import javax.swing.text.Style;
import java.util.Scanner;
class Student{
    String feedback;
    void takeInput(Scanner sc){
        System.out.println("Enter student feedback: ");
        feedback = sc.nextLine();
    }
    void checks(){
        StringBuilder sb = new StringBuilder(" Java is a interesting language ");

            while(sb.length() > 0 && sb.charAt(0) == ' '){
                sb.deleteCharAt(0);
            }
            while (sb.length() > 0 && sb.charAt(sb.length()-1) == ' '){
                sb.deleteCharAt(sb.length()-1);
            }

        System.out.println("Spaces :"+sb);
    }
}
public class StudentFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.checks();
    }
}
