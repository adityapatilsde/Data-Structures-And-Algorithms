package Arrays;
import java.util.Scanner;
public class revisionFile {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] SqauredArray(int arr[]){
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i] * arr[i];
        }
        return arr2;
    }
    static int[] EvenElements(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 == 0){
                count++;
            }
        }
        int j = 0;
        int arr2[] = new int[count];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 == 0){
                arr2[j++] = arr[i];
            }
        }
        return arr2;
    }
    static int[] replaceNegativeWith0(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static int[] reverse(int arr[],int start,int end){
            while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    static int[] swapAlternate(int arr[]){
        for (int i = 0; i < arr.length; i+=2){
            swap(arr,i,i+1);
        }
        return arr;
    }
    static void AscendingOrderCheck(int arr[]) {
        boolean ascendingOrder = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascendingOrder = false;
                break;
            }
        }
        if (ascendingOrder){
            System.out.println("Array is in ascending order");
        }
        else {
            System.out.println("Array is not in ascending order");
        }

    }
    static void DescendingOrderCheck(int arr[]) {
        boolean ascendingOrder = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                ascendingOrder = false;
                break;
            }
        }
        if (ascendingOrder){
            System.out.println("Array is in descending order");
        }
        else {
            System.out.println("Array is not in descending order");
        }

    }
    static int FirstLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int secondLargest(int arr[]){
        int firstlargest = FirstLargest(arr);
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != firstlargest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    static void diffbtwnLargestSmallest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Differnce between the largest and the smallest array: " + (max - min));
    }
    static void bubblesort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                return;
            }
        }
    }
    static void SumOfAllExceptminmax(int arr[]){
      bubblesort(arr);
      int sum = 0;
      for (int i = 1; i < arr.length - 1; i++){
          sum += arr[i];
      }
        System.out.println("Sum of all elements except the largest and the smallest: "+sum);
    }
    static int ElementsGreaterThanAvg(int arr[]){
        int count = 0,sum = 0,average = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
         average = sum / arr.length;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > average){
                count++;
            }
        }
        return count;
    }
    static void FrequencyDistinctElements(int arr[]){

        for (int i = 0; i < arr.length; i++){
            boolean visited = false;
            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    visited = true;
                    break;
                }
            }
            if (visited){
                continue;
            }
            int count = 1;
            for (int k = i + 1 ; k < arr.length; k++){
                if (arr[i] == arr[k]){
                    count++;
                }
            }
            System.out.println(arr[i]+" -> "+count);
        }
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
        printArray(arr);
//        System.out.println("Sqaured elements Array: ");
//       printArray(SqauredArray(arr));
//        System.out.println("Even Elements Array: ");
//        printArray(EvenElements(arr));
//        System.out.println("Replaced negatives with zeroes: ");
//        printArray(replaceNegativeWith0(arr));
//        System.out.println("Reversed Array: ");
//        printArray(reverse(arr,0,arr.length-1));
//        System.out.println("Swapped alternate elements: ");
//        printArray(swapAlternate(arr));
//        AscendingOrderCheck(arr);
//        System.out.println();
//        DescendingOrderCheck(arr);
//        System.out.println();
//        System.out.println("First largest element in the array: "+FirstLargest(arr));
//        System.out.println();
//        System.out.println("Second largest element in the array: "+secondLargest(arr));
//        System.out.println();
//        diffbtwnLargestSmallest(arr);
//        SumOfAllExceptminmax(arr);
        //System.out.println("Elements greater than array average: "+ElementsGreaterThanAvg(arr));
        FrequencyDistinctElements(arr);

    }
}
