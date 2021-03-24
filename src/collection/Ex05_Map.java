package collection;

/*
* Map??
* 사실상 Collection 의 주인공 (웹 한정)
* List , Set의 제네릭스<Value>와는 다르게
* <key , Value>형태
* 웹 한정?? 이 아닐수도 있지만 웹 한정이라고 한 건
* */

import java.util.HashMap;
import java.util.Map;

public class Ex05_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("ID", "javari");
        map.put("PASS" , "1234");

        map.put("INFO" , "HUMAN");
        map.put("AGE" , "27");
        map.put("CITY" , "youngin");
        map.put("MESSAGE" , "HELLO");

        System.out.println(map);
        System.out.println(map.get("ID"));
        System.out.println(map.get("AGE"));


    }
}
