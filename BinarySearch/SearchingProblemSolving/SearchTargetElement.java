package BinarySearch.SearchingProblemSolving;

import java.util.Scanner;
public class SearchTargetElement {
    static int search(int arr[], int start, int end,int target){
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]){
                    start = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
            else { // if started to mid is sorted
                if (target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
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

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        System.out.print("Target Element at index: "+search(arr,0,arr.length-1,target));
    }
}
