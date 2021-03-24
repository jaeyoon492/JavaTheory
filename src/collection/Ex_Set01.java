package collection;

//Set??
/*
* 데이터의 중복을 허용하지 않는다.
* 생각보다 많이 안쓴다. 즉 까먹는다.
*  하지만 List와 아주 유사하기 때문에 걱정 ㄴ
* */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex_Set01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();


        set.add(1);
        System.out.println(set);
        set.add(1);
        set.add(2);
        System.out.println(set); //같은값을 넣으면 중복처리된다.

        Set<Integer> set2 = new HashSet<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(list);

        set2.addAll(list); //addALL : 주어진 컬렉션에 저장된 모든 객체를 추가한다.( 즉 중복되면 다 죽음)
        System.out.println(set2);
    }
}
