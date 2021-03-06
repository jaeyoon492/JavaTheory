package Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Practice_SiyeongChallengs {
    public static void main(String[] args) {
        int[] answer = {(int)(Math.random()*9)+1, (int)(Math.random()*9), (int)(Math.random()*9)};

        String number = new String();
        int[] num;
        int failcount = 0;
        int count = 0;
        int input = 0;

        System.out.println(Arrays.toString(answer));
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("세자리의 숫자를 입력하세요");
            number = sc.nextLine();
            for (int i = 0; i < number.length(); i++){
                num = number
            }



            if(num[0] == answer[0]) {
                count++;
            }else if (num[0] != answer[0]) {
                failcount++;
            }

            if(num[1] == answer[1]) {
                count++;
            }else if (num[1] != answer[1]) {
                failcount++;
            }

            if(num[2] == answer[2]) {
                count++;
            }else if (num[2] != answer[2]) {
                failcount++;
            }

            System.out.println("총" + count + "개 맞췄고" + failcount + "개 틀렸습니다.");

        }while(true);



    }


}