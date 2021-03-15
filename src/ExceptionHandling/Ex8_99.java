package ExceptionHandling;
public class Ex8_99 {

    static void method1() throws Exception {
        try {
            System.out.println("method1()이 호출되었습니다.");
        } catch (Exception e) {
            customException ce = new customException();
            ce.initCause(e);
            throw ce;
        }
    }


/////////////////////////////////////////////////////////////////////////


    static void method() {
        try {
            throw new Exception1();
        } catch (Exception1 e) {
            throw new RuntimeException(new Exception1());
        }
    }

    class Exception1 extends Exception {
        public Exception1() {
            super();
        }
    }
//Exception1은 Exception의 자손이므로 반드시 예외 처리를 해야 하는데,
//이 예외를 RuntimeExceptiom으로 감싸버렸기 때문에 unchecked가 되었다.
}