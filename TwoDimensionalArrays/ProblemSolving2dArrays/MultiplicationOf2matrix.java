package TwoDimensionalArrays.ProblemSolving2dArrays;

import java.util.Scanner;
public class MultiplicationOf2matrix {
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int mul[][] = new int[r1][c2];

        for (int i = 0; i < r1; i++) { // represents row
            for (int j = 0; j < c2; j++) { // represents coloumn
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices: ");
        printMatrix(mul);



}
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for Matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of coloumns for Matrix 2: ");
        int c1 = sc.nextInt();

        int arr2[][] = new int[r1][c1];

        System.out.println("Enter " + r1 * c1 + " elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.print("Enter the number of rows for Matrix 2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of coloumns for Matrix 2: ");
        int c2 = sc.nextInt();

        int arr3[][] = new int[r2][c2];

        System.out.println("Enter " + r2 * c2 + " elements: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        printMatrix(arr2);

        System.out.println("Matrix 2: ");
        printMatrix(arr3);

        multiply(arr2, r1 , c1 , arr3, r2 , c2);
    }
    }

