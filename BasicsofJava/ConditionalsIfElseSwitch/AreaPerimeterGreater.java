package BasicsofJava.ConditionalsIfElseSwitch;
import java.util.Scanner;
public class AreaPerimeterGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println("Area is "+ area);

        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter is: "+perimeter);

        if(area > perimeter){
            System.out.println("Area is greater than perimeter");
        }
       else if(perimeter > area){
            System.out.println("Perimeter is greater than Area");
        }
        else{
            System.out.println("Area and Perimeter is equal");
        }
    }
}
