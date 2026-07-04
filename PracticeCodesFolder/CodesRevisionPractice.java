package PracticeCodesFolder;

import java.util.Scanner;
public class CodesRevisionPractice {
static void printArray(int arr[]){
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
static void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
static int partition(int arr[], int start, int end){
    int pivot = arr[start];
    int count = 0;
    for (int i = 1; i <= end; i++){
        if (arr[i] < pivot){
            count++;
        }
    }
    int pivot_index = start+count;
    swap(arr,start,pivot_index);

    int i = 0, j = arr.length-1;
    while (i < pivot_index && j > pivot_index){
        while (arr[i] <= pivot) i++;
        while (arr[j] > pivot) j++;

        if (i < pivot_index && j > pivot_index){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    return pivot_index;
}
static void quickSort(int arr[],int st,int end){

}
}
