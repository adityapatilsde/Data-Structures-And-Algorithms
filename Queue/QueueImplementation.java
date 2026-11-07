package Queue;

import java.util.Queue;

public class QueueImplementation {
    int queue[];
    int front;
    int rear;
    int capacity;

    QueueImplementation(int size){
        queue = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    boolean isEmpty(){
        return front == -1;
    }
    boolean isFull(){
        return rear == capacity - 1;
    }

    void enqueue(int value){
        if (isFull()){
            System.out.println("Queue overflow");
        }
        else{
            if (front == -1){
                front = 0;
            }
            rear++;
            queue[rear] = value;
        }
    }
    int dequeue(){
        if (isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        int value = queue[front];

        if (front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        return value;
    }

    int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Front element: "+q.peek());
        System.out.println("Removed: "+q.dequeue());
        q.display();
        System.out.println("Is empty: "+q.isEmpty());
        System.out.println("Is full: "+q.isFull());
    }
}
