package TwoDimensionalArrays.ProblemSolving2dArrays;

import java.util.Scanner;

public class AdditionOf2DArrays {
        static void printMatrix(int[][] arr){
            for (int i = 0; i < arr.length; i++){
                for (int  j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        static void sum(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
            if (r1 != r2 || c1 != c2){
                System.out.println("Wrong input - Addition not possible");
                return;
            }

            int[][] sum = new int[r1][c1];

            for (int i = 0; i < r1; i++){
                for (int j = 0; j < c1; j++){
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            printMatrix(sum);
        }
        public static void main() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of rows in the array: ");
            int r1 = sc.nextInt();
            System.out.print("Enter the number of coloumns in the array: ");
            int c1 = sc.nextInt();

            int arr2[][] = new int [r1][c1];

            System.out.println("Enter "+r1*c1+" elements: ");
            for (int i = 0; i < r1; i++){
                for (int j = 0; j < c1; j++){
                    arr2[i][j] = sc.nextInt();
                }
            }

            System.out.println();

            System.out.print("Enter the rows fpr the second array: ");
            int r2 = sc.nextInt();
            System.out.print("Enter the coloumns of the second array: ");
            int c2 = sc.nextInt();

            int arr3[][] = new int[r2][c2];

            System.out.println("Enter "+r2*c2+" elements: ");
            for (int i = 0; i < r2 ; i++){
                for (int j = 0; j < c2; j++){
                    arr3[i][j] = sc.nextInt();
                }
            }
            sum(arr2 ,r1 ,c1 ,arr3 ,r2 ,c2 );
        }
    }

