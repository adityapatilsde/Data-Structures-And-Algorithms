package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class AllElementsUniqueCheck {
    static boolean UniqueElement(int arr[]){
        boolean unique = true;

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                   unique = false;
                }
            }
        }
        return unique;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean answer  = UniqueElement(arr);
        System.out.println("All Elements unique status: "+answer);
    }
}
