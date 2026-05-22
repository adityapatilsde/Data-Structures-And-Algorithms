package BasicsofJava.javaInput;
import java.util.Scanner;
public class areaOfCircleWithInput {
   public static void main(String[] args) {
       System.out.println(" ");
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the radius of circle: ");
       int radius = sc.nextInt();

       double pi = 3.1415;
       double area = pi * radius * radius ;

       System.out.println("The area of circle is : "+area );
    }
}
