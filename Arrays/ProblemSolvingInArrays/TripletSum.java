package Arrays.ProblemSolvingInArrays;

import java.util.Scanner;
public class TripletSum {

    static int tripletSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n;i++){ // first number
            for (int j = i + 1; j < n;j++ ){ // second number
                for (int k = j + 1; k < n; k++){ // third number
                    if (arr[i]+arr[j]+arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int x = sc.nextInt();

        System.out.println("Triple pairs found: "+tripletSum(arr,x));
    }
}
