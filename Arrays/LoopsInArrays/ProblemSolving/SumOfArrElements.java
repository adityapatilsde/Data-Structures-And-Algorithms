package Arrays.LoopsInArrays.ProblemSolving;

public class SumOfArrElements {

    void addition(){
        int arr[] = {1,5,3};

        int ans = 0;
        for (int i = 0; i < arr.length; i++){
            ans += arr[i];
        }
        System.out.println("The sum of array elements is: "+ans);
    }

    static void main() {
        SumOfArrElements obj = new SumOfArrElements();
        obj.addition();
    }
}
