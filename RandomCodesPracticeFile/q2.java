package RandomCodesPracticeFile;
import java.util.Scanner;
public class q2 {
    static void ProductPrices(int p1,int p2){
        System.out.println("Total price: "+(p1+p2));
        System.out.println("Difference of prices: "+(p1 - p2));
        System.out.println("Quotient of 2 prices: "+(p1 / p2));
        System.out.println("Remainder of 2 prices: "+(p1 % p2));
        System.out.println("Product of 2 prices: "+(p1 * p2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product 1 price: ");
        int p1 = sc.nextInt();
        System.out.println("Enter product 2 price: ");
        int p2 = sc.nextInt();
        System.out.println();
        ProductPrices(p1,p2);
    }
}
