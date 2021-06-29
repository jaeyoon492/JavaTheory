package objectclassssss.progentor;

import java.util.Objects;

class Student{
    String name;
    Student (String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.name == s.name;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("javari");
        Student s2 = new Student("javari");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


    }
}