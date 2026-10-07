import java.util.Scanner;
class sortingRevision{
   static void BubbleSort(int arr[]){
       int n = arr.length;

       for(int i = 0; i < n - 1; i++){
           boolean flag = false;
           for (int j = 0; j < n - i - 1; j++){
               if (arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   flag = true;
               }
           }
           if(!flag){
               return;
           }
       }
   }
   static void selectionSort(int arr[]){
       int n = arr.length;

       for (int i = 0; i < n - 1; i++){
           int min_index = i;
           for(int j = i + 1; j < n; j++){
               if (arr[j] < arr[min_index]){
                   min_index = j;
               }
           }
           int temp = arr[min_index];
           arr[min_index] = arr[i];
           arr[i] = temp;
       }
   }
   static void insertionSort(int arr[]){
       int n = arr.length;
       for (int i = 1; i < n; i++){
           int j = i;
           while (j > 0 && arr[j] < arr[j - 1]){
               int temp = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = temp;
               j--;
           }
       }
   }
   static void printArray(int arr[]){
       int n = arr.length;
       for (int i = 0; i < n ; i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
}
public class Practice {
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
        sortingRevision.printArray(arr);

        //sortingRevision.BubbleSort(arr);

        sortingRevision.selectionSort(arr);

        System.out.println("Sorted Array: ");
        sortingRevision.printArray(arr);
    }
}