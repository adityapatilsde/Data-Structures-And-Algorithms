package Recursion.ArraysRecursion;

import java.util.Scanner;
public class FindArrayMaxValueRecursion {
    static int FindMaxArr(int [] arr, int indx) {
        // Base case
        if (indx == arr.length-1){
            return arr[indx];
        }
        // Small problem
        int smallAns = FindMaxArr(arr, indx+1);

        //Self work
       return Math.max(arr[indx], smallAns);
    }
    public static void main(String[] args) {
        int arr[] = {3, 10 , 3 , 2 , 5};
        System.out.print("Max value: "+FindMaxArr(arr,0));
    }
}
