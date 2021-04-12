package javabeakjoonquiz;

import java.util.Scanner;

public class Quadrent {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int x = Scanner.nextInt();
        int y = Scanner.nextInt();

        if(x < 0 && y < 0){
            System.out.println(3);
        }if(x < 0 && y > 0){
            System.out.println(2);
        }if(x > 0 && y > 0){
            System.out.println(1);
        }if(x > 0 && y < 0){
            System.out.println(4);
        }
    }
}
