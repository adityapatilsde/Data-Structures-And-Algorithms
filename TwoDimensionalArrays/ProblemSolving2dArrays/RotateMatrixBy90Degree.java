package TwoDimensionalArrays.ProblemSolving2dArrays;

import java.util.Scanner;
public class RotateMatrixBy90Degree {
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int[] arr){
         int i = 0 , j = arr.length-1;

         while (i < j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
         }
    }
    static int[][] matrixTranspose(int[][] arr, int r,int c){
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static int[][] rotate(int[][] matrix, int r, int c){

        int[][] transposed = matrixTranspose(matrix,r,c);
        for (int i = 0; i < matrix.length; i++){
            reverseArray(transposed[i]);
        }
        return transposed;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of coloumns of the matrix: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter "+r*c+" elements: ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printMatrix(arr);

        System.out.println("Matrix after 90 degree rotation: ");
        int[][] rotated = rotate(arr,r,c);
        printMatrix(rotated);
    }
}

