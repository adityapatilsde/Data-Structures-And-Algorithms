package ProblemSolving;

public class MergeTwoLinkedListsApproach2 {
    static public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static public Node mergeTwoLists(Node list1,Node list2){
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(4);
        Node t = head;

        while (temp1 != null && temp2 != null){
            if (temp1.data < temp2.data){
                t.next = temp1;
                t = temp1;
                temp1 = temp1.next;
            }
            else{
                t.next = temp2;
                t = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null){
            t.next = temp2;
        }
        if (temp2 == null){
            t.next = temp1;
        }
        return head.next;
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
        Node b = new Node(3);
        Node c = new Node(5);
        Node c1 = new Node(7);
        Node c2 = new Node(9);

        a.next = b;
        b.next = c;
        c.next = c1;
        c1.next = c2;

        display(a);

        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(6);
        Node f1 = new Node(8);
        Node f2 = new Node(10);

        d.next = e;
        e.next = f;
        f.next = f1;
        f1.next = f2;

        display(d);

        Node head = mergeTwoLists(a,d);
        display(head);

    }
}
