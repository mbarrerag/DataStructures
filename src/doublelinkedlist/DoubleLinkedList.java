package doublelinkedlist;
import node.ListNode;
/**
 * Represents a Double Linked List data structure.
 *
 * @param <T> the type of data stored in the list
 */
public class DoubleLinkedList<T> {

    private ListNode<T> head; // Pointer to the first node of the list
    private ListNode<T> tail; // Pointer to the last node of the list
    private int length = 0; // Counter to store the length of the list

    /**
     * Constructor for DoubleLinkedList class.
     * Initializes the head and tail pointers as null and the length as zero.
     */
    public DoubleLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    /**
     * Empties the list by setting the head and tail pointers as null, and the length as zero.
     */
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    /**
     * Adds a new node with the specified data to the end of the list.
     *
     * @param data the data to be added to the list
     */
    public void add(T data) {
        ListNode<T> newNode = new ListNode<T>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    /**
     * Retrieves and prints the previous element to the element at the specified index.
     *
     * @param index the index of the element to find the previous element of
     */
    public void getPrevious(int index) {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            System.out.println("Invalid index");
            return;
        }

        ListNode<T> pointer = head;
        int counter = 0;

        while (counter < index) {
            pointer = pointer.getNext();
            counter++;
        }

        System.out.println("Previous element: " + pointer.getPrevious().getData().toString());
    }

    /**
     * Displays the elements in the list.
     * If the list is empty, it prints a message indicating so.
     */
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("There are no elements in the list");
        } else {
            ListNode<T> pointer = head;
            while (pointer != null) {
                System.out.println(pointer.getData().toString());
                pointer = pointer.getNext();
            }
        }
    }

    /**
     * Retrieves and prints the first element of the list.
     * If the list is empty, it prints a message indicating so.
     */
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("There are no elements in the list");
        } else {
            System.out.println("First element: " + head.getData().toString());
        }
    }

    /**
     * Removes the first node from the list.
     * If the list is empty, it prints a message indicating so.
     */
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("The list is empty");
        } else {
            if (length == 1) {
                head = null;
                tail = null;
            } else {
                head = head.getNext();
                head.setPrevious(null);
            }
            length--;
        }
    }

    /**
     * Removes the node at the specified index from the list.
     *
     * @param index the index of the node to be removed
     */
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        if (index < 0 || index >= length) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        ListNode<T> pointer = head;
        int counter = 0;

        while (counter < index) {
            pointer = pointer.getNext();
            counter++;
        }

        if (pointer == tail) {
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            pointer.getPrevious().setNext(pointer.getNext());
            pointer.getNext().setPrevious(pointer.getPrevious());
        }
        length--;
    }

    /**
     * Removes the last node from the list.
     * If the list is empty, no action is performed.
     */
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        length--;
    }
}
