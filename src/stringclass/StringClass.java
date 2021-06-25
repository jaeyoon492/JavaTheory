package stringclass;

import java.util.Scanner;

public class StringClass {
    Scanner scanner = new Scanner(System.in);

    String str1 = "abc";     //문자열 리터럴 "abc"의 주소가 str1에 저장됨
    String str2 = "abc";     //문자열 리터럴 "abc"의 주소가 str2 에 저장됨
    String str3 = new String("abc");
    String str4 = new String("abc");

    public StringClass() {
    }

    public void EqualsInstance() {
        System.out.println("객체의 주소값 비교");
        if (str1 == str2) {
            System.out.println("str1과 str2의 주소가 같습니다.");
        } else {
            System.out.println("str1과 str2의 주소가 다릅니다.");
        }

        if (str3 == str4) {
            System.out.println("str3과 str4의 주소가 같습니다.");
        } else {
            System.out.println("str3과 str4의 주소가 다릅니다.");
        }
    }

    public void EqualsString(){
        System.out.println("문자열 내용비교: ");
        if (str1.equals(str2)) {
            System.out.println("str1과 str2의 문자열의 내용이 같습니다.");
        } else {
            System.out.println("str1과 str2의 문자열의 내용이 다릅니다.");
        }

        if (str3.equals(str4)) {
            System.out.println("str3과 str4의 문자열의 내용이 같습니다.");
        } else {
            System.out.println("str3과 str4의 문자열의 내용이 다릅니다.");
        }
    }
}

class Check {
    public static void main(String[] args) {
        StringClass stringClass = new StringClass();

        stringClass.EqualsInstance();
        System.out.println();
        stringClass.EqualsString();
    }
}