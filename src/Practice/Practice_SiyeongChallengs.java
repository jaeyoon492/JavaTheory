package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_SiyeongChallengs {
    static int[] ranNumMaker() {
        int[] ranArr = {(int) (Math.random() * 9) + 1, (int) (Math.random() * 9), (int) (Math.random() * 9)};//3자리 난수를 받는 메서드
        return ranArr;
    }

    public static void main(String[] args) {
        int[] answer = ranNumMaker();//3자리 난수를 받는다.
        System.out.println(Arrays.toString(answer));
        int failcount = 0; //실패시 카운트
        int count = 0;     //성공시 카운트
        int howMany = 0;   //시도 횟수 카운트
        int guess[] = new int[3]; //숫자로 변환한 값을 저장하는 배열
        Scanner sc = new Scanner(System.in);
        String input[];   //input을 배열로 만들고 (x)
        boolean retry = false;
        String yn;         //retry 입력값을 저장할 변수.


        //split을 사용해서 만들어보자. ("")(x)
        do {
            System.out.print("세자리 숫자를 입력하세요.");
            howMany++;
            String str;
            str = sc.nextLine();
            input = str.split("");
            for (int i = 0; i < input.length; i++) {
                guess[i] = Integer.parseInt(input[i]); //각각을 parseint 하여 숫자배열로 다시초기화.(x)
            }


            //if else 문 for문으로 수정.(x)
            for (int i = 0; i < answer.length; i++) {
                if (answer[i] == guess[i]) {
                    count++;
                } else if (answer[i] != guess[i]) {
                    failcount++;
                }
            }

            //retry 추가 수정.(x)
            if (answer[0] == guess[0] && answer[1] == guess[1] && answer[2] == guess[2]) {
                System.out.println("정답!");
                System.out.println("시도하신 횟수는" + howMany + "입니다.");
                howMany = 0;
                System.out.println();
                System.out.println("게임을 계속 하시겠습니까? y/n");

                yn = sc.nextLine();
                if (yn.equals("y")) {
                    retry = true;
                    System.out.println("게임을 다시 시작합니다.");
                    answer = ranNumMaker();//3자리 난수를 받는다.
                    count = 0;
                    failcount = 0;
                    System.out.println(Arrays.toString(answer));
                } else if (yn.equals("n")) {
                    retry = false;
                    System.out.println("게임을 종료합니다.");
                }


            } else if (answer[0] != guess[0] || answer[1] != guess[1] || answer[2] != guess[2]) {
                System.out.println("총" + count + "개 맞았고" + failcount + "개 틀렸습니다.");
                count = 0;
                failcount = 0;
                retry = true;
            }


        } while (retry);


    }


}