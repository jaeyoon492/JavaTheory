package javabeakjoonquiz;

import java.util.Scanner;

public class Quiz11720 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //숫자의 갯수
        String str = sc.next(); //문자열 입력
        sc.close();
        for (int i = 0; i < n; i++) {
            result = result + str.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
