package ProblemSolving;

public class PalindromeCheck {
    static public class Node{
        int data;
        Node next;
        Node(int data){
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
    static boolean palindromecheck(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while (p2 != null){
            if (p1.data != p2.data) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
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
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(5);
        Node d = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        System.out.println("Is palindrome: "+palindromecheck(a));
    }
}
