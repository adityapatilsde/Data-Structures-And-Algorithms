package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class CountPosivitiveNegativeZero {
    static int positiveCheck(int [] arr){
        int positive = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                positive++;
            }
        }
        return positive;
    }
    static int negativeCheck(int [] arr){
        int negative = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                negative++;
            }
        }
        return negative;
    }
    static int ZeroesCheck(int [] arr){
        int zero = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                zero++;
            }
        }
        return zero;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter "+n+" elements: ");
            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

        System.out.println("No of elements positive:  "+positiveCheck(arr));
        System.out.println("No of elements Negative: "+negativeCheck(arr));
        System.out.println("No of elements zero: "+ZeroesCheck(arr));

    }
}
