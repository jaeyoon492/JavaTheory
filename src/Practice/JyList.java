package Practice;

import java.util.*;

public class JyList {
     List<Integer> randomNumberMaker(){
        int ranNum = (int)(Math.random()*9);

        Set<Integer> randomNumber = new HashSet<>(Arrays.asList());//3자리 난수를 받는다.
         while (randomNumber.size() < 3){
             randomNumber.add(ranNum);
         }
         List<Integer> randomNumberList = new ArrayList<>(randomNumber);
        return randomNumberList;
    }
}
