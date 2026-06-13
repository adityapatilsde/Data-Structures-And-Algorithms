package Recursion;

public class PRaiseToPowerQ {
    static int powerq(int p,int q ){
        if (q == 0){
            return 1;
        }
       return powerq(p,q-1)*p;
    }

    static void main(String[] args) {
        System.out.println(powerq(5,2));
    }
}
