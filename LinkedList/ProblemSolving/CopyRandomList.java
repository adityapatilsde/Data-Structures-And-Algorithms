package ProblemSolving;

public class CopyRandomList {
    static class Node{
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data = data;
        }
    }
    static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;

        // Create copy nodes
        while (temp != null) {
            Node newNode = new Node(temp.data);

            newNode.next = temp.next;
            temp.next = newNode;

            temp = newNode.next;
        }
        temp = head;

        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node copy = head.next;
        Node newhead = copy;

        while (temp != null) {
            temp.next = copy.next;
            temp = temp.next;
            if (temp != null) {
                copy.next = temp.next;
                copy = copy.next;
            }
        }
        return newhead;
    }
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        Node ans = copyRandomList(a);

        System.out.println("Copied List: ");
        display(ans);
    }
}
