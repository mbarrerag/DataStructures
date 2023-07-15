package hashset;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int number;


    public Person(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }
}
