package Arrays.LoopsInArrays.BasicsOfArrays;

import java.util.Arrays;
import java.util.Scanner;
public class CopyOffFeature {
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

        int arr_2[] = Arrays.copyOf(arr , 4);
        System.out.println("Copied Array till length 4");
        PrintArray(arr_2);
        /* Syntax = Arrays.copyof(arrayNamw , ArrayLenghthToBeCopied)
        first enter the array name to be copied and then enter the
         array length to be copied */

        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Copied array after changing: ");
        PrintArray(arr_2);

    }
}
