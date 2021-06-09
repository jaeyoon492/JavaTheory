package HonGongJa.StaticOop;

public class Calculator {
    static double pi = Math.PI;

    static int plus(int x, int y){
        return x + y;
    }

    static int minus(int x, int y){
        if (x < y){
            return y - x;
        }else {
           return x - y;
        }
    }
}
