package BasicsofJava.Conditionals;
import java.util.Scanner;
public class MarksPercentageElseIf {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
      int marks = sc.nextInt();

      if((marks > 90) && (marks <= 100)){
          System.out.println("Execellent");
      } else if ((marks > 80) && (marks <= 90)) {
          System.out.println("Very good");
      } else if ((marks > 70) && (marks <= 80)) {
          System.out.println("Good");
      } else if ((marks > 60) && (marks <= 70)) {
          System.out.println("Can do better");
      } else if ((marks > 50) && (marks <= 60)) {
          System.out.println("Average");
      } else if ((marks > 40) && (marks <= 50)) {
          System.out.println("Below Average");
      }
      else {
          System.out.println("Fail");
      }
    }
}
