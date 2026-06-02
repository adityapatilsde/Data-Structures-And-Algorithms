package Arrays.LoopsInArrays.BasicsOfArrays;

import java.util.Scanner;

    public class TakingInputArray {
        static void main() {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
        int arr[] = new int[n];

            System.out.print("Enter " + n + " elements: ");
            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }


        }
    }


