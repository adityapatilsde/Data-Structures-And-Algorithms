package Arrays.LoopsInArrays.BasicsOfArrays;

import java.util.Scanner;
public class CopyingArrayToArray {

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

        //calling this method function to print array
        System.out.println("Orignal Array");
        PrintArray(arr);

        // copying one array to another
        int [] arr_2 = arr.clone();

        //printing copied array
        System.out.println("Copied array");
        PrintArray(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Orignal array after changing array 2: ");
        PrintArray(arr);

        System.out.println("copied arr_2 after changing arr_2");
        PrintArray(arr_2);
    }
}
