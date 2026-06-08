package TwoDimensionalArrays.BasicOf2DArrays;

import java.util.Scanner;
public class TwoDInputElementsFromUser {
   static void printArray(int[][] arr){
       for (int i = 0; i < arr.length; i++){
           for (int j = 0; j < arr[i].length; j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
   }
   public static void main() {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number of rows of the 2d array: ");
       int r = sc.nextInt();

       System.out.print("Enter number of coloumns of the 2d array: ");
       int c = sc.nextInt();

       int[][] arr = new int[r][c];

       System.out.println("Enter "+r*c+" elements: ");
       for (int i = 0; i < r; i++){
           for (int j = 0; j < c; j++){
               arr[i][j] = sc.nextInt();
           }
       }
       printArray(arr);
   }
}
