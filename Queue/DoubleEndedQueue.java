package Queue;


import java.util.*;

class DequeImplementation
{
    static int SIZE = 5;
    static int deque[] = new int[SIZE];
    static int front = -1, rear = -1;

    static void insertFront(int data)
    {
        if((front == 0 && rear == SIZE-1) || (front == rear+1))
        {
            System.out.println("Deque Overflow");
        }
        else if(front == -1)
        {
            front = rear = 0;
            deque[front] = data;
        }
        else if(front == 0)
        {
            front = SIZE-1;
            deque[front] = data;
        }
        else
        {
            front--;
            deque[front] = data;
        }
    }

    static void insertRear(int data)
    {
        if((front == 0 && rear == SIZE-1) || (front == rear+1))
        {
            System.out.println("Deque Overflow");
        }
        else if(front == -1)
        {
            front = rear = 0;
            deque[rear] = data;
        }
        else if(rear == SIZE-1)
        {
            rear = 0;
            deque[rear] = data;
        }
        else
        {
            rear++;
            deque[rear] = data;
        }
    }

    static void deleteFront()
    {
        if(front == -1)
        {
            System.out.println("Deque Underflow");
        }
        else if(front == rear)
        {
            System.out.println("Deleted: " + deque[front]);
            front = rear = -1;
        }
        else if(front == SIZE-1)
        {
            System.out.println("Deleted: " + deque[front]);
            front = 0;
        }
        else
        {
            System.out.println("Deleted: " + deque[front]);
            front++;
        }
    }

    static void deleteRear()
    {
        if(front == -1)
        {
            System.out.println("Deque Underflow");
        }
        else if(front == rear)
        {
            System.out.println("Deleted: " + deque[rear]);
            front = rear = -1;
        }
        else if(rear == 0)
        {
            System.out.println("Deleted: " + deque[rear]);
            rear = SIZE-1;
        }
        else
        {
            System.out.println("Deleted: " + deque[rear]);
            rear--;
        }
    }

    static void display()
    {
        if(front == -1)
        {
            System.out.println("Deque is Empty");
        }
        else
        {
            System.out.print("Deque: ");

            int i = front;

            while(true)
            {
                System.out.print(deque[i] + " ");

                if(i == rear)
                    break;

                i = (i+1) % SIZE;
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        insertRear(10);
        insertRear(20);
        insertRear(30);

        insertFront(5);

        display();

        deleteFront();
        deleteRear();

        display();
    }
}

