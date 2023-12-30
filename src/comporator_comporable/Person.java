package comporator_comporable;

import garbagecollector.Man;

import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }

    public static void main(String[] args) {
        Comparator<Person> comparator = new PersonComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet<>(comparator);
        people.add(new Person("Akbar", 34));
        people.add(new Person("Ali", 23));
        people.add(new Person("Samuel", 12));
        people.add(new Person("Maksim", 67));
        people.add(new Person("Maksim", 45));
        people.add(new Person("Maksim", 22));
        System.out.println(Arrays.toString(people.toArray()));
    }
}