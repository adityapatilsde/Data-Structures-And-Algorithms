package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class IndexOfMinimumElement {
    static int indexOfMinElement(int arr[]){
        int max = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the szie of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The index pf the minimum value in all of the elements: "+indexOfMinElement(arr));
    }
}
