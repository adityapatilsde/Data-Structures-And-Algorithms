package Arrays.Level1ArrayProblemSolving;

import java.util.Scanner;
public class AverageOfALLElements {
    static float sum(float arr[]){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
    static float averageOfElements(float [] arr){
        float sumofAll = sum(arr);
        float n = arr.length;
        float avg = sumofAll / n;

        return avg;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        float arr[] = new float[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Average pf all elements: "+averageOfElements(arr));
    }

}
