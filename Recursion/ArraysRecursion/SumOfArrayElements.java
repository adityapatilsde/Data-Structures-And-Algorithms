package Recursion.ArraysRecursion;

import java.util.Scanner;
public class SumOfArrayElements {
static int sumOfElements(int [] arr, int x){
    if (x == arr.length-1){
        return arr[x];
    }
   return  arr[x] + sumOfElements(arr,x+1);
}
public static void main(String[] args) {
    int arr[] = {10, 20, 30};
    System.out.println(sumOfElements(arr,0));
}
}
