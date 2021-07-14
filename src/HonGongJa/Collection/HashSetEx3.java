package HonGongJa.Collection;

import HonGongJa.StaticOop.Person;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new PersonSet("David", 10));
        set.add(new PersonSet("David", 10));

        System.out.println(set);
    }
}

class PersonSet {
    String name;
    int age;

    PersonSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonSet personSet = (PersonSet) o;
        return age == personSet.age && Objects.equals(name, personSet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}