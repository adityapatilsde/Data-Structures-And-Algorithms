package ProblemSolving;


public class NthNodeFromLastSingleTraversal {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node nthNode2(Node head,int pos){
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= pos; i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node q = nthNode2(a,1);
        System.out.println(q.data);
    }
}
