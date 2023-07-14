package queueandstack;

import node.ListNode;

/**
 * The Stack class represents a basic implementation of a stack data structure.
 *
 * @param <T> the type of elements stored in the stack
 */
public class Stack<T> {

    private ListNode<T> head; // The top element of the stack
    public int length; // The number of elements in the stack

    /**
     * Creates a new instance of the Stack class.
     * Initializes the head to null, indicating an empty stack.
     */
    public Stack() {
        head = null;
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param data the element to be added
     */
    public void push(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        if (head == null) {
            // The stack is empty, so the new element becomes the head
            head = newNode;
        } else {
            // Sets the next pointer of the new element to the current head,
            // then updates the head to the new element
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    /**
     * Removes the top element from the stack.
     * Prints a message if the stack is empty.
     */
    public void pop() {
        if (head == null) {
            System.out.println("There are no elements in the stack");
        } else {
            // Updates the head to the next element in the stack
            head = head.getNext();
        }
        length--;
    }

    /**
     * Displays the elements in the stack in the order they were added.
     * Prints a message if the stack is empty.
     */
    public void deploy() {
        if (head == null) {
            System.out.println("There are no elements in the stack");
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
