package javatutorials.exception.example2;

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
            System.out.println("\n\ne.getMessage()\n" + e.getMessage());
            System.out.println("\n\ne.toString()\n" + e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}


public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperands(10,0);
        calculator.divide();
    }
}