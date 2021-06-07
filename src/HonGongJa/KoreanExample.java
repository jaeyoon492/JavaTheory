package HonGongJa;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("명재윤","000000-0000000");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean();
        k2.name = "박자바";
        k2.ssn = "222222-2222222";
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);

        Korean k3 = new Korean("김자바", "111111-1111111");
        System.out.println("k3.name : " + k3.name);
        System.out.println("k3.ssn : " + k3.ssn);
    }
}
