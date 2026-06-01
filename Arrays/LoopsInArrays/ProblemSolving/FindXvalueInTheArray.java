package Arrays.LoopsInArrays.ProblemSolving;

/*Search the given element x in the array , if present then return the index
* also return -1*/

public class FindXvalueInTheArray {

    void maxValue() {
        int arr[] = {1, 5, 3,};
        int x = 5;
        int ans = 0;
        int index = -1; ;


        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                ans = x;
                index = i;
                break;

            }
                else{
                    ans = -1;
                }
            }
        System.out.println(ans);
        System.out.println(index);

        }

    static void main() {
        FindXvalueInTheArray obj = new FindXvalueInTheArray();
        obj.maxValue();
    }

    }

