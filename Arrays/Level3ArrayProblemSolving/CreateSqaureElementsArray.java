package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class CreateSqaureElementsArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = new int [n];

        System.out.println("Orignal Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Sqaured elements Array: ");
        for (int i = 0; i < arr.length;i++){
            ans[i] = arr[i] * arr[i];
            System.out.print(ans[i]+" ");
        }
    }
}
