package RevisionFolder;
import java.util.Scanner;
public class CalculateCostPriceSellingPrice {
    static void calculateProfitLoss(int cp, int sp){
        if (sp < cp){
            System.out.println("Loss gained: "+(cp - sp));
        }
        else if (sp > cp){
            System.out.println("Profit gained: "+(sp - cp));
        }
        else {
            System.out.println("No profit loss gained");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        int cp = sc.nextInt();

        System.out.print("Enter the selling price: ");
        int sp = sc.nextInt();

        calculateProfitLoss(cp,sp);
    }
}
