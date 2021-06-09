package HonGongJa.StaticOop;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-123456","홍길동");
        //생성자의 매개값으로 ssn을 받아서 초기값으로 지정해주었습니다.

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        /*
        * p1.nation = "usa";
        * p1.ssn = "123456-654321";
        * 갹체 생성시에 외부 데이터로 초기화해야 한다면 생성자에서 초기값을 지정해야 합니다. 생성자는 final 필드의 최종 초기화를 마쳐야
        * 하는데, 만약 초기화되지 않은 final 필드를 그대로 남겨두면 컴파일 에러가 발생합니다.
        * */
        p1.name = "고길동";
    }
}
