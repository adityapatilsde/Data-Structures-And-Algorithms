package StepWeek1Assignment;
import java.util.Scanner;
public class Question4 {
    static  void analyzeInventory(int[] sectionA, int[] sectionB){

        int sectionATotal = 0;
        int sectionBTotal = 0;
        int highestQuantity = 0;

        for (int i = 0; i < sectionA.length; i++){
            sectionATotal += sectionA[i];
            sectionBTotal += sectionB[i];
        }
        int max1 = sectionA[0];
        int indexA = 0;
        for (int i = 1; i < sectionA.length; i++){
            if (sectionA[i] > max1){
                max1 = sectionA[i];
                indexA = i;
            }
        }

        int max2 = sectionB[0];
        int indexB = 0;
        for (int i = 1; i < sectionB.length; i++){
            if (sectionB[i] > max2){
                max2 = sectionB[i];
                indexB = i;
            }
        }

        System.out.println("Section A Total: "+sectionATotal+" | Section B Total: "+sectionBTotal);
        if (sectionATotal == sectionBTotal){
            System.out.println("Status: Balanced");
        }
        else {
            System.out.println("Status: Not balanced");
        }


        if (max1 >= max2){
            highestQuantity = max1;
            System.out.println("Highest Quantity: " + highestQuantity
                    + " (Section A, Item " + (indexA + 1) + ")");
        }
        else {
            highestQuantity = max2;
            System.out.println("Highest Quantity: " + highestQuantity
                    + " (Section B, Item " + (indexB + 1) + ")");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int productCount = sc.nextInt();

        int sectionA[] = new int[productCount];
        int sectionB[] = new int[productCount];

        System.out.print("Enter section A products quantity: ");
        for (int i = 0; i < productCount; i++){
            sectionA[i] = sc.nextInt();
        }

        System.out.print("Enter section B products quantity: ");
        for (int i = 0; i < productCount; i++){
            sectionB[i] = sc.nextInt();
        }
        analyzeInventory(sectionA,sectionB);
    }
}
