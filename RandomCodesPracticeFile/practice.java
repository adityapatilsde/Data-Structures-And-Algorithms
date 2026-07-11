package RandomCodesPracticeFile;

import java.util.Scanner;
public class practice {
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public static class LinkedList{
    Node head = null;
    Node tail = null;

    void insertAtHead(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
    }

    void insertAtTail(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.insertAtTail(10);
    ll.display();
    ll.insertAtTail(20);
    ll.display();
    ll.insertAtTail(30);
    ll.display();
    ll.insertAtHead(0);
    ll.display();
}
}




