import java.util.Arrays;

public class Codetest4 {
    int adjacentElementsProduct(int[] inputArray) {
        int bigNum = 0;
        int[] arr = new int[inputArray.length - 1];
        for (int i = 0; i < inputArray.length - 1; i++) {
            arr[i] = inputArray[i] * inputArray[i + 1];
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                bigNum = arr[i + 1];
            }else{
                bigNum = arr[i];
            }
        }
        System.out.println(bigNum);
        return bigNum;
    }


    public static void main(String[] args) {
        int[] inputArray = new int[]{5, 1, 2, 3, 1, 4};
        Codetest4 codetest4 = new Codetest4();
        codetest4.adjacentElementsProduct(inputArray);
    }
}
