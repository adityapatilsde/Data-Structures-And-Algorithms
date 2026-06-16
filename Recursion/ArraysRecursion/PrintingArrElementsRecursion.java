package Recursion.ArraysRecursion;

import java.util.Scanner;
public class PrintingArrElementsRecursion {

    static void printArray(int [] arr, int indx){
        if (indx == arr.length){
            return;
        }
        System.out.print(arr[indx]+" ");
        printArray(arr, indx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
        }
        printArray(arr,0);
    }
}
