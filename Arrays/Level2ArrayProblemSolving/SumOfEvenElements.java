package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class SumOfEvenElements {
    static int SumofEven(int arr[]){
        int answer = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 == 0){
                answer += arr[i];
            }
        }
        return answer;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int result = SumofEven(arr);
        System.out.println("Sum of even numbers: "+result);
    }
}
