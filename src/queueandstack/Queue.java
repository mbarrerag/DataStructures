package queueandstack;
import node.Node;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    public int length;

    public Queue() {
        head = null;
        tail = null;
    }

    public void makeEmpty() {
        if (head != null) {
            head = null;
            tail = null;
            length = 0;
        } else {
            System.out.println("There are no elements in the queue");
        }
    }


    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;

        }
        length++;
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("There are no elements in the queue");
        } else {
            Node<T> pointer = head;
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            tail = pointer;
            tail.setNext(null);

        }
        length--;
    }

    public void overView(){
        if (head == null && tail == null){
            System.out.println("Is empty the queue");
        } else {
            Node<T> pointer = head;
            while (pointer.getNext() != null){
                System.out.println(pointer.getData().toString());
                pointer = pointer.getNext();
            }
            System.out.println(pointer.getData().toString());
        }

    }
}
