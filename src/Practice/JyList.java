package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JyList {
     List<Integer> ranNumMaker(){
        int ranNum1 = (int)(Math.random()*9)+ 1;
        int ranNum2 = (int)(Math.random()*9);
        int ranNum3 = (int)(Math.random()*9);
        List<Integer> answer = new ArrayList<>(Arrays.asList(ranNum1, ranNum2, ranNum3));//3자리 난수를 받는다.
        return answer;
    }
}
