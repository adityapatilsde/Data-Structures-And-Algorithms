package Arrays.LoopsInArrays;

public class PrintingArrayWithForEachLoop {

    void basicprinting(){
        int regno[] = {1,2,3,4,5,8,10};

        for(int number : regno){
            System.out.print(" "+number);
        }

        /*it has a limitation that it can only print the whole array
        basically the regno all elements are temp storing and number variable
         and printing unitl all the elements are stored and printed completly*/
    }

    static void main() {
       PrintingArrayWithForEachLoop obj = new PrintingArrayWithForEachLoop();
        obj.basicprinting();
    }
}
