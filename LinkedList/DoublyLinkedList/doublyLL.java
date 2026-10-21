package DoublyLinkedList;

public class doublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }
    public static void displayforward(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void displayReverse(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.prev;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(9);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        e.next = null;

        System.out.println("Forward display: ");
        displayforward(a);
        System.out.println("Reverse display");
        displayReverse(e);
    }
}
