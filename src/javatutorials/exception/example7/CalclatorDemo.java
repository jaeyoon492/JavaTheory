package javatutorials.exception.example7;

class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if (right == 0){
            throw new ArithmeticException("두번쨰 인자는 0을 허용하지 않습니다.");
        }
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

public class CalclatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10,0);
        c1.divide();
    }
}
