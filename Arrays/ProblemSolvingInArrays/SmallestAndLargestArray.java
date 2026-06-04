package Arrays.ProblemSolvingInArrays;

import java.util.Arrays;
import java.util.Scanner;
public class SmallestAndLargestArray {

    static int[] FirstAndLast(int[] arr){
        Arrays.sort(arr);
        int [] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }
   public   static void main() {
      Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of the array: ");
         int n = sc.nextInt();
         int [] arr_1 = new int [n];

         System.out.print("Enter the elements of the array: ");
         for (int i = 0; i < arr_1.length; i++){
             arr_1[i] = sc.nextInt();
         }
         FirstAndLast(arr_1);
       System.out.println("The smallest element: "+arr_1[0]);
       System.out.println("The largest element: "+arr_1[arr_1.length-1]);
    }
}
