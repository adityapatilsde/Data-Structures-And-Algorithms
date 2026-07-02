package PracticeCodesFolder;

import java.util.Scanner;
public class mergeSortPractice {
    static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void merge(int arr[],int l,int mid,int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i,j,k;
        for (i = 0; i < n1; i++) left[i] = arr[l+i];
        for (j = 0; j < n2; j++) right[j] = arr[mid+1+j];

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2){
            if (left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1){
            arr[k++] = left[i++];
        }
        while (j < n2){
            arr[k++] = right[j++];
        }
    }
 static void mergesort(int arr[], int left, int right){
        if (left >= right) return;
        int mid = (left+right)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Orignal Array: ");
        displayArr(arr);

        System.out.println("Sorted array by merge sort: ");
        mergesort(arr, 0, arr.length - 1);
        displayArr(arr);
    }
}