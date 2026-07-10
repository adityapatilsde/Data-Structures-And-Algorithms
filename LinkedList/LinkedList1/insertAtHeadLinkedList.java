package LinkedList.LinkedList1;

public class insertAtHeadLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkList{
        Node head = null;
        Node tail = null;

        void inserAtHead(int val){
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
        linkList ll = new linkList();
        ll.inserAtHead(10);
        ll.display();
        ll.inserAtHead(20);
        ll.display();
        ll.inserAtHead(30);
        ll.display();
        ll.inserAtHead(40);
        ll.display();
        ll.inserAtHead(50);
        ll.display();
    }

}
