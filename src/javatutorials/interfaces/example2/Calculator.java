package javatutorials.interfaces.example2;

public class Calculator implements Calculatable{
    int first, second, third;
    public void setOperands(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int sum(){
        return this.first + this.second + this.third;
    }
    public int avg(){
        return (this.first + this.second + this.third) / 3;
    }
}
