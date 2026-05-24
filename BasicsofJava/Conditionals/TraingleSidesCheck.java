package BasicsofJava.Conditionals;
/*Take 3 numbers input and tell if they can be the sides pf a triangle */

import java.util.Scanner;
public class TraingleSidesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b){
            System.out.println("All corresponding sides can from a triangle");
        }
        else{
            System.out.println("These sides can not form a triangle");
        }
    }
}
