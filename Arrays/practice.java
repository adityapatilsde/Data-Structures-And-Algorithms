package Arrays;

import java.util.Scanner;
public class practice {
  static void printArray(int arr[]){
      for (int i = 0; i < arr.length; i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  static boolean linearSearch(int arr[], int x){
      boolean flag = false;
      for (int i = 0; i < arr.length; i++){
          if (arr[i] == x){
              flag = true;
          }
      }
      return flag;
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
      System.out.print("Enter the value to be searched: ");
      int x = sc.nextInt();

       if (linearSearch(arr,x) == true){
           System.out.println(x+" exists in the array");
       }
       else {
           System.out.println(x+" does not exists in the array");
       }
  }
}
