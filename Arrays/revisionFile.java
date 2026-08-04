package Arrays;

import java.util.Scanner;

public class revisionFile {
 static void printArray(int arr[]){
     for (int i = 0; i < arr.length; i++){
         System.out.print(arr[i]+" ");
     }
     System.out.println();
 }
 static int AvgOfArrayElements(int arr[]){
     int n = arr.length;
     int sum = 0;
     for (int i = 0; i < n; i++){
         sum += arr[i];
     }
     return sum / n;
 }
 static int maxElementArray(int arr[]){
     int max = arr[0];
     for (int i = 1; i < arr.length ; i++){
         if (max < arr[i]){
             max = arr[i];
         }
     }
     return max;
 }
 static int minimumElement(int arr[]){
     int minimum = arr[0];
     for (int i = 1; i < arr.length; i++){
         if (minimum > arr[i]){
              minimum = arr[i];
         }
     }
     return minimum;
 }
 static void ElementTypeCount(int arr[]){
     int positive = 0;
     int negative = 0;
     int zeroes = 0;

     for (int i = 0; i < arr.length; i++){
         if (arr[i] > 0){
             positive++;
         }
         else if (arr[i] < 0) {
             negative++;
         }
         else if (arr[i] == 0) {
            zeroes++;
         }
     }
     System.out.println("Positive number count: "+positive);
     System.out.println("Negative number count: "+negative);
     System.out.println("Zeroes count: "+zeroes);
 }
 static void evenOddCount(int arr[]){
     int even = 0, odd = 0;
     for (int i = 0; i < arr.length; i++){
         if (arr[i] %2 == 0 && arr[i] > 0){
             even++;
         }
         else {
             if (arr[i] %2 != 0 && arr[i] > 0){
                 odd++;
             }
         }
     }
     System.out.println("Odd number count: "+odd);
     System.out.println("Even number count: "+even);
 }
 static int minElementIndex(int arr[]){
     int min_index = 0;
     for (int i = 0; i < arr.length; i++){
         if (arr[i] < arr[min_index]){
             min_index = i;
         }
 }
     return min_index;
 }
    static int maxElementIndex(int arr[]){
        int max_index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > arr[max_index]){
                max_index = i;
            }
        }
        return max_index;
    }
    static boolean elementExistenceCheck(int arr[], int k){
     boolean flag = false;
     for (int i = 0; i < arr.length; i++){
         if (arr[i] == k){
             flag = true;
         }
     }
     return flag;
    }
    static void FirstOccurence(int arr[], int k){
     int firstoccurence_index = 0;
     for (int i = 0; i < arr.length; i++){
         if (arr[i] == k){
             firstoccurence_index = i;
             System.out.println("Element first occurred at index: "+firstoccurence_index);
             return;
         }
     }
       // System.out.println("Element first occurence at index: "+firstoccurence_index);
    }
    static void LastOccurence(int arr[], int k){
        int lastoccurence_index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                lastoccurence_index = i;
            }
        }
        System.out.println("Elements last occurred at index: "+lastoccurence_index);
        // System.out.println("Element first occurence at index: "+firstoccurence_index);
    }
    static boolean AllareuniqueElementsCheck(int arr[]){
     boolean flag = true;
     for (int i = 0; i < arr.length; i++){
         for (int  j = i + 1; j < arr.length; j++){
             if (arr[i] == arr[j]){
                 flag = false;
             }
         }
     }
     return flag;
    }
    static void primeNumberElements(int arr[]){
     for (int i = 0; i < arr.length; i++){
         if (arr[i] <= 1)
             continue;

         boolean isPrime = true;

         for (int j = 2; j < arr[i]; j++){
             if (arr[i] %j == 0){
                 isPrime = false;
                 break;
             }
         }
         if (isPrime){
             System.out.println(arr[i]+" is Prime");
         }
     }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
//        System.out.println("Minimum array element: "+minimumElementArray(arr));
//        System.out.println("Types of digits entered: ");
//        ElementTypeCount(arr);
          //evenOddCount(arr);
//        minimumElementindex(arr);

//        System.out.println("Minimum element of the array: "+minimumElement(arr));
//        System.out.println("Maximum element of the array: "+maxElementArray(arr));

//        System.out.print("Enter the value to search its first occurrence in the array: ");
//        int k = sc.nextInt();

//        System.out.println("Element search status: "+elementExistenceCheck(arr,k));
//        FirstOccurence(arr,k);
//        LastOccurence(arr,k);
//        System.out.println("All elements are unique status: "+AllareuniqueElementsCheck(arr));

        primeNumberElements(arr);

    }
}
