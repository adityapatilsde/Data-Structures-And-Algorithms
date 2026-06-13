package Recursion;

public class EvenNumbersNToTwo {
    static void EvenNumNto2(int n){
        if (n == 1){
            return ;
        }
        if (n%2 == 0){
            System.out.print(n+" ");
        }
         EvenNumNto2(n-1);
    }
  public  static void main(String[] args) {
        EvenNumNto2(14);
    }
}
