package Practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class JyList {
     List<Integer> randomNumberMaker(){

        Set<Integer> randomNumberSet = new HashSet<>(Arrays.asList());//3자리 난수를 받는다.

         while (randomNumberSet.size() != 3){
             randomNumberSet.add((int)(Math.random()*9));
         }
         List<Integer> randomNumberList = new ArrayList<>(randomNumberSet);
        return randomNumberList;
    }
}
