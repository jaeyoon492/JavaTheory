package objectclassssss.progentor;

class Student1 implements Cloneable {
    String name;

    Student1(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("javari");
        try {
            Student1 s2 = (Student1) s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
