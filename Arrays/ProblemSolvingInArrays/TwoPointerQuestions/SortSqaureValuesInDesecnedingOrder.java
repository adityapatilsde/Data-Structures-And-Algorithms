package Arrays.ProblemSolvingInArrays.TwoPointerQuestions;

/*given an integer array 'a' sorted in non decreasing order, return an array
of the sqaures of each number sorted in non - decreasing order*/
import java.util.Scanner;
import java.util.Arrays;
public class SortSqaureValuesInDesecnedingOrder {

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] sortedSqaurevalues(int arr[]){
        for (int i = 0; i < arr.length;i++){
            arr[i] = (int) Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        return arr;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Orignal Array: ");
        printArray(arr);

        sortedSqaurevalues(arr);
        System.out.println("Sorted array in sqaure values non decreasing order: ");
        printArray(arr);
    }

}
