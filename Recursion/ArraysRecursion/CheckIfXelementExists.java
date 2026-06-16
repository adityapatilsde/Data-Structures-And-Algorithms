package Recursion.ArraysRecursion;

import java.util.Scanner;
public class CheckIfXelementExists {
    static boolean FindElement(int [] arr, int idx, int x){
        if (idx == arr.length ){
            return false;
        }
        if (arr[idx] == x){
            return true;
        }
        return FindElement(arr,idx+1,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to check its existence: ");
        int x = sc.nextInt();

        System.out.println(FindElement(arr,0,x));
    }
}
