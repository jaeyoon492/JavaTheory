package Practice;

import java.util.*;

public class JyList {
     List<Integer> randomNumberMaker(){
        int ranNum = (int)(Math.random()*9);

        Set<Integer> randomNumberSet = new HashSet<>(Arrays.asList());//3자리 난수를 받는다.
         while (randomNumberSet.size() < 3){
             randomNumberSet.add(ranNum);
         }
         List<Integer> randomNumberList = new ArrayList<>(randomNumberSet);
        return randomNumberList;
    }
}
