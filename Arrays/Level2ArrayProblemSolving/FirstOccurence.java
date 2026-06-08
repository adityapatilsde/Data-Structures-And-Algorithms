package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class FirstOccurence {
    static int OccurenceCheck(int arr[], int x){
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
            else {
                index = -1;
            }
        }
        return index;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i  < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of X to check its first occurence in the array: ");
        int x = sc.nextInt();

        int answer = OccurenceCheck(arr,x);
        System.out.println("First Occurence of "+x+" at index: "+answer);

        System.out.println("If  Occurence index shows -1 it means "+x+" doesnot exists if not ignore this message");
    }
}
