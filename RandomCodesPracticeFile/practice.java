package RandomCodesPracticeFile;

import java.util.Scanner;
public class practice {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[],int start,int end){
        int pivot = arr[start]; // selecting first element as pivot index
        int count = 0; // setting count as 0 well use this to count no of elements smaller than pivot element
        for (int i = 1; i <= end; i++){  // this loop counts total no of elements smaller than pivot element
            if (arr[i] < pivot){
                count++;
            }
        }
        int pivot_index = start+count; //calculating pivot element index
        swap(arr,start,pivot_index); // setting pivot element to its correct position

        int i = start, j = end; // using 2 pointers start and end of the array
        while (i < pivot_index && j > pivot_index){
            while (arr[i] <= pivot) i++; // here left elements are checked w.r.t to pivot and loop stops at misplaced element position
            while (arr[j] > pivot) j++; // here right elements are checked w.r.t to pivot and loop stops at misplaced element position

            if (i < pivot_index && j > pivot_index){ // here the misplaced elements index are checked and swapped to its correct position
                swap(arr,i,j); // misplaced elements are swapped
                i++;
                j--;
            }
        }
        return pivot_index;
    }
    static void quickSort(int arr[],int st,int end){
        if (st >= end) return;
        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);

        System.out.println("Sorted array by quickSort: ");
        quickSort(arr,0,arr.length-1);
        printArray(arr);

    }
 }

