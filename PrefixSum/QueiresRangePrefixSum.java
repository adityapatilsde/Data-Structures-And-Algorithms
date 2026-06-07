package PrefixSum;

/*Given an integers of size n .Answer q queries where you need to print the
 sum of values in a given range of indices from 1 to r (both included)
 Note: The values of 1 and r in queires follow 1-based indexing */

import java.util.Scanner;
public class QueiresRangePrefixSum {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
     static int[] makePrefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1];
        }
        return arr;
     }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();
       int arr[] = new int[n+1];

       System.out.print("Enter the elements of the array: ");
       for (int i = 1; i <= n; i++){
           arr[i] = sc.nextInt();
       }

       int[] prefsum = makePrefixSum(arr);

       System.out.print("Enter the number of queires: ");
       int q = sc.nextInt();

       while (q-- > 0){
           System.out.println("Enter the range: ");
           int l = sc.nextInt();
           int r = sc.nextInt();

           int ans = prefsum[r] - prefsum[l - 1];
           System.out.println("Sum "+ ans);


       }

    }
}
