package Arrays.ProblemSolvingInArrays;

/*Find the second maximum value of the array */

import java.util.Scanner;
public class SecondMaxValue {

    static int FindFirstMax(int arr[]){
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int FindSecondMax(int arr[]){
      int mx= FindFirstMax(arr);

      for (int i = 0; i < arr.length; i++){
          if (arr[i] == mx){
              arr[i] =  Integer.MIN_VALUE;
          }
      }
      int secondMax = FindFirstMax(arr);

      return secondMax;

    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();
       int arr[] = new int [n];

       System.out.print("Enter "+n+" elements: ");
       for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }
           System.out.println("The first maximum value of the array: "+ FindFirstMax(arr));
       System.out.println("The second maximum value of the array: "+FindSecondMax(arr));
       }
    }

