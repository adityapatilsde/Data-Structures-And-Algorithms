package Recursion;

public class searchXelement {
    static boolean search(int [] arr, int n, int target, int idx){
        //Base case
        if (idx >= n) return false;
        //Self work
        if (arr[idx] == target) return true;
        //Recursive work
        return search(arr,n,target,idx+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 3;
        if (search(arr,arr.length,target,0)){
            System.out.println("Yes");
        }1230
        else {
            System.out.println("No");
        }
    }
}
