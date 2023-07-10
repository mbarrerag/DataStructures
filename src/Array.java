import java.util.ArrayList;

public class Array {
    //El array no sabe cuántas posiciones están ocupadas (solo tamaño total)
    int[] miArray = new int[10];

    /**
     * Checks if the array is full (all elements are zero).
     *
     * @return true if the array is full, false otherwise
     */
    public boolean fullArray() {
        //Lenght is the number of elements in the array
        //El array no sabe cuántas posiciones están ocupadas (solo tamaño total)
        for (int i = 0 ; i < miArray.length; i++) {

            /**
             * Deleted the next line ReSase the array
             */

            if (miArray[i] == 9) miArray[9] = 0;

            if (miArray[i] == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Resizes the given array if it is full.
     *
     * @param array the original array to resize
     * @return the resized array if it is full, the original array otherwise
     */
    public int[] reSizeArray(int[] array) {
        Array miNewArray = new Array();
        miNewArray.miArray = array;
        if (miNewArray.fullArray()) {
            int[] newArray = new int[miArray.length * 2];
            for (int i = 0; i < miArray.length; i++) {
                newArray[i] = miArray[i];
            }
            System.out.println("**Resizing array");
            return newArray;
        } else {
            System.out.println("**The array is not full");
            return array;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nArray\n");

        System.out.println("Using Array needs two methods to resize the array");
        Array array = new Array();
           // Initialize the array elements with consecutive numbers
        for (int i = 0; i < array.miArray.length; i++) {
            array.miArray[i] = i+1;
        }
        // Resize the array and print the elements
        int[] newArray = array.reSizeArray(array.miArray);
        System.out.println("Printing the elements of the new array");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        //Using ArrayList
        //El límite es la memoria de la JVM
        ArrayList<String> miArrayList = new ArrayList<String>();
        miArrayList.add("\nArrayList\n");
        miArrayList.add("\n-HI\n");
        miArrayList.add("WHAT TIME IS THERE?, I'm A ArrayList and acept any type of data");
        miArrayList.add("Just like a list, but with more functions and with a dynamic size, :)");
        for (String index : miArrayList) {
            System.out.println(index);
        }

        boolean contain = miArrayList.contains("WHAT TIME IS THERE?, I'm A ArrayList and acept any type of data");
        if (contain) System.out.println("The ArrayList contain");

    }


    /**
     ** Using java.util.ArrayList
     */

}


