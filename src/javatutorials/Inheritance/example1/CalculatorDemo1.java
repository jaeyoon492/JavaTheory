package javatutorials.Inheritance.example1;

class SubtractionableCalculator extends Calculator {
    public void subtract(){
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubtractionableCalculator c1 = new SubtractionableCalculator();
        c1.setOperands(10,20);
        c1.sum();
        c1.avg();
        c1.subtract();
    }
}
