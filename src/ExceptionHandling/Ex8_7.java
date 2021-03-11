package ExceptionHandling;

public class Ex8_7 {
    public static void main(String[] args) {
        throw new Exception();
    }
}
//체크드예외
//java: unreported exception java.lang.Exception; must be caught or declared to be thrown

/*컴파일러가 예외처리 여부를 체크한다. (예외처리 필수)
해당 예제는 try catch문으로 예외를 처리해주지 않아 컴파일 조차 되지 않는
상태 이다.
 */