package SortingAlgorithms.CountandRadix;

import java.util.Scanner;
public class SortArrayCountSort {
    static void displayArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int findMax(int arr[]) {
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            }
        }
        return num;
    }
    static void countSort(int arr[]){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr); // Find the largest element of the arr
        int [] count = new int[max+1];
        for (int i = 0; i < arr.length; i++){ // Make frequency array
            count[arr[i]]++;
        }

        //Make prefix sum array of count Array
        for (int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }

        //Find the index of each element in the original array and put it in output array
        for (int i = n - 1; i >= 0; i--){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--; // /tells i have already used this position
        }

        // copy all elements of output to arr
        for (int i = 0; i < arr.length; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal Array: ");
        displayArray(arr);
        System.out.println("Sorted Array: ");
        countSort(arr);
        displayArray(arr);
    }
}
