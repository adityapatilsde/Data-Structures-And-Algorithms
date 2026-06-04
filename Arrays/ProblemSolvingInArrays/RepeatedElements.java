package Arrays.ProblemSolvingInArrays;

/*Given an array 'a'  consisting of integers. Return the first value that is repeating
 in this array. If no value is being repeated return -1 */

import java.util.Scanner;
public class RepeatedElements {

    static int RepeatValue(int arr[]){

        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeating value: "+RepeatValue(arr));

    }

}
