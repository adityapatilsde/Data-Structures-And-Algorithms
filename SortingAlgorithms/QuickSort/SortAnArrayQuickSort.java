package SortingAlgorithms.QuickSort;

import java.util.Scanner;
public class SortAnArrayQuickSort {
    static void displayArray(int arr[]){
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
    static int partition(int arr[], int st, int end){
         int pivot  = arr[st];
         int cnt = 0;
         for (int i = st+1; i <= end; i++){
             if (arr[i] < pivot) cnt++;
         }
         int pivotIdx = st + cnt;
         swap(arr,st,pivotIdx);
         int i = st, j = end;
         while (i < pivotIdx && j > pivotIdx){
             while (arr[i] <= pivot) i++;
             while (arr[j] > pivot) j--;

             if (i < pivotIdx && j > pivotIdx){
                 swap(arr,i,j);
                 i++;
                 j--;
             }
         }
         return pivotIdx;
    }
    static void quickSort(int arr[], int st, int end){
        if (st >= end) return;
        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
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
        quickSort(arr,0,arr.length-1);
        displayArray(arr);
    }
}
