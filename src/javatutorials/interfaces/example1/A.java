package javatutorials.interfaces.example1;

interface I {
    public void z();
}

public class A implements I{
    public void z(){
    }
}
//어떤 클래스가 인터페이스를 사용하려면  해당 인터페이스 안에 있는 메소드의 사용을 강제한다.
// 그렇지 않으면 해당 파일은 컴파일 되지 않는다.
