package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Iterator???
*   난 안씀
*   좀 편하라고 만들었는데
*   불편
*   쓰는 인간들이 있어서 어쩔수 없음
*   본인이 편하다면 써야겠지요
* */
public class Ex04_Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }

}
