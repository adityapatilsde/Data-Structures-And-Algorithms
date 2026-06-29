package BinarySearch.SearchingProblemSolving;

public class FindMinElementIndexInrotatedSortedArr {
    static int BinaruySearch(int arr[], int start, int end){
        int answer = -1;
        int n = arr.length;
        while (start <= end){
            int mid  = start + (end-start)/2;
            if (arr[mid] <= arr[n-1]){
                answer = mid;
                end = mid - 1;
            }else {
                start = mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,1,2};
        System.out.println(BinaruySearch(arr,0,arr.length-1));
    }
}
