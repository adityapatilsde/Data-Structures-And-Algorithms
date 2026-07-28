package RevisionFolder;
import java.util.Scanner;
public class RverseAnArray {
    static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] reverse(int arr[]){
        int j = 0;
        int arr2[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Orignal Array: ");
        printArr(arr);
        System.out.println("Reversed Array: ");
        printArr(reverse(arr));
    }
}
