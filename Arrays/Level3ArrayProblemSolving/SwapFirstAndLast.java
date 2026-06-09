package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class SwapFirstAndLast {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elemments: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println("Replaced Array: ");
        int result[] = swap(arr,0,arr.length-1);
        printArray(result);
    }
}
