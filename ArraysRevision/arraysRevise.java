package ArraysRevision;
import Arrays.Level2ArrayProblemSolving.LastOccurence;

import java.util.Scanner;
public class arraysRevise {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int sumofArrayElemnets(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    static int averageofArrElements(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
    static int maxElement(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int minElement(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static void positiveNegativeZeroesCount(int arr[]){
        int n = arr.length;
        int positive = 0, negative = 0, zeroes = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                positive++;
            }
            else if(arr[i] < 0){
                negative++;
            }
            else {
                zeroes++;
            }
        }
        System.out.println("Positive count: "+positive);
        System.out.println("Negative count: "+negative);
        System.out.println("Zeroes count: "+zeroes);
    }
    static void EvenOddElementsCount(int arr[]) {
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                System.out.println("Enter a positive number");
            }
        }
        System.out.println("Even elements count: "+even);
        System.out.println("Odd elements count: "+odd);
    }
    static boolean searchKValueInArray(int arr[],int k){
        boolean kexists = false;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                kexists = true;
                break;
            }
        }
        return kexists;
    }
    static int ElementOccurenceCount(int arr[], int k){
        int Kcount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                Kcount++;
            }
        }
        return Kcount;
    }
    static void FirstOccurence(int arr[], int k){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                System.out.println(k+" first occured at index: "+i);
                break;
            }
        }
    }
    static void LastOccurence(int arr[],int k){
        int Foundindex = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                Foundindex = i;
            }
        }
        System.out.println(k+" last occured at index: "+Foundindex);
    }
    static boolean AllElementsUniqueCheck(int arr[]){
        boolean allUnique = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    allUnique = false;
                }
            }
        }
        return allUnique;
    }
    static int sumOfEvenElements(int arr[]){
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 == 0){
                evenSum += arr[i];
            }
        }
        return evenSum;
    }
    static int sumOfOddElements(int arr[]){
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 != 0){
                oddSum += arr[i];
            }
        }
        return oddSum;
    }
    static void divisibility3and5(int arr[]){
        int divisibleCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %5 == 0 && arr[i] %3 == 0){
                divisibleCount++;
            }
        }
        System.out.println(divisibleCount+" elements are divisible by 5 and 3");
    }
    static void CountPerfectSquares(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j * j <= arr[i]; j++){
              if (j * j == arr[i]){
                 count++;
                 break;
              }
            }
        }
        System.out.println("Perfect square count: "+count);
    }
    static boolean primeNumbers(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    static void countPrime(int arr[]){
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (primeNumbers(arr[i])){
                count++;
            }
        }
        System.out.println("Prime numbers count: "+count);
    }
    static int[] SqaureElementsArray(int arr[]){
        int sqaureArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            sqaureArray[i] = arr[i] * arr[i];
        }
        return sqaureArray;
    }
    static int[] evenElementsArray(int arr[],int evenarr[]){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 == 0){
                evenarr[index] = arr[i];
                index++;
            }
        }
        return evenarr;
    }
    static int[] replaceNegativeWith0(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    static int[] replaceEven1Odd0(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 == 0){
                arr[i] = 1;
            }else {
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
    static void swapFirstAndLast(int arr[]){
        swap(arr,0,arr.length-1);
    }

    static int[] reverseArray(int arr[],int start,int end){
        while (start <= end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    static int[] swapAlternateArrElements(int arr[]){
        for (int i = 0; i < arr.length - 1; i+=2){
            swap(arr,i,i+1);
        }
        return arr;
    }
    static void compareTwoArrays(int arr[], int arr2[]) {
        if (arr.length != arr2.length) {
            System.out.println("Array elements count mismatched");
            return;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != arr2[i]){
                System.out.println("Both the array elements are not equal");
                return;
            }
        }
        System.out.println("Both the array elements are equal");
    }
    static void Bubblesort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                return;
            }
        }
    }
   static void checkElemetsTwoArrays(int arr[],int arr2[]){ // ignore order in this question
        if (arr.length != arr2.length){
            System.out.println("Elements counts mismatched");
            return;
        }
        Bubblesort(arr);
        Bubblesort(arr2);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != arr2[i]){
                System.out.println("Elements are not equal");
                return;
            }
        }
       System.out.println("Both the arrays elements are same ignoring order");
   }

   static int[] mergeTwoArraysInThird(int arr[],int arr2[],int arr3[]) {
       if (arr.length + arr2.length != arr3.length) {
           return arr3;
       }
       int index = 0;
       for (int i = 0; i < arr.length; i++) {
           arr3[index++] = arr[i];
       }
       for (int j = 0; j < arr2.length; j++) {
           arr3[index++] = arr2[j];

       }
   return arr3;
   }

   static int[] commonElements(int arr[],int arr2[],int arr3[]){
        Bubblesort(arr);
        Bubblesort(arr2);
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr[i] == arr2[j]){
                    arr3[index++] = arr[i];
                    break;
                }
            }
        }
        return arr3;
   }

   static int[] uniqueElementsInBoth(int arr1[], int arr2[], int arr3[]){
        int index = 0;

        for (int i = 0; i < arr1.length; i++){
            boolean found  = false;

            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if (!found){
                arr3[index++] = arr1[i];
            }
        }

        for (int i = 0; i < arr2.length; i++){
            boolean found = false;

            for (int j = 0; j < arr1.length; j++){
                if (arr2[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if (!found){
                arr3[index++] = arr2[i];
            }
        }
        return arr3;
   }
    static int CountcommonElements(int arr[],int arr2[],int arr3[]){
        Bubblesort(arr);
        Bubblesort(arr2);
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr[i] == arr2[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    static int[] ElementWiseSum(int arr1[],int arr2[]){
        int index = 0;
        if (arr1.length != arr2.length) {
            return null;
        }
        int arr3[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }
    static int[] ElementWiseProduct(int arr1[],int arr2[]){
        int index = 0;
        if (arr1.length != arr2.length) {
            return null;
        }
        int arr3[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i] * arr2[i];
        }
        return arr3;
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
        System.out.println("Original Array");
        printArray(arr);
//        System.out.println();
//        System.out.println("Sum of array elements: "+sumofArrayElemnets(arr));
//        System.out.println("Average of array elemnts: "+averageofArrElements(arr));
//        System.out.println("Maximum element in the array: "+maxElement(arr));
//        System.out.println("Mininum element in the arrau: "+minElement(arr));
//        System.out.println();
//        System.out.println("Positive Negative and Zeroes count");
//        positiveNegativeZeroesCount(arr);

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
    }
}
