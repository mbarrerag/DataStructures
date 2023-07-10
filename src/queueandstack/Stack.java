package queueandstack;

import node.Node;

public class Stack<T> {

    private Node<T> head;
    public int length;

    public Stack() {
        head = null;
    }


    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public void pop() {
        if (head == null) {
            System.out.println("There are no elements in the stack");
        } else {
            head = head.getNext();
        }
        length--;
    }

    public void deploy(){
        if(head == null){
            System.out.println("There are no elements in the stack");
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

