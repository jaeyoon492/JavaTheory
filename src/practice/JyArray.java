package practice;

import java.util.*;

public class JyArray {
     List<Integer> inputNumberMaker(){ //입력값(문자열)을 잘라서 리스트에 저장하는 메서드
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         List<String> splitList = Arrays.asList(input.split(""));
         List<Integer> inputList = new ArrayList<>();
         for(int i = 0; i < splitList.size(); i++){
             inputList.add(Integer.parseInt(splitList.get(i)));
         }
         return inputList;
    }
}
