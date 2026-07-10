package LinkedList.LinkedList1;

public class InsertElementAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
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
        int size(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);

        //now we will do this by our function

        linkedList ll = new linkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.display();
        System.out.println(ll.size());
        ll.insertAtEnd(12);
        ll.display();
        System.out.println(ll.size());
    }
}
