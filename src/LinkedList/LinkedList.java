package LinkedList;

import java.awt.*;

public class LinkedList<T> {

    private Node<T> head;
    int length = 0;

    public LinkedList() {
        Node<T> head = null;
        int length = 0;
    }

    public void makeEmpaty() {
        head = null;
        length = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(isEmpty()) {
            head = newNode;

        } else {
            Node<T> pointer = head;
            while(pointer.getNext() != null){
                pointer=pointer.getNext();
            }
            pointer.setNext(newNode);
        }
        length++;
    }

    public void displayElements() {

        if (head == null) {
            System.out.println("There is not elements on the list");
         } else {
            Node<T> pointer = head;
            while(pointer.getNext() != null){

                System.out.println(pointer.getData().toString());
                pointer = pointer.getNext();
            }
                System.out.println(pointer.getData().toString());


        }
    }

    public void getFirst(){
        if (head == null) {
            System.out.println("There is not elements on the list");
         } else {
            Node<T> pointer = head;
            System.out.println(pointer.getData().toString());
        }
    }

    public void removeFist(){
        if(head == null){
            System.out.println("The list is empty");
        } else {
            head = head.getNext();
        }
    }

 public void remove(int index) {
     if (head != null) {
         if (index == 1) {
             removeFist();
         }else {
             int counter =0;
             Node <T> pointer = head;
             while((counter < index-1) && (pointer.getNext() != null)){
                 pointer = pointer.getNext();
                 counter++;
             }
              pointer.setNext(pointer.getNext().getNext());
              pointer.getNext().setNext(null);
              length--;
        }
     }
 }

 public void removeLast(){
     if (head != null) {
         Node<T> pointer = head;
         while(pointer.getNext() != null){
             pointer = pointer.getNext();
         }

          pointer.setNext(null);
     }

     }
}

