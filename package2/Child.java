package package2;

import Package1.Parent;

public class Child extends Parent {

    public static void main(String[] args) {

        Child obj = new Child();

        System.out.println(obj.pub); // public ✅
        System.out.println(obj.pro); // protected ✅

        // System.out.println(obj.pri); private
        // System.out.println(obj.def);  default
    }
}
