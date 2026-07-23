package RandomCodesPracticeFile;


import java.util.Scanner;
public class practice {

    public class InsertAtIndex {
        public static class Node{
            int data;
            LinkedList.LinkedList1.InsertAtIndex.Node next;
            Node(int data){
                this.data = data;
            }
        }
        public static class linkedList{
            LinkedList.LinkedList1.InsertAtIndex.Node head = null;
            LinkedList.LinkedList1.InsertAtIndex.Node tail = null;

            void insertAtHead(int val){
                LinkedList.LinkedList1.InsertAtIndex.Node temp = new LinkedList.LinkedList1.InsertAtIndex.Node(val);
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
                LinkedList.LinkedList1.InsertAtIndex.Node temp = new LinkedList.LinkedList1.InsertAtIndex.Node(val);
                if (head == null){
                    head = temp;
                    tail = temp;
                }
                else {
                    tail.next = temp;
                    tail = temp;
                }
            }
            int size(){
                LinkedList.LinkedList1.InsertAtIndex.Node temp = head;
                int count = 0;
                while (temp != null){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
            void insertAt(int idx, int val){
                LinkedList.LinkedList1.InsertAtIndex.Node t = new LinkedList.LinkedList1.InsertAtIndex.Node(val);
                LinkedList.LinkedList1.InsertAtIndex.Node temp = head;
                if (idx == size()){
                    insertAtTail(val);
                    return;
                }
                for (int i = 1; i <= idx - 1; i++){
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }
            void display(){
                LinkedList.LinkedList1.InsertAtIndex.Node temp = head;
                while (temp != null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            LinkedList.LinkedList1.InsertAtIndex.linkedList ll = new LinkedList.LinkedList1.InsertAtIndex.linkedList();
            ll.insertAtTail(10);
            ll.display();
            ll.insertAtTail(20);
            ll.display();
            ll.insertAtTail(40);
            ll.display();
            ll.insertAtTail(160);
            ll.display();
            ll.insertAt(3,80);
            ll.display();
            ll.insertAtHead(0);
            ll.display();

            System.out.println();
            System.out.println("Head of linked list: "+ll.head.data);
            System.out.println("Tail of linked list: "+ll.tail.data);
        }
    }

}




