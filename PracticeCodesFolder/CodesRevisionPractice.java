package PracticeCodesFolder;

import Arrays.Level2ArrayProblemSolving.FirstOccurence;
import BasicsofJava.Loops.WhileLoopQuestions.AmstrongNumbers1to100;

import java.util.Scanner;
public class CodesRevisionPractice {
//  static void swap(int arr[], int i, int j) {
//      int temp = arr[i];
//      arr[i] = arr[j];
//      arr[j] = temp;
//  }
//  static void reverseArr(int arr[]){
//      int i = 0, j = arr.length-1;
//      while (i < j){
//          swap(arr,i,j);
//          i++;
//          j--;
//      }
//  }

//static int FirstRepeatedValue(int arr[]){
//    for (int i = 0; i < arr.length - 1; i++){
//        for (int j = i+1; j < arr.length; j++){
//            if (arr[i] == arr[j]){
//                return arr[i];
//            }
//        }
//    }
//    return -1;
//}

//    static int ReaptedValueCount(int arr[], int x){
//        int count = 0;
//         for (int i = 0; i < arr.length; i++){
//            if (arr[i] == x){
//                count++;
//            }
//         }
//         return count;
//    }

//
//    static void sort(int arr[]){
//        for (int i = 0; i < arr.length - 1; i++){
//            for (int j = i+1 ; j < arr.length; j++){
//                if (arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//    static void smallestLargestElement(int arr[]){
//        sort(arr);
//        System.out.println("Smallest element in the array: "+arr[0]);
//        System.out.println("Largest element in the array: "+arr[arr.length-1]);
//    }

//    static int pairsSumCheck(int arr[]){
//        int pairCount = 0;
//        for (int i = 0; i < arr.length - 1; i++){
//            for (int j = i + 1; j < arr.length; j++){
//                if (arr[i] + arr[j] == 7){
//                    pairCount++;
//                }
//            }
//        }
//        return pairCount;
//    }
static int TripletSumCheck(int arr[]){
    int pairCount = 0;
    for (int i = 0; i < arr.length - 1; i++){
        for (int j = i + 1; j < arr.length; j++){
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[i] + arr[j] + arr[k] == 10) {
                    pairCount++;
                }
            }
        }
    }
    return pairCount;
}
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];

      System.out.println("Enter " + n + " elements: ");
      for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
      }
//      System.out.print("Enter the value of x: ");
//      int x = sc.nextInt();

      System.out.print("No of Triplet elements that add up to 10: "+TripletSumCheck(arr));
    }

}
