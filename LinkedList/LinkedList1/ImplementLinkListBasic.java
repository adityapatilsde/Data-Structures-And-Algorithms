package LinkedList.LinkedList1;

public class ImplementLinkListBasic {
        public  static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
        }
        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(3);
            Node c = new Node(9);
            Node d = new Node(8);
            Node e = new Node(16);

            //now we have created nodes but still not connected them
            // 5 , 3 , 9 , 8 , 16
            a.next = b;  // 5 ->  3 , 9 , 8 , 16
            b.next = c; // 5 ->  3 -> 9 , 8 , 16
            c.next = d; // 5 ->  3 -> 9 -> 8 , 16
            d.next = e; // 5 ->  3 -> 9 -> 8 -> 16


            //link list connected completely

            //now using head of the link list we can access all nodes data
            System.out.println(a.data);
            System.out.println(a.next.data);
            System.out.println(a.next.next.data);
            System.out.println(a.next.next.next.data);
            System.out.println(a.next.next.next.next.data);
        }
    }


