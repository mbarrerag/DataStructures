package doublelinkedlist;
/**
 * A class to test the functionality of the DoubleLinkedList class.
 */
public class TestDoubleLinkedList {

    public static void main(String[] args) {
        DoubleLinkedList<String> linkedList = new DoubleLinkedList<>();

        // Adding elements to the linked list
        linkedList.add("Hello");
        linkedList.add("How");
        linkedList.add("Are");
        linkedList.add("You");
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Miller");
        linkedList.removeLast();
        // Removing an element at index 1
        linkedList.remove(1);

        // Removing the first element
        linkedList.removeFirst();

        // Displaying the elements in the linked list

        linkedList.displayElements();
        //Get a privious element by the name
        linkedList.getPrevious(2);
    }
}
