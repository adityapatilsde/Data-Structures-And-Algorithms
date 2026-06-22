package SortingAlgorithms.InsertionSort;

public class SortAnArrayInsertionSort {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void InsertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                //swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
      int arr[] = {8, 3 , 6, 5 , 6 , 2};
        System.out.println("Orignal Array: ");
        printArray(arr);

        System.out.println("Sorted Array: ");
      InsertionSort(arr);
      printArray(arr);
    }
}
