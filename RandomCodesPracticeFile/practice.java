package RandomCodesPracticeFile;

import java.util.Scanner;
public class practice {
        static void displayArr(int arr[]){
            for (int x : arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        static int findMax(int arr[]){
            int mx = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
            }
            return mx;
        }
        static void countSort(int arr[], int place){
            int n = arr.length;
            int output[] = new int[n];
            int max = findMax(arr);
            int count[] = new int[n];

            for (int i = 0; i < arr.length; i++){
                count[arr[i]/place%10]++;
            }

            for (int i = 1; i < count.length; i++ ){
                count[i] += count[i-1];
            }

            for (int i = n - 1; i >= 0; i--){
                int idx = count[arr[i]/place%10]-1;
                output[idx] = arr[i];
                count[arr[i]/place%10]--;
            }
            for (int i = 0; i < arr.length; i++){
                arr[i] = output[i];
            }
        }
        static void radixSort(int arr[]){
            int max = findMax(arr);
            for (int place = 1; max/place > 0; place *= 10){
                countSort(arr,place);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter "+n+" elements: ");
            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Original Array: ");
            displayArr(arr);

            System.out.println("Sorted Array: ");
            radixSort(arr);
            displayArr(arr);
        }
    }



