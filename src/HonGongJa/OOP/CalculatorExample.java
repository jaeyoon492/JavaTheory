package HonGongJa.OOP;

import HonGongJa.OOP.Calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator Calculator = new Calculator();
        Calculator.powerOn();

        int result1 = Calculator.plus(5, 6);
        System.out.println("result: " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = Calculator.divide(x, y);
        System.out.println("result2 : " + result2);

        Calculator.powerOff();

        Calculator.execute();

        double result3 = Calculator.areaRectangle(10);

        double result4 = Calculator.areaRectangle(10, 20);
        System.out.println("정사각형의 넓이 = " + result3);
        System.out.println("직사각형의 넓이 = " + result4);
    }
}
