package javatutorials.overriding.example1;

class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

class SubtractionableCalculator extends Calculator{
    public void sum(){
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    }

    public void subtract(){
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubtractionableCalculator c1 = new SubtractionableCalculator();
        c1.setOperands(10,20);
        c1.sum();
        c1.avg();
        c1.subtract();
    }
}
