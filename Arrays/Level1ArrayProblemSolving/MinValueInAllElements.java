package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class MinValueInAllElements {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int findMinValue(int arr[]){
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < answer){
                answer = arr[i];
            }
        }
        return answer;
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
        System.out.println("Minimum value in all of the elements: "+findMinValue(arr));
    }
}
