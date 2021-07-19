 public class OneToN {
    public static void main(String[] args) {
        int N = 10;
        check3(N);
        check2(N);
        check1(N);
    }

     private static void check3(int N) {
         int sum = 0;
         sum = N * ( N + 1 )/2;
         System.out.println(sum);
     }

     private static void check2(int N) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    private static void check1(int N) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == j) {
                    sum += j;
                }
            }
        }
        System.out.println(sum);
    }

}
