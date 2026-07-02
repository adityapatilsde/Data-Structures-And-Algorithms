package PracticeCodesFolder;

import java.util.Scanner;
public class BubbleSortPractice {
    static void displayArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                return;
            }
        }
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

        System.out.println("Orignal Array: ");
        displayArr(arr);

        System.out.println("Sorted Array: ");
        bubbleSort(arr);
        displayArr(arr);
    }
}



