package PracticeCodesFolder;

import java.util.Scanner;
public class twodarray {
 static void displayArray(int arr[]){
     for (int i = 0; i < arr.length; i++){
         System.out.print(arr[i]+" ");
     }
     System.out.println();
 }
 static void bubbleSort(int arr[]){
     int n = arr.length;
     for (int i = 0; i < n - 1; i++){
         boolean flag = false;
         for (int j = 0; j < n - i -1; j++){
             if (arr[j] > arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                 flag = true;
             }
         }
         if (flag == false){
             return;
         }
     }
 }
 static void selectionSort(int arr[]){
     int n = arr.length;
     for (int i = 0; i < n - 1; i++){
         int min_index = i;
         for (int j = i + 1; j < n; j++){
             if (arr[j] < arr[min_index]){
                 min_index = j;
             }
         }
         int temp = arr[i];
         arr[i] = arr[min_index];
         arr[min_index] = temp;
     }
 }
 static void insertionSort(int arr[]){
     int n = arr.length;
     for (int i = 1; i < arr.length; i++){
         int j = i;
         while (j > 0 && arr[j] < arr[j-1]){
             int temp = arr[j];
             arr[j] = arr[j-1];
             arr[j-1] = temp;
             j--;
         }
     }
 }
 static void merge(int arr[], int l , int mid , int r){
     int n1 = mid - l + 1;
     int n2= r - mid;
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
 static void mergesort(int arr[],int left,int right){
     if (left >= right) return;
     int mid = (left+right)/2;
     mergesort(arr,left,mid);
     mergesort(arr,mid+1,right);
     merge(arr,left,mid,right);
 }
}

