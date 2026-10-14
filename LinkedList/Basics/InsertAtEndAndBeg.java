package Basics;

public class InsertAtEndAndBeg {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkeList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if (head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        int size(){
            Node temp = head;
            int count = 0;
            while (temp!=null){
               count++;
               temp = temp.next;
            }
            return count;
        }
        void insertAtBeg(int data){
            Node temp = new Node(data);

            if (head == null){
                insertAtEnd(data);
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
    }
   public static void main(String[] args) {
        linkeList ll = new linkeList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.display();
       System.out.println("Size of the linked list: "+ll.size());
       System.out.println();
       ll.insertAtBeg(1);
        ll.display();
       System.out.println("Size of the linked list: "+ll.size());
       System.out.println();
       ll.insertAtBeg(0);
        ll.display();
       System.out.println("Size of the linked list: "+ll.size());
       System.out.println();
    }
}
