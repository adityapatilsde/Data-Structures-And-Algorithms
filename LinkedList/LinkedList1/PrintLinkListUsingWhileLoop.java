package LinkedList.LinkedList1;

public class PrintLinkListUsingWhileLoop {
  public static class Node{
      int data;
      Node next;
      Node(int data){
          this.data = data;
      }
  }
  public static void main(String[] args) {
      Node a = new Node(5);
      Node b = new Node(15);
      Node c = new Node(25);
      Node d = new Node(35);
      Node e = new Node(45);

      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;

      Node temp = a;
      while (temp != null){ // as tail node always points to null
          System.out.print(temp.data+" ");
          temp = temp.next;
      }
  }
}
