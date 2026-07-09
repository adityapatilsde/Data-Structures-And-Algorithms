package LinkedList.LinkedList1;

public class LinkListCreateSingleNode {
    public static class Node {
       int data;
       Node next;
       Node(){
           this.data = data;
       }

    }
    public static void main(String[] args) {
        Node x = new Node();
        System.out.println(x.data);
        // prints default value 0;
        System.out.println(x);
        //prints hexadecimal hash code of object x
        System.out.println(x.next);
        //x.next is null because you created only one node and never made next
        //point to another node so its default value is null
    }
}
