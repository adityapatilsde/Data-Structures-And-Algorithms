package ProblemSolving;

public class ReverseAlinKedList {
    static public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static public Node reverse(Node head){
     Node prev = null;
     Node curr = head;

     while (curr != null){
         Node next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
     }
     return prev;
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
   public static void main(String[] args) {
       Node a = new Node(10);
       Node b = new Node(20);
       Node c = new Node(30);
       Node d = new Node(40);

       a.next = b;
       b.next = c;
       c.next = d;

       display(a);
       Node head = reverse(a);
       display(head);
   }
}
