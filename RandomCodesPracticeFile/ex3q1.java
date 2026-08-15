package RandomCodesPracticeFile;

import java.util.Scanner;
public class ex3q1 {
    public static class superMarket{
         void TakePriceInput(Scanner sc,int arr[]){
            for (int i = 0; i < arr.length; i++){
                System.out.print("Enter product "+(i+1)+" price: ");
                arr[i] = sc.nextInt();
            }
        }
         int totalPrice(int arr[]){
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            return sum;
        }
          void disocuntCheck(int arr[]){
            if (totalPrice(arr) > 5000){
                System.out.println("Discount applicable");
            }
            else {
                System.out.println("Discount not applicable");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of products: ");
        int productCount = sc.nextInt();
        int arr[] = new int[productCount];

        superMarket s = new superMarket();
        s.TakePriceInput(sc,arr);
        System.out.println();
        System.out.println("Total amount: "+s.totalPrice(arr));
        s.disocuntCheck(arr);
    }
}
