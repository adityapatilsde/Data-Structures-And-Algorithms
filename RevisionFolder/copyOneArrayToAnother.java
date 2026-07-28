package RevisionFolder;
import java.util.Scanner;

public class copyOneArrayToAnother {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int arr2[] = arr;

        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println("Copied Array: ");
        printArray(arr2);
}}

