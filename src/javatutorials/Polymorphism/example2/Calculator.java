package javatutorials.Polymorphism.example2;

public abstract class Calculator {
    int left, right;

    public void serOperands(int left, int right){
        this.left = left;
        this.right = right;
    }

    int _sum(){
        return this.left + right;
    }

    public abstract void sum();
    public abstract void avg();

    public void run(){
        sum();
        avg();
    }
}
