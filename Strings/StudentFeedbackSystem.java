package Strings;
import java.util.Scanner;

class students{
    String studentName;
    int rollNo;
    String feedback;

    void takeInput(Scanner sc){
        System.out.println();
        System.out.print("Enter the name of the student: ");
        studentName = sc.nextLine();
        System.out.print("Enter the registration number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student feedback: ");
        feedback = sc.nextLine();
    }
    void cleanFeedBack(){
        StringBuilder s = new StringBuilder(feedback);
        while (s.length() > 0 && s.charAt(0) == ' '){
            s.deleteCharAt(0);
        }
        while (s.length() > 0 && s.charAt(s.length()-1) == ' '){
            s.deleteCharAt(s.length()-1);
        }

        feedback = s.toString();
    }
    void checkFeedBack(){
        System.out.println();
        System.out.println("Starts with good ?: "+feedback.startsWith("Good"));
        System.out.println("Contains Faculty: "+feedback.contains("Faculty"));
        System.out.println("Ends with !? : "+feedback.endsWith("!"));
    }
}
public class StudentFeedbackSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        students s = new students();
        s.takeInput(sc);
        s.cleanFeedBack();
        s.checkFeedBack();
    }
}
