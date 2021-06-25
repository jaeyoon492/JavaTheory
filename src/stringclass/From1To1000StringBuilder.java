package stringclass;

public class From1To1000StringBuilder {
    public static void main(String[] args) {
        String b = "";
        StringBuilder sb = new StringBuilder(b);
        int a = 0;

        for (int i = 1; i <= 1000; i++){
            sb.insert(0, i);
            if (sb.indexOf("8") != -1){
                a++;
                sb.delete(0,1000);
            }
        }
        System.out.println("1~1000중에 8이 들어간 숫자는 총 :" + a + "개 입니다.");
    }
}
