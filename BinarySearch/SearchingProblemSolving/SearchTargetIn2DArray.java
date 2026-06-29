package BinarySearch.SearchingProblemSolving;

import java.util.Scanner;
public class SearchTargetIn2DArray {
    static boolean searchMatrix(int arr[][], int target){
        int n = arr.length, m = arr[0].length;

        int start = 0, end = n * m - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            int midElement = arr[mid/m][mid%m];

            if (midElement == target){
                return true;
            }
            else if (target < midElement) {
                 end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the 2D array: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of coloumns for the 2D array: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the target element to be searched: ");
        int target = sc.nextInt();

        System.out.println("Element existence status: "+searchMatrix(arr,target));
    }
}
