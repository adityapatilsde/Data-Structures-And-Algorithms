package ProblemSolving;

public class MergeTwoLinkedListsExtraSpeaceApproach {
  public static class Node{
      int data;
      Node next;
      Node(int data){
          this.data = data;
      }
  }
  public static Node mergeTwoLinkedLists(Node list1,Node list2){
      Node temp1 = list1;
      Node temp2 = list2;
      Node head = new Node(100);
      Node temp = head;

      while (temp1 != null && temp2 != null){
          if (temp1.data < temp2.data){
              Node a = new Node(temp1.data);
              temp.next = a;
              temp = a;
              temp1 = temp1.next;
          }
          else{
              Node a = new Node(temp2.data);
              temp.next = a;
              temp = a;
              temp2 = temp2.next;
          }
      }
      if (temp1 == null){
          temp.next = temp2;
      }
      else {
          temp.next = temp1;
      }
      return head.next;
  }
  static void display(Node head){
      Node temp = head;
      while (temp != null){
          System.out.print(temp.data+" -> ");
          temp = temp.next;
      }
      System.out.print("NUll");
      System.out.println();
  }
  public static void main(String[] args) {
      Node a = new Node(1);
      Node b = new Node(3);
      Node c = new Node(5);

      a.next = b;
      b.next = c;

      display(a);

      Node d = new Node(2);
      Node e = new Node(4);
      Node f = new Node(6);

      d.next = e;
      e.next = f;

      display(d);

      Node head = mergeTwoLinkedLists(a,d);
      display(head);
  }
}
