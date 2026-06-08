package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class CheckIfXExists {
    static boolean CheckXvalue(int[] arr, int x) {
        boolean existence = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                existence = true;
            }
        }
        return existence;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of X to check if it exists: ");
        int x = sc.nextInt();

       boolean answer =  CheckXvalue(arr,x);
        System.out.println(answer);
    }
}
