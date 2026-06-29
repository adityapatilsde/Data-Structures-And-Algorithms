package BinarySearch.SearchingProblemSolving;

import java.util.*;
public class FindTragetInDuplicateArrElements {
    static int search(int arr[],int start, int end, int target){
        while (start <= end){
            int mid  = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                start++;
                end--;
            }
            else if (arr[mid] <= arr[end]) {
                if (target > arr[mid] && target <= arr[end]){
                    start = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (target >= arr[start] && target < arr[mid]){
                    end  = mid - 1;
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

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        System.out.println("Target Element is at index: "+search(arr,0,arr.length-1,target));
    }
}
