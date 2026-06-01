package TwoDimensionalArrays;

public class ArrayExample1 {

    void multiArray(){
        int[][] arr_1 = new int[5][3];
        int [][] arr = {{56 , 43 , 6 },{34 , 7 , 8},{12 , 56 , 8}};

     //   arr[0] = array {is itself a array , arr[0],[2].

        System.out.println(arr[0][0]); // 56
        System.out.println(arr[0][1]); // 43
        System.out.println(arr[0][2]); // 6

        System.out.println(arr[1][0]); // 34
        System.out.println(arr[1][1]); // 7
        System.out.println(arr[1][2]); // 8

        System.out.println(arr[2][0]); // 12
        System.out.println(arr[2][1]); // 56
        System.out.println(arr[2][2]); // 8
    }

    static void main() {
        ArrayExample1 obj = new ArrayExample1();
        obj.multiArray();
    }
}
