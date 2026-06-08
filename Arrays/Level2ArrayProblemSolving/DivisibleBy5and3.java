package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class DivisibleBy5and3 {
    static int DivisibilityCheck(int arr[]){
        int count = 0;

        for (int i= 0; i < arr.length; i++){
            if (arr[i] %3 == 0 && arr[i] %5 == 0){
                count++;
            }
        }
        return count;
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
        int result = DivisibilityCheck(arr);
        System.out.println("No of element count divisible by both 5 and 3 is: "+result);

    }
}
