package collection;

/*
*   List, Set, Map
*   Map도 Colletion 이라고 하지만 사실 아님 그래도 껴주긴 함
*   Colletion 인터페이스?? 클래스?? 하위에 List ,Set 인터페이스가 존재
*   Map은 Colletion을 상속받거나 구현한 객체가 아님
*
*   Collection 메소드??? 라고 해야하나 공통되는 메소드가 있음 근데 Map은 사생아라 안껴줌(왕따쉑)
*   대표적으로 뭐가 있는지 봐보자.
* */

import java.util.List;
import java.util.ArrayList;

public class Ex03_Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size()); //String [] 의 length 와 같은 기능

        //list가 가지고 있으면 Set도 왠만하면 가지도 있다.
        // 다 가지고 있는건 아님, Ex) get();

    }
}
