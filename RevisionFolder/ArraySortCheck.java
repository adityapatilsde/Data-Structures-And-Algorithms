package RevisionFolder;
import java.util.Scanner;
public class ArraySortCheck {
    static boolean SortCheck(int arr[]){
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                result = false;
            }
        }
        return result;
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
        System.out.println("Sorted in ascending order: "+SortCheck(arr));
    }
}
