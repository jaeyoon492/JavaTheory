package collection;

//컬렉션이란?
/*
* 크게 3개로 나워진다.
* List,set,map
* 가장 많이 쓰는것?
* List : ArraysList : 데이터의 중복이 가능함 Ex 1번 인뎃스에 'A' 가 들어가수 있음 -> 데이터 중복 되던 말던 막 넣고 싶다 슈이발
* Map : HashMap: 데이터마다 고유의 키값을 가지고 있음
* Set : HashSet : 중복이 안됌 1번 인덱스에 'A'를 넣었는데 2번 인덱스에 'A' 를 넣으면 그냥 합쳐짐 -> 데이터 중복 ㅈ 같네 합쳐져라 슈이발
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_List01 {
    public static void main(String[] args) {
       // ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
       int ranNum = (int) (Math.random()*10)+1;
        list.add(1);
        list.add(9999);
        list.add(ranNum); //랜덤값 넣기
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.set(4, 10); //애는 밀어넣는게 아니라 대체 시킴 (뺴고 새로 넣는다.)
        list.add(3,4);
        list.remove(2);



        System.out.println("전체 내용 출력 : " + list);
        System.out.println("원하는 인덱스 출력 : " + list.get(4));

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 9999){
                list.remove(i);
            }
        }
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < 11; i++){
            list1.add(i);
        }
        System.out.println(list1);
    }
}
