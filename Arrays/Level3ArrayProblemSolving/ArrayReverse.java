package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class ArrayReverse {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println("Reversed Array: ");
        reverse(arr,0,arr.length-1);
        printArray(arr);
    }
}
