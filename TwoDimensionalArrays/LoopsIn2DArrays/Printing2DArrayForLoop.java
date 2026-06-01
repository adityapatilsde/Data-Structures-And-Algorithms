package TwoDimensionalArrays.LoopsIn2DArrays;

public class Printing2DArrayForLoop {

    void multiArrays(){
        int[][] arr = {{53 , 43 ,6} , {34 , 7 , 8}};

        for (int i = 0; i < 2; i++ ){ // this loop is written for number of arrays
            for (int j = 0; j < 3; j++){ // this loop is written for the elements the in the array
                System.out.print(" "+arr[i][j]);
            }
        }
    }

    static void main() {
        Printing2DArrayForLoop  obj = new Printing2DArrayForLoop();
        obj.multiArrays();
    }
}
