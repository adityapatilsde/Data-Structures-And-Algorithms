package TwoDimensionalArrays.ProblemSolving2dArrays;

import java.util.Scanner;
public class TransposeOfAMatrix {
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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

        System.out.println("Transpose of matrix: ");
        int[][] ans = matrixTranspose(arr,r,c);
        printMatrix(ans);
    }
}
