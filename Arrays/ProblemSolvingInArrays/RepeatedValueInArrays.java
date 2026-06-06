package Arrays.ProblemSolvingInArrays;


import java.util.Scanner;

public class RepeatedValueInArrays {
    static int repeatedElements(int [] arr , int x){

        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
             count++;
            }
        }
        return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        System.out.println("COUNT OF X: "+ repeatedElements(arr, x));


    }
}
