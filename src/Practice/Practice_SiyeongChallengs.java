package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_SiyeongChallengs {
    public static void main(String[] args) {
        int[] answer = {(int)(Math.random()*9)+1, (int)(Math.random()*9), (int)(Math.random()*9)}; //3자리 난수를 받는다.

        System.out.println(Arrays.toString(answer));
        int failcount = 0; //실패시 카운트
        int count = 0;     //성공시 카운트
        int howMany = 0;
        String input;      //입력받은 숫자를 저장하기 위한.
        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("세자리 숫자를 입력하세요");
            howMany++;
            input = sc.nextLine();
            Integer.parseInt(input); //저장한 문자를 숫자로 전환.
            int[] guess = {input.charAt(0)-48,input.charAt(1)-48,input.charAt(2)-48}; //3자리수로 받아서 분할후 배열화


            if(answer[0] == guess[0]) {
                count++;
            }else if (answer[0] != guess[0]) {
                failcount++;
            }

            if(answer[1] == guess[1]) {
                count++;
            }else if (answer[1] != guess[1]) {
                failcount++;
            }

            if(answer[2] == guess[2]) {
                count++;
            }else if (answer[2] != guess[2]) {
                failcount++;
            }

            if(answer[0] == guess[0] && answer[1] == guess[1] && answer[2] == guess[2]){
                System.out.println("정답!");
                System.out.println("시도하신 횟수는" + howMany + "입니다.");
                break;
            } else if (answer[0] != guess[0] || answer[1] != guess[1] || answer[2] != guess[2]){
                System.out.println("총" + count + "개 맞았고" + failcount + "개 틀렸습니다.");
                count = 0;
                failcount = 0;
            }
            

        }while(true);



    }


}