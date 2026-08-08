package WordProblems;
import java.util.Scanner;
public class HotelRoomBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Total number of hotel rooms: ");
        int rooms = sc.nextInt();

        int hotel[] = new int[rooms];

        System.out.println("Enter the number of Operations: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++){
            System.out.println("\nOperation "+(i+1));
            System.out.println("Enter 1 to reserve a room");
            System.out.println("Enter 2 for checkout");
            System.out.println("Enter 3 to list occupied rooms");
            System.out.println("Enter 4 to list vacant rooms");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter room number: ");
                    int roomNo = sc.nextInt();

                    int index = roomNo - 1;

            }
        }
    }
}
