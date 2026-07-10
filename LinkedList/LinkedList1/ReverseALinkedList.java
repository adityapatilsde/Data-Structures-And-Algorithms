package LinkedList.LinkedList1;

import Arrays.practice;

public class ReverseALinkedList {
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void reverseLinkedList(Node head){
        if (head == null) return;
        reverseLinkedList(head.next);
        System.out.print(head.data+" ");
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Orignal Linked List: ");
        display(a);

        System.out.println("Reversed Linked List");
        reverseLinkedList(a);
    }
}
