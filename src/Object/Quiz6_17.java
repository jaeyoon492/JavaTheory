package Object;
import java.util.Arrays;
public class Quiz6_17 {
    static int[] shuffle(int[] original){
        for(int i = 0; i < original.length; i++){
            int n = (int)(Math.random()* original.length)+1;
            int tmp = original[0];
            original[0] = original[n];
            original[n] = tmp;
        }
        return original;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}