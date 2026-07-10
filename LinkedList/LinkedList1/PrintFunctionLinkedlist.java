package LinkedList.LinkedList1;

public class PrintFunctionLinkedlist {
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);

    }
}
