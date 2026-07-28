package RevisionFolder;
import java.util.Scanner;
public class GreatestAmong3Numbers {
    static void GreatestNumCheck(int a,int b,int c){
        if (a > b){
            if (a > c){
                System.out.println(a+" is the greatest number");
            }else {
                System.out.println(c+" is the greatest number");
            }
        }
        else {
            if (b > c){
                System.out.println(b+" is the greatest number");
            }
            else {
                System.out.println(c+" is the greatest number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        GreatestNumCheck(a,b,c);
    }
}
