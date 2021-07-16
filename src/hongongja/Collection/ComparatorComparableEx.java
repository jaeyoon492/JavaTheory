package hongongja.Collection;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorComparableEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);    //String 클래스가 Comparable을 구현하고 있기 떄문에 기준을 적지 않으면 기본정렬이 된다.
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr=" + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {    //Comparator를 구현
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;   //c1 , c2의 위치를 바꿔도 역순으로 정의 가능.
        }
        return -1;
    }
}
