package BinarySearch.BinaryImplementation;

import java.util.Scanner;
public class RecursiveApproachBinarySearch {
    static boolean BinarySearch(int arr[], int start, int end, int target) {
        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return BinarySearch(arr, start, mid - 1, target);
        } else {
             return BinarySearch(arr,mid+1,end,target);
        }
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

        System.out.print("Enter the value to be searched: ");
        int target = sc.nextInt();

        System.out.println("Element existence status: "+BinarySearch(arr,0,arr.length-1,target));
    }
}
