package Arrays.Level3ArrayProblemSolving;

import java.util.Scanner;
public class NewArrayWithOnlyEven {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new  int [n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int ans[] = new int[n];
        int answer = 0;

        System.out.println();

        System.out.println("Even elements Array: ");
       for (int i = 0; i < arr.length; i++){
           if (arr[i] %2 == 0){
               answer = arr[i];
               ans[i] = answer;
               System.out.print(ans[i]+" ");
           }
       }
    }
}
