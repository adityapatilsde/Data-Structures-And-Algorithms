package Arrays.LoopsInArrays.ProblemSolving;

public class MaxValueInArrElements {

    void demo(){
        int age [] = {50,1,2,3,4,5,14,16,18};

        int largest = age[0];

        for (int i = 1; i < age.length; i++){
            if (age[i] > largest){
                largest = age[i];
            }
        }
        System.out.println(largest);
    }

    static void main() {
        MaxValueInArrElements obj = new MaxValueInArrElements();
        obj.demo();
    }
}
