package linkedlist;
import node.Node;

public class LinkedList<T> {

    private Node<T> head; // Pointer to the first node of the list
    int length = 0; // Counter to store the length of the list

    /**
     * Constructor for LinkedList class.
     * Initializes the head pointer as null and the length as zero.
     */
    public LinkedList() {
        Node<T> head = null;
        int length = 0;
    }

    /**
     * Empties the list by setting the head pointer as null and length as zero.
     */
    public void makeEmpty() {
        head = null;
        length = 0;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Adds a new node with the specified data to the end of the list.
     *
     * @param data the data to be added to the list
     */
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> pointer = head;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(newNode);
        }
        length++;
    }

    /**
     * Displays the elements in the list.
     * If the list is empty, it prints a message indicating so.
     */
    public void displayElements() {
        if (head == null) {
            System.out.println("There are no elements in the list");
        } else {
            Node<T> pointer = head;
            while (pointer.getNext() != null) {
                System.out.println(pointer.getData().toString());
                pointer = pointer.getNext();
            }
            System.out.println(pointer.getData().toString());
        }
    }

    /**
     * Retrieves and prints the first element of the list.
     * If the list is empty, it prints a message indicating so.
     */
    public void getFirst() {
        if (head == null) {
            System.out.println("There are no elements in the list");
        } else {
            Node<T> pointer = head;
            System.out.println(pointer.getData().toString());
        }
    }

    /**
     * Removes the first node from the list.
     * If the list is empty, it prints a message indicating so.
     */
    public void removeFirst() {
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            head = head.getNext();
        }
    }

    /**
     * Removes the node at the specified index from the list.
     *
     * @param index the index of the node to be removed
     */
    public void remove(int index) {
        if (head != null) {
            if (index == 1) {
                removeFirst();
            } else {
                int counter = 0;
                Node<T> pointer = head;
                while ((counter < index - 1) && (pointer.getNext() != null)) {
                    pointer = pointer.getNext();
                    counter++;
                }
                pointer.setNext(pointer.getNext().getNext());
                pointer.getNext().setNext(null);
                length--;
            }
        }
    }

    /**
     * Removes the last node from the list.
     * If the list is empty, no action is performed.
     */
    public void removeLast() {
        if (head != null) {
            Node<T> pointer = head;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
        }
    }
}
