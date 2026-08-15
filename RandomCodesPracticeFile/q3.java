package RandomCodesPracticeFile;
import java.util.Scanner;
public class q3 {
    static void rectangularPlayground(int l,int b){
        int area = l * b;
        System.out.println("Area of rectangular Playground: "+area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangular playground: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangular playground: ");
        int breadth = sc.nextInt();

        rectangularPlayground(length,breadth);
    }
}
