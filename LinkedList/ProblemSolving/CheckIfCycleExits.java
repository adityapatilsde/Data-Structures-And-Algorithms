package ProblemSolving;

public class CheckIfCycleExits {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean cycleexistence(Node head){
        if (head == null){
            return false;
        }
        if (head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null){
            if (slow.next == null){
                return false;
            }
            slow = slow.next;
            if (fast.next == null){
                return false;
            }
            fast = fast.next.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
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
       e.next = b;

        System.out.println("Cycle existence status: "+cycleexistence(a));
    }
}
