package exceptionhandling;

public class Ex8_9 {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw new Exception();
    }
}

/* 다음 상황을 풀이 해보면 main메서드가 method1 메서드를 호출하였고
method1 메서드가 method2 메서드를 호출하였다.
method2에서 예외가 발생하였고 method2에서 예외를 처리하지 않고
method1에 예외를 선언하고 사라졌다.
마찮가지로 method1 또한 받은 예외를 처리하지 않고 main 메소드에
선언하고 사라졌다.
main 메소드 또한 이 예외를 처리하지 못해 JVM의 기본 예외처리기가 출력한다.
출력한 결과엔 예외가 발생한 당시에 정보가 담겨져 있다.
try catch문이 없으므로 예외가 처리가 된것은 아니다.!
 */