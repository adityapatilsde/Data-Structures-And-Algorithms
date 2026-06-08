package Arrays.Level2ArrayProblemSolving;

import java.util.Scanner;
public class PerfectSqaureCount {
    static int PerfectSquare(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % (Math.sqrt(arr[i])) == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = PerfectSquare(arr);
        System.out.println("Count of elements which are perfect sqaure: "+result);
    }
    }



