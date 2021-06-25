package stringclass;

public class From1To1000String {
    public static void main(String[] args) {
        String b = "";
        int a = 0;
        for (int i = 1; i <= 1000; i++) {
            b = b + i;
            if (b.contains("8")) {
                a++;
                b = "";
            } else {
                b = "";
            }
        }
        System.out.println("1~1000중에 8이 들어간 숫자는 총 :" + a + "개 입니다.");
    }
}
