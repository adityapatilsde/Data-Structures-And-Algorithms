package Arrays.LoopsInArrays.BasicsOfArrays;

import java.util.Arrays;
import java.util.Scanner;
public class CopyOfRangeFeature {
    static void PrintArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+ n + " elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Orignal Array: ");
        PrintArray(arr);

        int arr_2[] = Arrays.copyOfRange(arr, 0 , 4);
        System.out.println("Copied Array till index 3");
        PrintArray(arr_2);
        /* Syntax = Arrays.copyofRange(NameofTheArray, RangeStart , RangeEND )
        first enter the array name to be copied and then enter the
         starting range from which the array needs to be copied till the range
         array need to end but the ennding range prints the range entered but at 1 less position from end

          for example copyofRange(arr , from1, to 4) it will not end at 4th index
          it wll end on 3rd index*/


    }
}
