package RandomCodesPracticeFile;

import java.util.Scanner;
public class practice {
    static void swap(int n, int n1){
        int temp = n;
        n = n1;
        n1 = temp;

        System.out.print("student 1 roll no: "+n);
        System.out.println();
        System.out.print("Student 2 roll no: "+n1);
    }
    static void swap2(int r1 , int r2){
        r1 = r1 + r2; // 2 + 5 = 10;
        r2 = r1 - r2;
        r1 = r1 - r2;

        System.out.println("student 1: "+r1);
        System.out.println("student 2: "+r2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student1 roll no: ");
        int rollno = sc.nextInt();

        System.out.print("Enter student2 roll no: ");
        int rollno2 = sc.nextInt();

        swap2(rollno,rollno2);


    }

}




