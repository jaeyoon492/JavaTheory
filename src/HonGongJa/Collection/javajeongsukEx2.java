package HonGongJa.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class javajeongsukEx2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student1("이자바", 2,1,70,90,70));
        list.add(new Student1("안자바",2,2,60,100,80));
        list.add(new Student1("홍길동",1,3,10,100,100));
        list.add(new Student1("남궁성",1,1,90,70,80));
        list.add(new Student1("김자바",1,2,80,80,90));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
