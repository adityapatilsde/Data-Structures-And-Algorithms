package Package1;

public class Samepackage {

    public static void main(String[] args) {

        Parent obj = new Parent();

        System.out.println(obj.pub); // public \
        System.out.println(obj.pro); // protected
        System.out.println(obj.def); // default
    }
}
