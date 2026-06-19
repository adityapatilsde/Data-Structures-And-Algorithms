package Recursion.StringsRecursion;

import java.util.Scanner;
public class ArrSubsetSumRecursion {
    static void subsetSum(int[] a, int n, int idx,int Currentsum ){
        if (idx == a.length){
            System.out.println(Currentsum);
            return;
        }
        // curee idx + curr ans
         subsetSum(a,n,idx+1,Currentsum + a[idx]);
        // curr ans not addding
        subsetSum(a,n,idx+1,Currentsum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,5};
        subsetSum(arr,arr.length,0,0);
    }
}
