package ProblemSolving;

public class Intersectionof2SinglyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node getIntersectionNode(Node HeadA , Node HeadB){
        Node tempA = HeadA;
        Node tempB = HeadB;
        int lengthA = 0;
        while (tempA != null){
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while (tempB != null){
            lengthB++;
            tempB = tempB.next;
        }
        tempA = HeadA;
        tempB = HeadB;

        if (lengthA > lengthB){
            int steps = lengthA - lengthB;
            for (int i = 1; i <= steps; i++){
                tempA = tempA.next;
            }
        }
        else {
            int steps = lengthB - lengthA;
            for (int i = 1; i <= steps; i++){
                tempB = tempB.next;
            }
        }
        while (tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print(" NULL ");
        System.out.println();
    }
    public static void main(String[] args) {
         Node a = new Node(10);
         Node b = new Node(20);
         Node c = new Node(30);

         Node d = new Node(40);
         Node e = new Node(50);
         Node f = new Node(60);

         Node x = new Node(15);
         Node y = new Node(25);

         // Linked list a
        a.next = b;
        b.next = c;
        c.next = d;

        //Linked list b
        x.next = y;
        y.next = d;

        //Common
        d.next = e;
        e.next = f;

        display(a);
        display(x);

        Node intersection = getIntersectionNode(a,x);
        if (intersection != null){
            System.out.println("Intersection is at: "+intersection.data);
        }
        else {
            System.out.println("No intersection occurs in both lists");
        }
    }
}
