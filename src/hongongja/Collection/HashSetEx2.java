package hongongja.Collection;

import java.util.*;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);    //Set은 정렬불가라 Set의 모든 요소를 list에 저장
        Collections.sort(list);     //list를 정렬 Collections.sort(List list);
        System.out.println(list);
    }
}
