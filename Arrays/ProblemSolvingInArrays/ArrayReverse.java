package Arrays.ProblemSolvingInArrays;

/*Reverse an array consisting integer values*/

import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse {
    static int[] reverse(int arr[]){
        int n = arr.length;
        int arr_2[] = new int [n];
        int j =0;

        for (int i = n - 1; i >= 0; i--){
            arr_2[j++] = arr[i];
        }
        return arr_2;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5};
        System.out.print("Orignal Array: ");
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int[] ans = reverse(arr);
        System.out.print("Reversed Array: ");
        for (int i =0; i < ans.length; i++){
            System.out.print(+ans[i]+" ");
        }
    }
}
