package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class LastOccurence {
    static int LastRepeatedCheck(int arr[],int x){
       int index = -1;

       for (int i = 0; i < arr.length; i++){
           if (arr[i] == x){
               index = i;
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
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of X to check its last occurence in the array: ");
        int x = sc.nextInt();

        int answer = LastRepeatedCheck(arr,x);
        System.out.println("Last Occurence of "+x+" at index: "+answer);

        System.out.println("If the Occurence index shows -1 it means "+x+" does not exists if not ignore this message");
    }
}
