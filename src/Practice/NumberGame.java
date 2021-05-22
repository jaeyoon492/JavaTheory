package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//상속의 사용이 어색하다. 상속은 주로 같은 각 클래스당 같은 역할을 부여해야 할때 주로 사용하는데 이 경우엔 단지 변수를 옮기기 위해 사용했기 때문
//상속을 사용하기 싫은데 파라매터 사용법을 잘 모르겠다.
public class NumberGame {
    int howMany;
    int count;
    int failCount;
    boolean retry;
    String yn;
    Scanner scanner = new Scanner(System.in); //기본기능이라 파악하기 쉬움
    JyArray jyArray = new JyArray();          //혼자 아는 단어라 알기쉽게 풀네임으로 하기
    JyList jyList = new JyList();
    List<Integer> answer = new ArrayList<>(jyList.randomNumberMaker());


     public void play(){
         System.out.println(answer.toString());
       do {
           System.out.print("세자리 숫자를 입력하세요.");
           howMany++;
           List<Integer> inputNumber = jyArray.inputNumberMaker();
           System.out.println(inputNumber.toString());

           for (int i = 0; i < answer.size(); i++) {
               if (answer.get(i) == inputNumber.get(i)) {
                   count++;
               } else if (answer.get(i) != inputNumber.get(i)) {
                   failCount++;
               }
           }

           if (answer.get(0) == inputNumber.get(0) && answer.get(1) == inputNumber.get(1) && answer.get(2) == inputNumber.get(2)) {
               System.out.println("정답!");
               System.out.println("시도하신 횟수는" + howMany + "입니다.");
               howMany = 0;
               System.out.println();
               System.out.println("게임을 계속 하시겠습니까? y/n");
               yn = scanner.nextLine();

               if (yn.equals("y")) {
                   retry = true;
                   System.out.println("게임을 다시 시작합니다.");
                   answer = jyList.randomNumberMaker();
                   count = 0;
                   failCount = 0;
                   System.out.println(answer);
               } else if (yn.equals("n")) {
                   retry = false;
                   System.out.println("게임을 종료합니다.");
               }

           } else if (answer.get(0) != inputNumber.get(0) || answer.get(1) != inputNumber.get(1) || answer.get(2) != inputNumber.get(2)) {
               System.out.println("총" + count + "개 맞았고 " + failCount + "개 틀렸습니다.");
               count = 0;
               failCount = 0;
               retry = true;
           }
       } while (retry);
    }
}
