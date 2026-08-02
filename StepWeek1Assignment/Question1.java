package StepWeek1Assignment;
import java.util.Scanner;
public class Question1 {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] != 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    static void checkDuplicateSeats(int seatNumbers[]){
        boolean flag = false;
        int checker[] = new int[seatNumbers.length];
        for (int i = 0; i < seatNumbers.length; i++){
            for (int j = i + 1; j < seatNumbers.length ; j++){
                if (seatNumbers[i] == seatNumbers[j]){
                    checker[i] = seatNumbers[i];
                    flag = true;
                }
            }
        }
        if (flag == true) {
            System.out.print("Duplicate seats detected: ");
                printArray(checker);
            }
        else {
            System.out.println("No duplicate seats detected");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int studentCount = sc.nextInt();
        System.out.println();

        int seats[] = new int[studentCount];

        System.out.print("Enter "+studentCount+" seat numbers: ");
        for (int i = 0; i < seats.length; i++){
            seats[i] = sc.nextInt();
        }
        checkDuplicateSeats(seats);

    }
}
