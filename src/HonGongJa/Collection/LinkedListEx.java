package HonGongJa.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("4"); //3
        list.add("5"); //4
        list.add("6"); //5
        list.add("7"); //6
        System.out.println(list);

        list.remove(3);
        System.out.println("list=" + list.get(3));

        List list1 = new ArrayList();
        list1.add("1"); //0
        list1.add("2"); //1
        list1.add("3"); //2
        list1.add("4"); //3
        list1.add("5"); //4
        list1.add("6"); //5
        list1.add("7"); //6

        System.out.println(list1);
        list1.remove(3);
        System.out.println("list1=" + list1.get(3));
    }
}
