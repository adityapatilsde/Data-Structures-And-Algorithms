package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class SumOfArrayElements {
    static int sumOfArrray(int[] arr){
        int answer = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            answer += arr[i];
        }
        return answer;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of all array elements: "+sumOfArrray(arr));
    }
}
