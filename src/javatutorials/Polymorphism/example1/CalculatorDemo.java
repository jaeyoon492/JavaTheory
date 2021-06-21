package javatutorials.Polymorphism.example1;

public class CalculatorDemo {
    public static void main(String[] args) {
       Calculator c1 = new CalculatorDecoPlus();
       c1.serOperands(10,20);
       c1.run();

       Calculator c2 = new CalculatorDecoMinus();
       c2.serOperands(10,20);
       c2.run();
    }
}
