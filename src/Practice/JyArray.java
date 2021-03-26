package Practice;

import java.util.Scanner;

public class JyArray {
     String[] InsertArraySplit(){ //입력값(문자열)을 잘라서 배열에 저장하는 메서드
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        String[] strArr = str.split("");
        return strArr;
    }
}
