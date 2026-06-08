package TwoDimensionalArrays.BasicOf2DArrays;

import java.util.Scanner;
public class InitializatioonOf2DArrays {
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
        int[][] arr2 = {{1, 5, 6},
                       {7, 9, 11},
                       {8, 1,  1}};
        printArray(arr2);
    }
}
