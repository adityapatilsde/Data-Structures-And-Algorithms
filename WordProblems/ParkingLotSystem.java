package WordProblems;
import java.util.Scanner;
public class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total no of parking slots: ");
        int n = sc.nextInt();

        int []slots = new int[n];

        System.out.println("Enter total number of operations: ");
        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++){

            System.out.println("\nOperation "+i);
            System.out.println("Enter 1 to park a car");
            System.out.println("Enter 2 to remove a car");
            System.out.println("Enter 3 to list occupied slots");
            System.out.println("Enter 4 to list Empty slots");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter slot number: ");
                    int slot = sc.nextInt();

                    int index = slot - 1;

                    if (slot < 1 || slot > n){
                        System.out.println("Invalid slot number: ");
                        break;
                    }
                    else if (slots[index] == 0) {
                        System.out.println("Enter car token: ");
                        int token = sc.nextInt();

                        slots[index] = token;
                        System.out.println("Car parked successfully.");
                    }
                    else {
                        System.out.println("Slot already occupied.");
                    }
                    break;

                case 2:
                    System.out.println("Enter slot number: ");
                    slot = sc.nextInt();

                    index = slot - 1;
                    if (index < 0 || index >= n){
                        System.out.println("Invalid slot number.");
                    }
                    else if (slots[index] == 0) {
                        System.out.println("Slot is already empty");
                    }
                    else {
                        slots[index] = 0;
                        System.out.println("Car removed successfully.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied slots:");
                    for (int j = 0;  j < n; j++){
                        if (slots[j] != 0){
                            System.out.println((j+1)+" "+" -> Token"+slots[j]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Empty slots: ");
                    for (int j = 0; j < n; j++){
                        if (slots[j] == 0){
                            System.out.print((j+1)+" ");
                        }
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        }
        sc.close();
    }
}
