package javatutorials.exception.example3;

class Calculator{
    int left, right;

    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void divide() {
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left / this.right);
            System.out.print(" 입니다.");
        } catch (Exception e) {
            System.out.println("\n\ne.getMessage()\n" + e.getMessage());
        }
        System.out.println("Divide End");   //try구문에서 에러가 발생하여 catch 블록의 구문이 실행되고,
    }                                       // 실행이 끝나면 프로그램 종료가 아닌 try/catch 절 바깥에 나머지 로직을 실행한다.
}


public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperands(10,0);
        calculator.divide();
    }
}