package Practice;

public class Practice_Challengs {
    int failcount = 0;
    int count = 0;
    int howMany = 0;
    int[] guess = new int[3];
    String[] input;
    boolean retry = false;
    String yn;

    public static void main(String[] args) {
        NumberGame g = new NumberGame();
        g.play();
    }
}