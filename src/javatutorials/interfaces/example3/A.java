package javatutorials.interfaces.example3;

interface I1{
    public void x();
}

interface  I2{
    public void z();
}
public class A implements I1, I2{
    public void x(){}
    public void z(){}
}
//하나의 클래스가 여러개의 인터페이스를 구현할수도 있다.
//구현하는 클래스는 해당 모든 인터페이스의 메소드를 전부 구현해야 한다.
