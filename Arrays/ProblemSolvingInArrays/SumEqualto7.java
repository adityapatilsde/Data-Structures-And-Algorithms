package Arrays.ProblemSolvingInArrays;

import java.util.Scanner;
public class SumEqualto7 {

    static int PairsCheck(int[] arr , int x){
        int n = arr.length;
        int answer = 0;
        for (int i = 0; i < n; i++){ // 5 7 10 3 4 2
            for (int j = i + 1; j < n; j++){
                if (arr[i] + arr[j] == x){
                     answer++;
                }
                else {
                    return -1;
                }
            }
        }
        return answer;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target sum:");
        int target = sc.nextInt();

        System.out.println(PairsCheck(arr,target));

    }

}
