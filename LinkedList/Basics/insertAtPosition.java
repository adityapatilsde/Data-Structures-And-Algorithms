package Basics;

public class insertAtPosition {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlisttt{
        Node head = null;
        Node temp = null;
        void insertAtPos(int data,int pos){
            Node newNode = new Node(data);
            temp = head;
            for (int i = 1; i <= pos - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        void display(){
            temp = head;
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        void insertAtEnd(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
    }
    public static void main(String[] args) {
    linkedlisttt ll = new linkedlisttt();
    ll.insertAtEnd(10);
    ll.insertAtEnd(20);
    ll.insertAtEnd(30);
    ll.insertAtEnd(40);
    ll.display();
    ll.insertAtPos(25,2);
    ll.display();
    ll.insertAtPos(35,4);
    ll.display();
    }
}
