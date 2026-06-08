package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class ElementGreaterThanK {
    static void GreaterThanK(int arr[], int k){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > k){
                answer = arr[i];
                System.out.print(answer+" ");
            }
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i  < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.println("Elements greater than k: ");
        GreaterThanK(arr,k);
    }
}
