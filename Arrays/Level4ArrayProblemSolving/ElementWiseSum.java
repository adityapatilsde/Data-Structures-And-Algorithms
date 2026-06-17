package Arrays.Level4ArrayProblemSolving;

import java.util.Scanner;
public class ElementWiseSum {
    static int answer = 0;
    static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sum(int arr[], int arr2[]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr2.length; j++){
                answer = arr[i] + arr2[j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];

        System.out.println("Enter "+m+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(answer);
        }
}
