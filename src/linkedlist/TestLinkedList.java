package linkedlist;

import java.util.Vector;

/**
 * The TestLinkedList class demonstrates the usage of LinkedList, java.util.LinkedList,
 * and Vector data structures in Java.
 */
public class TestLinkedList {

    /**
     * The Cars class represents a car object with a year value.
     */
    public static class Cars {

        private int year;

        /**
         * Constructs a Cars object with the specified year.
         *
         * @param year the year of the car
         */
        public Cars(int year) {
            this.year = year;
        }

        /**
         * Retrieves the year of the car.
         *
         * @return the year of the car
         */
        public int getYear() {
            return year;
        }

        /**
         * Sets the year of the car.
         *
         * @param year the year of the car
         */
        public void setYear(int year) {
            this.year = year;
        }
    }

    /**
     * The main method demonstrates the usage of LinkedList, java.util.LinkedList, and Vector.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating and using a LinkedList with String elements
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("Numero 10");
        linkedList0.add("Numero 20");
        linkedList0.add("Numero 11");
        linkedList0.add("Numero 13");
        linkedList0.add("Numero 15");
        linkedList0.displayElements(); // Displaying the elements of the linked list
        linkedList0.remove(2); // Removing an element using an index
        linkedList0.removeLast(); // Removing the last element of the linked list (head)
        linkedList0.displayElements(); // Displaying the elements of the linked list

        // Creating and using a LinkedList with Cars objects
        LinkedList<Cars> linkedList = new LinkedList<Cars>();
        linkedList.add(new Cars(10)); // Adding a Cars object to the linked list
        linkedList.add(new Cars(11));
        linkedList.add(new Cars(11));
        linkedList.displayElements(); // Displaying the elements of the linked list

        // Using java.util.LinkedList
        java.util.LinkedList<String> myList = new java.util.LinkedList<String>();
        myList.add("Hello, I'm a string");
        System.out.println(myList.get(0)); // Retrieving and printing the first element
        myList.removeFirst(); // Removing the first element
        // Using another data structure like Vector
        Vector<String> myVector = new Vector<String>();
        myVector.add("101");
        System.out.println(myVector.get(0)); // Retrieving and printing the first element
    }

}
