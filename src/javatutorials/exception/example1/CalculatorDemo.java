package javatutorials.exception.example1;

class Calculator{
    int left, right;

    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void divide(){
        try {
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
        } catch (Exception e){
            System.out.println("오류가 발생했습니다 : " + e.getMessage());
        }
    }
}


public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperands(10,0);
        calculator.divide();

        Calculator calculator1 = new Calculator();
        calculator1.setOperands(10,5);
        calculator1.divide();
    }
}
