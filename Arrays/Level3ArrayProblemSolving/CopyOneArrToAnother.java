package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class CopyOneArrToAnother {
static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
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
        int arr_2[] = arr;
        printArray(arr_2);
    }
}
