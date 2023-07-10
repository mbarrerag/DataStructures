package node;
/**
 * The Node class represents a single node in a linked list.
 *
 * @param <T> the type of data stored in the node
 */
public class Node<T> {

    private T data; // Data stored in the node
    private Node<T> next; // Reference to the next node in the list

    /**
     * Constructor for the Node class.
     *
     * @param data the data to be stored in the node
     */
    public Node(T data) {
        this.data = data;
    }

    /**
     * Retrieves the data stored in the node.
     *
     * @return the data stored in the node
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data stored in the node.
     *
     * @param data the data to be stored in the node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Retrieves the reference to the next node in the list.
     *
     * @return the reference to the next node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the reference to the next node in the list.
     *
     * @param next the reference to the next node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
