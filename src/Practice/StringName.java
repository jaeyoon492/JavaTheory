package Practice;

import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String[] str = getStrings();
        PlusGosu(str);
    }

    private static void PlusGosu(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + "고수");
        }
    }

    private static String[] getStrings() {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split(",");
        return str;
    }
}
