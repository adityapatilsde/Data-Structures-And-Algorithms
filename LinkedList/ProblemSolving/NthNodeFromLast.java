package ProblemSolving;

public class NthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node nthNode(Node head,int indx){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        int m = count - indx + 1;
         temp = head;
        for (int i = 1; i <= m - 1; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node q = nthNode(a,1);
        System.out.println(q.data);
    }
}
