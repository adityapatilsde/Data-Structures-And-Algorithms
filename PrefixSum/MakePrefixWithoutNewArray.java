package PrefixSum;

import java.util.Scanner;
public class MakePrefixWithoutNewArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] makePrefixSumArray(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            arr[i] += arr[i - 1];
        }
        return arr;
    }

   public static void main() {

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

        makePrefixSumArray(arr);
        System.out.println("Prefix sum Array: ");
        printArray(arr);

    }
}
