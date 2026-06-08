package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class RepeatingElementCount {
    static int RepeatedCount(int[] arr, int x){
        int count = 0;

        for (int i = 0; i < arr.length; i++){
                if (arr[i] == x){
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
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("The number of count x repeated is: "+RepeatedCount(arr,x));
    }
}
