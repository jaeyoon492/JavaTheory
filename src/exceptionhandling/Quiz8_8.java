package exceptionhandling;

public class Quiz8_8 {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println(6);
        } catch (Exception e) {
            System.out.println(7);
        }
    }
    static void method1() throws Exception {
        try {
            method2();
            System.out.println(1);
        } catch (NullPointerException e) {
            System.out.println(2);
            throw e;
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
    static void method2() {
        throw new NullPointerException();
    }
}
// 풀이 : 메인메소드 에서 메소드 1을 호출함 메소드1에서 메소드 2를 호출함 메소드 2에서  NullPointerException발생
//그걸 다시 메소드1으로 가져감 (메소드 2안에서 처리못함 try-catch 없으니까) 메서드1의 try-catch에 NullPointerException을 처리할
//catch문으로 가젹가서 처리함 프린트메서드(2)가 출력됨 그다음 다시 예외를 발생시켜서 메인으로 던짐 그다음 파이널 블록 실행됨 프린트메서드(4) 출력됨
//메인으로 던져진 예외를 catch문 Exception e가 처리함 그래서 프린트메서드(7)이 출력됨 그래서 출력되는 값은 2, 4, 7 이다.
