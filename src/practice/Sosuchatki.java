package practice;

public class Sosuchatki {
   static boolean is_Prime(int Number) {

        // 1 은 소수가 아니다.
        if(Number == 1){
            return false;
        }


        // 2 ~ Number-1 까지 중 나누어 떨어지는 약수가 있는지 판별
        // Number = 2 의 경우는 자연스럽게 for문을 검사하지 않게 됨

        for(int i = 2; i < Number; i++) {

            if(Number % i == 0) return false;

        }

        // 위 두 조건에 걸리지 않으면 소수다.
        return true;
    }

    public static void main(String[] args) {
        is_Prime(4);
    }
}
