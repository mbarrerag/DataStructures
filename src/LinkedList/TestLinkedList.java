package LinkedList;

import java.util.Vector;

public class TestLinkedList {

    public static class Cars {


        private int year;

        public Cars( int year) {

            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static void main(String[] args) {
        //We just specify that the linlked list will receive an object String
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("Numero 10");
        linkedList0.add("Numero 20");
        linkedList0.add("Numero 11");
        linkedList0.add("Numero 13");
        linkedList0.add("Numero 15");      linkedList0.displayElements();
        linkedList0.remove(2); //Remove an element using a index
        linkedList0.removeLast();   //Remove the las element o the linked list (head)
        linkedList0.displayElements(); //Show the element of the linked list
        LinkedList<Cars> linkedList = new LinkedList<Cars>(); //Here we say that the linked list will receive a Car object
        linkedList.add(new Cars(10)); //We jsut instance a object and add to the linked lsit
        linkedList.add(new Cars(11));
        linkedList.add(new Cars(11));
        linkedList.displayElements();

        ///Now we will use java.collecions/java.util
        java.util.LinkedList<String> myList = new java.util.LinkedList<String>();
        myList.add("Hello, im a string ");
        System.out.println(myList.get(0));
        myList.removeFirst();
        //Now we will use another data structure like the vector
        Vector<String> myVector = new Vector<String>();
        myVector.add("101");
        System.out.println(myVector.get(0));
    }



    }

