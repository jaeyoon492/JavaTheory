package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberGame extends Practice_Challengs {
    Scanner scanner = new Scanner(System.in); //기본기능이라 파악하기 쉬움
    JyArray jyArray = new JyArray();         //혼자 아는 단어라 알기쉽게 풀네임으로 하기
    JyList jyList = new JyList();
    List<Integer> answer = jyList.ranNumMaker();

     public void play(){
         System.out.println(answer);
       do {
           System.out.print("세자리 숫자를 입력하세요.");
           howMany++;
           input = jyArray.insertArraySplit();
           for (int i = 0; i < input.length; i++) {
               guess[i] = Integer.parseInt(input[i]);
           }
           System.out.println(Arrays.toString(guess));

           for (int i = 0; i < answer.size(); i++) {
               if (answer.get(i) == guess[i]) {
                   count++;
               } else if (answer.get(i) != guess[i]) {
                   failcount++;
               }
           }

           if (answer.get(0) == guess[0] && answer.get(1) == guess[1] && answer.get(2) == guess[2]) {
               System.out.println("정답!");
               System.out.println("시도하신 횟수는" + howMany + "입니다.");
               howMany = 0;
               System.out.println();
               System.out.println("게임을 계속 하시겠습니까? y/n");
               yn = scanner.nextLine();

               if (yn.equals("y")) {
                   retry = true;
                   System.out.println("게임을 다시 시작합니다.");
                   answer = jyList.ranNumMaker();
                   count = 0;
                   failcount = 0;
                   System.out.println(answer);
               } else if (yn.equals("n")) {
                   retry = false;
                   System.out.println("게임을 종료합니다.");
               }

           } else if (answer.get(0) != guess[0] || answer.get(1) != guess[1] || answer.get(2) != guess[2]) {
               System.out.println("총" + count + "개 맞았고 " + failcount + "개 틀렸습니다.");
               count = 0;
               failcount = 0;
               retry = true;
           }
       } while (retry);
    }
}
