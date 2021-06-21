package javatutorials.Polymorphism.example3;

interface I {

}

class C implements I{

}

public class PolymorphisDemo2 {
    public static void main(String[] args) {
        I obj = new C();
    }
}

//I인터페이스를 구현하는 C 클래스의 인스턴스를 참조타입 I에 저장할수 있다.
//이것이 가능한 이유는 클래스 C가 인터페이스 I를 구현하고 있기때문이다.