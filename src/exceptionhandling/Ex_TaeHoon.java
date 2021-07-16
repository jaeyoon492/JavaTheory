package exceptionhandling;

import java.util.Scanner;

public class Ex_TaeHoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        String str = sc.nextLine();

        int i;
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("숫자를 넣어야지 문자를 왜 넣냐 0 받아라");
            i = 0;
        }

        System.out.println("입력받은 숫자 : " + i);

//        int i;
//        if (str.matches("^[0-9]+$")){   // 어쨋든 숫자일때 true 라는 조건임
//            i = Integer.parseInt(str);
//        }else{
//            System.out.println("숫자 입력안했으니까 0 드림");
//            i = 0;
//        }
//
//        System.out.println("입력받은 숫자 : " + i);

    }
}
