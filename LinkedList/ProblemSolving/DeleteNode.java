package ProblemSolving;


public class DeleteNode {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNode list = new DeleteNode();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Original List: ");
        list.display();

        list.delete(30);

        System.out.print("After Deletion: ");
        list.display();
    }
}


