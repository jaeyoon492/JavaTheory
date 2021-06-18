package javatutorials.interfaces.example3;

interface I3{
    public void x();
}

interface I4 extends I3{
    public void z();
}
public class B implements I4{
    public void x(){
    }
    public void z(){

    }
}

//인터페이스도 상속이 되는데 어떤 클래스가 '자식 '인터페이스를 구현한다면 그 '자식' 인터페이스의 '부모' 인터페이스 또한 구현해야 한다.
