package ProblemSolving;

public class SplitLinkedListOddEvenFromat {
    static public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    static public void splitLinkedList(Node list){
        Node temp = list;
        Node even = new Node(0);
        Node t1 = even;
        Node odd = new Node(1);
        Node t2 = odd;

        while (temp != null){
            if (temp.data %2 == 0){
                even.next = temp;
                even = temp;
                temp = temp.next;
            }
            else {
                odd.next = temp;
                odd = temp;
                temp = temp.next;
            }
        }

        even.next = null;
        odd.next = null;

        t1 = t1.next;
        t2 = t2.next;

        System.out.print("Even split: ");
        display(t1);
        System.out.print("Odd split: ");
        display(t2);

    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        splitLinkedList(a);
    }
}
