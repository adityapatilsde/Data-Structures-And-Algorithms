package OOPSRevision;
import java.util.Scanner;
public class ClassObjectImplmentation {
        static void TakePriceInput(double arr[],Scanner sc){
            for (int i = 0; i < arr.length; i++){
                System.out.print("Enter product "+(i+1)+" price: ");
                arr[i] = sc.nextDouble();
            }
        }
        static double totalBill(double arr[]){
            int total = 0;
            for (int i = 0; i < arr.length; i++){
                total += arr[i];
            }
            return total;
        }
        static void checkDiscount(double total){
            if(total > 5000){
                double discount = total * 0.10;
                double finalAmount = total - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Final Amount: " + finalAmount);
            }
            else{
                System.out.println("No discount");
                System.out.println("Final Amount: " + total);
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products: ");
        int product = sc.nextInt();

        double arr[] = new double[product];

        TakePriceInput(arr,sc);
        System.out.println();
        System.out.println("Total price: "+totalBill(arr));
        checkDiscount(totalBill(arr));
    }
}
