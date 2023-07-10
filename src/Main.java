import java.util.LinkedList;
import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("10");
        System.out.println(myList.get(0));

        Vector<String> myVector = new Vector<String>();
        myVector.add("101");
        System.out.println(myVector.get(0));

    }
}