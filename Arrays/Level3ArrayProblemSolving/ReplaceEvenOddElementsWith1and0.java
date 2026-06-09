package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class ReplaceEvenOddElementsWith1and0 {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] ReplaceElements(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                arr[i] = 1;
            }
            else {
                if (arr[i] %2 != 0){
                    arr[i] = 0;
                }
                else {
                    if (arr[i] == 0){
                        arr[i] = 0;
                    }
                }
            }
        }
        return arr;
    }
    public static void main() {
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

        int result[] = ReplaceElements(arr);
        System.out.println("New Replaced Array:  ");
        printArray(arr);
    }
}
