package LinkedList.LinkedList1;

public class PrintLinkListUsingForLoop {
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
        Node c = new Node(15);
        Node d = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;
        for (int i = 1; i <= 4; i++){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
