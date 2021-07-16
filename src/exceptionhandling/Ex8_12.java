package exceptionhandling;

public class Ex8_12 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main()에서 예외가 처리되었습니다.");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1()에서 예외가 처리되었습니다.");
            throw e; //예외를 다시 발생시킴
        }
    }
}