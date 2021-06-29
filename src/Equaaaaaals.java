public class Equaaaaaals {
    public static void main(String[] args) {
        String str = "echo";
        String str2 = "echo";

        String str3 = new String("echo");
        String str4 = new String("echo");

        str.equals(str2);

        System.out.println(str.equals(str2));
        System.out.println(str3.equals(str4));

    }
}
