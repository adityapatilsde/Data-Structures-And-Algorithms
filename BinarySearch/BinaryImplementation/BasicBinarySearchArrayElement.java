package BinarySearch.BinaryImplementation;

import java.util.Scanner;

public class BasicBinarySearchArrayElement {
    static boolean binarySearch(int arr[], int target){
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end){
            int mid = (start+end)/2;
            if (arr[mid] == target){
                return true;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
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
        System.out.print("Enter the target value to be searched: ");
        int target = sc.nextInt();

        System.out.println("Element existence status: "+binarySearch(arr,target));

    }
}
