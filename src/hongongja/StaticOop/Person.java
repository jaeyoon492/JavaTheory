package hongongja.StaticOop;

public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name){     //생성자의 매개값으로 ssn을 받아서 초기값으로 지정해주었습니다.
        this.ssn = ssn;
        this.name = name;
    }
}
