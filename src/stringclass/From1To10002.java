package stringclass;

public class From1To10002 {
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
        System.out.println(a);
    }
}
