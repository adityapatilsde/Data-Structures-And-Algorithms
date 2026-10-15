package Basics;
import java.util.Scanner;
public class DeleteAtSpecificIndex {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void deleteATIndex(int index){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (index < 0){
            System.out.println("Invalid index");
            return;
        }
        if (index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index - 1; i++){
            temp = temp.next;
        }
        if (temp.next == null){
            System.out.println("Invalid index");
            return;
        }
        temp.next = temp.next.next;
    }
    void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteAtSpecificIndex dd = new DeleteAtSpecificIndex();

        dd.insertAtEnd(10);
        dd.insertAtEnd(20);
        dd.insertAtEnd(30);
        dd.display();
        dd.deleteATIndex(2);
        dd.display();
    }
}
