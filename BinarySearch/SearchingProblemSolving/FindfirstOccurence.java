package BinarySearch.SearchingProblemSolving;

import java.util.Scanner;
public class FindfirstOccurence {
    static int BinarySearch(int arr[],int start, int end, int target) {
        while (start <= end) {
            int mid  = (start+end)/2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
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
        System.out.print("Enter the element to search its first occurrence: ");
        int x = sc.nextInt();

        System.out.println(BinarySearch(arr,0, arr.length-1,x));
        }
    }

