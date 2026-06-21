package SortingAlgorithms.BubbleSort;

import java.util.Scanner;
public class SortAnArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void BubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++ ){ // n - 2 iterations
            for (int j = 0; j< n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);
        printArray(arr);
    }
}
