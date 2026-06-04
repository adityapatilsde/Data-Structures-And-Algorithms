package Arrays.ProblemSolvingInArrays;

import java.util.Scanner;
public class ArrayReverseApproach2 {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swapInArray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        printArray(arr);

    }
}
