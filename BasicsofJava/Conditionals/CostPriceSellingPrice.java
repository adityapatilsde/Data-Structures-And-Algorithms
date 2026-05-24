package BasicsofJava.Conditionals;
import java.util.Scanner;
public class CostPriceSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter cost price: ");
        int a = sc.nextInt();

        System.out.print("Enter selling price: ");
        int b = sc.nextInt();

        if(a < b){
            System.out.print("Your Profit is: ");
            System.out.println(b - a);
        }
        if(a > b){
            System.out.print("Your loss is: ");
            System.out.println(a - b);
        }
        else {
            System.out.println("No profit no loss gained");
        }

    }
}
