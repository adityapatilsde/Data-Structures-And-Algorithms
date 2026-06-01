package TwoDimensionalArrays;

public class Printing2DArrayForLoopApproach2 {
    void demo1(){
        int [][]  multiarrr = {{10,20,30} , {40,50,60}};

        for (int i = 0; i < multiarrr.length; i++){
            //arr[0] and arr[1]
            for (int j = 0; j < multiarrr[i].length; j++){
                System.out.println(multiarrr[i][j]);
            }
        }
    }

    static void main() {
        Printing2DArrayForLoopApproach2 obj1 = new Printing2DArrayForLoopApproach2();
        obj1.demo1();
    }
}
