package Arrays;

 class  BasicArrays {

    void demoArrays() {
        int [] ages = new int[3];
        float [] weights = new float [3];
        String [] names = {"Rahul" , "Raj" , "Aradhya"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;
       // ages[4] = 40; // out of bounds error will be given as the ages range  is 3

        weights[0] = 23.0f;
        weights[1] = 45.64f;


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}

public class Main {
    public static void main(String[] args) {
        BasicArrays obj = new BasicArrays();
        obj.demoArrays();
    }
}
