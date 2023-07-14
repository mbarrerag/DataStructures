package queueandstack;
import node.ListNode;
/**
 * The Queue class represents a basic implementation of a queue data structure.
 *
 * @param <T> the type of elements stored in the queue
 */
public class Queue<T> {

    private ListNode<T> head; // The first element in the queue
    private ListNode<T> tail; // The last element in the queue
    public int length; // The number of elements in the queue

    /**
     * Creates a new instance of the Queue class.
     * Initializes the head and tail to null, indicating an empty queue.
     */
    public Queue() {
        head = null;
        tail = null;
    }

    /**
     * Clears the queue by setting the head and tail to null and length to 0.
     * Prints a message if the queue is already empty.
     */
    public void makeEmpty() {
        if (head != null) {
            head = null;
            tail = null;
            length = 0;
        } else {
            System.out.println("There are no elements in the queue");
        }
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param data the element to be added
     */
    public void enqueue(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        if (head == null) {
            // The queue is empty, so the new element becomes both the head and the tail
            head = newNode;
            tail = newNode;
        } else {
            // Appends the new element to the tail of the queue
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    /**
     * Removes the first element from the queue.
     * Prints a message if the queue is empty.
     */
    public void dequeue() {
        if (head == null) {
            System.out.println("There are no elements in the queue");
        } else {
            // Updates the head to the next element in the queue
            head = head.getNext();
            System.out.println("The element " + head.getData().toString() + " was removed");
        }
        length--;
    }

    /**
     * Displays an overview of the elements in the queue.
     * Prints a message if the queue is empty.
     */
    public void overView() {
        if (head == null && tail == null) {
            System.out.println("The queue is empty");
        } else {
            ListNode<T> pointer = head;
            while (pointer.getNext() != null) {
                System.out.println(pointer.getData().toString());
                pointer = pointer.getNext();
            }
            System.out.println(pointer.getData().toString());
        }
    }
}
