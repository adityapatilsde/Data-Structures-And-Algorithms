package Arrays.ProblemSolvingInArrays;

import java.util.Scanner;
public class FindElementGreaterThanX {

    static int GreaterValue(int [] arr, int x) {

        int greaterNum = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > x){
                greaterNum += 1;
            }
        }
        return greaterNum;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter "+n+ " elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        System.out.println("The Number of elements greater than "+ x + " are: "+GreaterValue(arr , x));
    }
}
