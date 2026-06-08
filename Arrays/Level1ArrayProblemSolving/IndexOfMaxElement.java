package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class IndexOfMaxElement {
    static int maxElementIndex(int arr[]){
        int maxindex = 0;
        int value = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > value){
                value = arr[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The index of the maximum value in all of the elements: "+maxElementIndex(arr));
    }
}
