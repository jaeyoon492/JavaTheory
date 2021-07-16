package exceptionhandling;

public class Ex8_8 {
    public static void main(String[] args) {
        throw new RuntimeException();
    }
}
//언체크드예외

/*Exception in thread "main" java.lang.RuntimeException
at ExceptionHandling.Ex8_8.main(Ex8_8.java:5)*/

/* RuntimeException();은 예외처리가 필수가 아닌 선택이다.
컴파일에서 오류가 나지는 않지만 프로그램이 비정상 종료가 됬다.(런타임에러)
 */