package javatutorials.Polymorphism.example2;

public class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum : " + _sum());
    }

    public void avg(){
        System.out.println("+ avg :" + (this.left + this.right)/2);
    }
}
