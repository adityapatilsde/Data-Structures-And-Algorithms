package Arrays;
import java.util.Scanner;

public class revisionFile {
    static void displayArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[],int a, int b){
        int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
    static void reverse(int arr[],int l,int r){
        while (l < r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        displayArr(arr);
        reverse(arr,0,arr.length-1);
        displayArr(arr);

    }
}
