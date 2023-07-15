package hashset;
import node.TreeNode;

import java.util.*;

public class HashSet<P> {

    private static int counter = 1;
    public static void main(String[] args) {
        // Create a new LinkedHashSet that don't allow duplicates and is ordered by insertion
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("John", 20, 1234));
        linkedHashSet.add(new Person("Carlos", 22, 1234));
        linkedHashSet.add(new Person("Pedro", 21, 1234));
        Iterator<Person> iterator = linkedHashSet.iterator();

        System.out.println("\nLinkedHashSet\n");
        while (iterator.hasNext() != false) {

            Person person = iterator.next();
            String name = person.getName();
            int age = person.getAge();
            int id = person.getNumber();

            System.out.println("-Persona " + counter);
            System.out.println("Nombre: " + name);
            System.out.println("Edad: " + age);
            System.out.println("ID: " + id + "\n");
            counter++;
       }
        counter = 1;
        //Creat

        Set<Person> treeSet = new TreeSet<Person>();
        treeSet.add(new Person("John", 20, 1234));
        treeSet.add(new Person("Carlos", 22, 1234));
        treeSet.add(new Person("Pedro", 21, 1234));
        treeSet.add(new Person("Juan", 21, 1234));

            System.out.println("\nTreeSet\n");
        for (Person person : treeSet) {

            System.out.println("-Persona " + counter);
            System.out.println("Nombre: " + person.getName());
            System.out.println("Edad: " + person.getAge());
            System.out.println("Número: " + person.getNumber());
            System.out.println();
            counter++;
        }

    }


}
