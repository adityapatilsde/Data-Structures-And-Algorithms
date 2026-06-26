package BinarySearch;

import java.util.Scanner;
public class BasicLinearSearchApproach {
    static boolean search(int arr[], int x){
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                found = true;
                break;
            }
        }
        return found;
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

        System.out.print("Enter the element value to be searched: ");
        int x = sc.nextInt();

        System.out.print("Element search status: "+search(arr,x));
    }
}
