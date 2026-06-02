package Arrays.ProblemSolvingInArrays;

import java.util.Scanner;
public class ArraySortingCheck {

    static boolean SortCheck(int [] arr) {

        boolean result = true; ;

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                result = false;
            }
        }
        return result;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.print("Enter "+n+ " elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted Descending order : "+ SortCheck(arr));
    }
}

