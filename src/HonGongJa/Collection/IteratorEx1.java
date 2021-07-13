package HonGongJa.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");

        Iterator it = set.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
//        for (int i = 0; i < list.size(); i++) {
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }
    }
}
