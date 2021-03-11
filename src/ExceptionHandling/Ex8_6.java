package ExceptionHandling;

public class Ex8_6 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생 시켰음");
            throw e;
            //throw new Exception("고의로 발생 시켰음"); 으로 한줄로 작성 가능
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음");
    }
}
/* 예외객체를 만들고(Exception e = new Exception("고의로 발생 시켰음");) 생성자에 들어가는게 Message
throw를 통해 예외를 발생시킨다. 던진다 라고 봐도 무방
catch블럭이 해당 예외를 처리할수 있는지 확인한다 참조타입이 같으면 해당 catch블럭이 처리.
getMessage()로 얻을수 있는게 예외객체의 메세지("고의로 발생 시켰음")

printStackTrace()에 의해서 출력된 것이( java.lang.Exception: 고의로 발생 시켰음
	at ExceptionHandling.Ex8_6.main(Ex8_6.java:6) )

 */