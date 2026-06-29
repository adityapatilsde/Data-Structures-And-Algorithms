package BinarySearch.SearchingProblemSolving;

public class FindPeakIndexMountainArray {
    static int findPeakIndex(int arr[], int start, int end){
        int ans = -1;
        while (start <= end){
            int mid  = start + (end-start)/2;
            if (arr[mid] < arr[mid+1]){
                ans = mid+1;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
              int arr[] = {0,1,0};
        System.out.println("Peak index: "+findPeakIndex(arr,0,arr.length-1));
    }
}
