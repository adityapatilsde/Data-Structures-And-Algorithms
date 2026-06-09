package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class RotateByRight {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[], int i , int j){
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
        //  printArray(arr);
        //DEBUG statement
    }
    static int[] rotate(int arr[], int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,n-k-1,0);
         // printArray(arr);
        reverse(arr,k-1, n -1);
        //  printArray(arr);
        reverse(arr,n-1, 0);
        // printArray(arr);

        return arr;
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
        System.out.print("Enter the how many positions to be rotated to the right: ");
        int k = sc.nextInt();

        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println("Rotated Array: ");
        int result[] = rotate(arr,k);
        printArray(arr);
    }
}

