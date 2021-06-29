package objectclassssss.progentor;

class Calculator{
    int left, right;

    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }

    public String toString(){   //Object 클래스의 toStirng()를 오버라이딩
        return super.toString()+", " +  "left: "  + this.left + ", right: " + this.right;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        c2.setOperands(100,200);
        c1.setOperands(10,20);
        System.out.println(c1);
        System.out.println(c2);
    }
}
