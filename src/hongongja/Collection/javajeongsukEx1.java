package hongongja.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student1 implements Comparable<Student1> {
    String delimiter = ",";
    String name;
    int ban;
    int no;
    int kor, eng, math;
    int total;
    float average;

    @Override
    public int compareTo(Student1 o) {
        return this.name.compareTo(o.name);
    }

    Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        SetTotal(kor, eng, math);
        SetAverage();
    }

    void SetTotal(int kor, int eng, int math) {
        this.total = kor + eng + math;
    }

    void SetAverage() {
        this.average = (float) ((int) (this.total / 3f) * 10 + 0.5) / 10f;
    }

    @Override
    public String toString() {
        return name + delimiter + ban + delimiter + no + delimiter + kor + delimiter + eng + delimiter + math + delimiter + total + delimiter + average;
    }
}

public class javajeongsukEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student1("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student1("남궁성", 1, 2, 90, 70, 80));
        list.add(new Student1("김자바", 1, 3, 80, 80, 90));
        list.add(new Student1("이자바", 1, 4, 70, 90, 70));
        list.add(new Student1("안자바", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
