package hongongja.Collection;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        //List는 객체 배열이라 객체만 저장 가능 그래서 래퍼클래스로 감싸서 저장해준 이유다.
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        for (int i = list2.size() - 1; i > -0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
