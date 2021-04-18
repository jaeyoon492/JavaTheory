package javabeakjoonquiz;

import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //34 = 3(d) + 4(f) = 7(e)  4 + 7 = 11 7 + 11 = 18 11 + 18 = 29
        int b = 0;
        int g = 0;
        while (a == g) {
            int d = a / 10;
            int f = a % 10;
            int e = d + f;
            g = f + e;
            System.out.println(g);
        }
    }
}
