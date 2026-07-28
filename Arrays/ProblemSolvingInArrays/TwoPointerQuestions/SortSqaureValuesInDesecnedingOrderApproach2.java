package Arrays.ProblemSolvingInArrays.TwoPointerQuestions;


import java.util.Scanner;
import java.util.Arrays;
public class SortSqaureValuesInDesecnedingOrderApproach2 {

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] sortedSqaurevalues(int arr[]){
        int n = arr.length;
        int left = 0, right = n - 1;
        int [] ans = new int [n];
        int k = 0;

        while (left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[],int i, int j){
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void main(String[] args) {
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

     int ans[] = sortedSqaurevalues(arr);
     reverse(ans,0,ans.length-1);
        System.out.println("Sorted array in sqaure values non decreasing order: ");
        printArray(ans);
    }

}
