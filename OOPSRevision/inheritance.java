package OOPSRevision;

public class inheritance {
     public class Student{
        void display(){
            System.out.println("Student name: Aditya patil");
        }
    }
    class Details extends Student{
         void display(){
             System.out.println("Student name: Adii");
         }
         void bothnames(){
             display(); // child class display
             super.display(); // parent class display
         }
    }

    public static void main(String[] args) {
        inheritance obj = new inheritance(); // Create outer class object
        Details s = obj.new Details(); // Create inner class object

        s.bothnames();

    }

}
