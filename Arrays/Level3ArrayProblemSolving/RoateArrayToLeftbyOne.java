package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class RoateArrayToLeftbyOne {
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
        reverse(arr,0,n-k-1);
        //printArray(arr); // debug statement
        reverse(arr,n-1,k-1);
        // printArray(arr); //debug statement
        reverse(arr,0,n-1);
      //  printArray(arr);// debug statement

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
        System.out.print("Enter the how many positions to be rotated to the left: ");
        int k = sc.nextInt();

        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println("Rotated Array: ");
        int result[] = rotate(arr,k);
        printArray(arr);
    }
}
