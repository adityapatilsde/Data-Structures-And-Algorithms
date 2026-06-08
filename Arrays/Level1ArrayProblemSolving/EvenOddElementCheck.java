package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class EvenOddElementCheck {
    static int EvenCheck(int arr[]) {
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }
    static int OddCheck(int arr[]) {
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }
    static int ZeroCheck(int arr[]) {
        int zeroes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes ++;
            }
        }
        return zeroes;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size pf the array: ");
        int n  = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("No of elements even: "+EvenCheck(arr));
        System.out.println("No of elements Odd: "+OddCheck(arr));
        System.out.println("No of elements zero: "+ZeroCheck(arr));
    }

}