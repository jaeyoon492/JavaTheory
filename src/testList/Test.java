package testList;

public class Test {
    public static void main(String[] args) {
        MjList ml = new MjList();
        ml.add(10);
        ml.add(20);
        ml.add(30);
        ml.add(40);
        ml.add(1,21);
        ml.remove(1);
        System.out.println(ml);
    }
}