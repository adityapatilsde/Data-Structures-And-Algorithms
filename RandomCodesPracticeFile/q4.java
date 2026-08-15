package RandomCodesPracticeFile;
import java.util.Scanner;
public class q4 {
    static void swap(int r1,int r2){
        int temp = r1;
        r1 = r2;
        r2 = temp;
        System.out.println("Student 1 roll no: "+r1);
        System.out.println("Student 2 roll no: "+r2);
    }
    static void swap2(int r1,int r2){
        // r1 = 5, r2 = 10
        r1 = r1 + r2; // r1 = 5 + 10 = 15
        r2 = r1 - r2; // 15 - 10 = 5
        r1 = r1 - r2;
        System.out.println("Student 1 roll no: "+r1);
        System.out.println("Student 2 roll no: "+r2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student 1 roll no: ");
        int r1 = sc.nextInt();
        System.out.print("Enter student 2 roll no: ");
        int r2 = sc.nextInt();

        swap(r1,r2);
        swap2(r1,r2);
    }
}
