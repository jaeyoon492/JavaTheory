package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Practice_SiyeongChallengs {
    /*static int[] ranNumMaker() {
        int[] ranArr = {(int) (Math.random() * 9) + 1, (int) (Math.random() * 9), (int) (Math.random() * 9)};//3자리 난수를 받는 메서드
        return ranArr;
    }*/
    static List<Integer> answer(){
        int ranNum1 = (int)(Math.random()*9)+ 1;
        int ranNum2 = (int)(Math.random()*9);
        int ranNum3 = (int)(Math.random()*9);
        List<Integer> answer = new ArrayList<>(Arrays.asList(ranNum1, ranNum2, ranNum3));//3자리 난수를 받는다.
        return answer;
    }
    static String[] split(){ //입력값(문자열)을 잘라서 배열에 저장하는 메서드
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        String[] strArr = str.split("");
        return strArr;
    }
    static int zero() { //값이 0이 되는 메서드
        int num = 0;
        return num;
    }

    public static void main(String[] args) {
        List<Integer> answer = answer();/* 3자리 난수를 받는다. */
        System.out.println(answer);
        int failcount = zero(); //실패시 카운트
        int count = zero();     //성공시 카운트
        int howMany = zero();   //시도 횟수 카운트
        int[] guess = new int[3]; //숫자로 변환한 값을 저장하는 배열
        Scanner sc = new Scanner(System.in);
        String[] input;   //input을 배열로 만들고 (x)
        boolean retry = false;
        String yn;         //retry 입력값을 저장할 변수.


        //split을 사용해서 만들어보자. ("")(x)
        do {
            System.out.print("세자리 숫자를 입력하세요.");
            howMany++;
            input = split();
            for (int i = 0; i < input.length; i++) {
                guess[i] = Integer.parseInt(input[i]); //각각을 parseint 하여 숫자배열로 다시초기화.(x)
            }

            //if else 문 for문으로 수정.(x)
            for (int i = 0; i < answer.size(); i++) {
                if (answer.get(i) == guess[i]) {
                    count++;
                } else if (answer.get(i) != guess[i]) {
                    failcount++;
                }
            }

            //retry 추가 수정.(x)
            if (answer.get(0) == guess[0] && answer.get(1) == guess[1] && answer.get(2) == guess[2]) {
                System.out.println("정답!");
                System.out.println("시도하신 횟수는" + howMany + "입니다.");
                howMany = zero();
                System.out.println();
                System.out.println("게임을 계속 하시겠습니까? y/n");
                yn = sc.nextLine();

                if (yn.equals("y")) {
                    retry = true;
                    System.out.println("게임을 다시 시작합니다.");
                    answer = answer();
                    count = zero();
                    failcount = zero();
                    System.out.println(answer);
                } else if (yn.equals("n")) {
                    retry = false;
                    System.out.println("게임을 종료합니다.");
                }


            } else if (answer.get(0) != guess[0] || answer.get(1) != guess[1] || answer.get(2) != guess[2]) {
                System.out.println("총" + count + "개 맞았고" + failcount + "개 틀렸습니다.");
                count = zero();
                failcount = zero();
                retry = true;
            }


        } while (retry);


    }


}