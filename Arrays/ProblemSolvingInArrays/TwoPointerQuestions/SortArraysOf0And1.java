package Arrays.ProblemSolvingInArrays.TwoPointerQuestions;

import java.util.Scanner;
public class SortArraysOf0And1 {
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroesAndOnes(int [] arr){
        int n = arr.length;
        int zeroes = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                zeroes++;
            }
        }

        for (int i = 0; i < n; i++){
            if (i < zeroes ){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println();

        sortZeroesAndOnes(arr);

        System.out.println("Sorted array in zeroes and ones: ");
        printArray(arr);
    }
}
