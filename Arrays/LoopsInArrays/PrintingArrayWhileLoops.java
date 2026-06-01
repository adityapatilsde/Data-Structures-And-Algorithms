package Arrays.LoopsInArrays;

public class PrintingArrayWhileLoops {
    void arrprint(){
        int age[] = {1,2,3,50,45,75,18};

        int i = 0;
        while (i < 7){
            System.out.print(" "+age[i]);
            i++;
        }
    }

    static void main() {
        PrintingArrayWhileLoops obj = new PrintingArrayWhileLoops();
        obj.arrprint();
    }
}
