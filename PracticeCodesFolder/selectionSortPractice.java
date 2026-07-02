package PracticeCodesFolder;

import java.util.Scanner;
public class selectionSortPractice {
    static void printArray(int arr[]){
        for (int i  = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int min_index = 0;
            for (int j = 1; j < n; j++){
                if (arr[j] < min_index){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index]  = temp;
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
        printArray(arr);

        System.out.println("Sorted Array: ");
        selectionSort(arr);
        printArray(arr);
    }
}
