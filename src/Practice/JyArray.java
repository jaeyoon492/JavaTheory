package Practice;

import java.util.*;

public class JyArray {
     List<Integer> insertListSplit(){ //입력값(문자열)을 잘라서 리스트에 저장하는 메서드
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         List<String> inputList = new ArrayList<>(Arrays.asList(input.split("")));
         List<Integer> parseIntList = null;
         for (int i = 0; i < inputList.size(); i++){
             parseIntList.get(i) = Integer.parseInt(inputList.get(i)); // 이게 아닌가?
         }
         return parseIntList;
    }
}
