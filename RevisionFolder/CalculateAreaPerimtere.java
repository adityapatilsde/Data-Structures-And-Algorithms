package RevisionFolder;

import java.util.Scanner;
public class CalculateAreaPerimtere {
    static int calculateArea(int length , int breadth){
        int area = length * breadth;
        return area;
    }
    static  int calculatePerimter(int length, int breadth){
        int perimeter = 2 * (length + breadth);
        return  perimeter;
    }
    static void calculateGreaterValue(int area, int perimeter){
        if (area > perimeter){
            System.out.println("Area is greater than the perimeter");
        }
        else {
            System.out.println("perimeter is greater than the area");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();

        System.out.println();

        System.out.println("Area of the rectangle: "+calculateArea(l,b));
        System.out.println("Perimeter of the rectangle: "+calculatePerimter(l,b));

        System.out.println();

        calculateGreaterValue(calculateArea(l,b),calculatePerimter(l,b));
    }
}
