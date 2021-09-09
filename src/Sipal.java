public class Sipal {
    public static void main(String[] args) {
        int n = 10;

        nextPrime:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++){
                if (i % j == 0) continue nextPrime;
            }
            System.out.println("소수는 " + i);
        }
    }
}
