package exceptionhandling;
import java.io.*;
import java.util.Scanner;
public class Ex8_10 {
    public static void main(String[] args) {
        System.out.println("파일의 이름을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            File f = createFile(str);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        }
    }
    static  File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일 이름이 유효하지 않습니다.");
        File f = new File(fileName);

        f.createNewFile();
        return f;
    }
}
