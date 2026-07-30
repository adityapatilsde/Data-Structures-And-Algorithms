package ObjectOrientedProgramming;

public class thisKeyword {
    public static class student{
         public String name;
         private int rno;
         double percent;

         public int getRno(){
             return rno;
         }
         public void setRno(int rno){
             this.rno = rno;
         }
    }

    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.getRno());
        s.setRno(992);
        System.out.println(s.getRno());
    }
}
