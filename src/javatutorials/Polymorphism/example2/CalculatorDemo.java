package javatutorials.Polymorphism.example2;

public class CalculatorDemo {
    public static void excute(Calculator cal){
        System.out.println("실행결과");
        cal.run();
    }
    public static void main(String[] args) {
       Calculator c1 = new CalculatorDecoPlus();
       c1.serOperands(10,20);
       c1.run();

       Calculator c2 = new CalculatorDecoMinus();
       c2.serOperands(10,20);
       c2.run();

       excute(c1);
       excute(c2);

    }
}
