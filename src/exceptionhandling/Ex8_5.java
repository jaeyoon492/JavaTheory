package exceptionhandling;

public class Ex8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae)   {
            ae.printStackTrace();
            System.out.println("예외메시지 : " + ae.getMessage());
        }
        System.out.println(6);
    }
}
/* 1찍고 2 찍고 try블럭에서 3찍고 0/0에서 예외가 발생해서 4는
안 나오고 발생한 해당 예외에 맞는 캐치문에 들어가서

 PrintStackTrace로 예외발생 당시 호출스택에 있었던 메서드의 정보와 예외 메시지를 호출한다.
 (java.lang.ArithmeticException: / by zero
 at ExceptionHandling.Ex8_5.main(Ex8_5.java:10)

	그다음 getMessage메서드로 발생한 예외클래스의 인스턴스에 메시지를 얻는다.(by zero)
 */