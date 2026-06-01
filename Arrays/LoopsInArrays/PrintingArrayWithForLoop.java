package Arrays.LoopsInArrays;

public class PrintingArrayWithForLoop {

    void demo(){
        int arr[] = new int[3];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        for (int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }
    }

    static void main() {
        PrintingArrayWithForLoop obj = new PrintingArrayWithForLoop();
        obj.demo();
    }
}
