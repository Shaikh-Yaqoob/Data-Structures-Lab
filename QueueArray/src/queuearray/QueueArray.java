package queuearray;

/**
 *
 * @author Atif Malik
 */
public class QueueArray {
 
        int[] queue;
        int front;
        int rear;
        public QueueArray(int size) {
    queue = new int[size];
    front = -1;
    rear = -1;
}

public boolean isFull() {
    return rear == queue.length - 1;
}

public boolean isEmpty() {
    return front == -1 && rear == -1;
}

public void enqueue(int data) {
    if (isFull()) {
        System.out.println("Queue is full, unable to enqueue");
        return;
    }
    if (isEmpty()) {
        front = 0;
    }
    queue[++rear] = data;
}

public int dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty, unable to dequeue");
        return -1;
    }
    int data = queue[front];
    if (front == rear) {
        front = -1;
        rear = -1;
    } else {
        front++;
    }
    return data;
}

public void print() {
    if (isEmpty()) {
        System.out.println("Queue is empty, unable to print");
        return;
    }
    for (int i = front; i <= rear; i++) {
        System.out.print(queue[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    QueueArray q = new QueueArray(5);

    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);

    q.print(); // prints 1 2 3 4

    q.dequeue();
    q.dequeue();

    q.print(); // prints 3 4
}
}

    
    

