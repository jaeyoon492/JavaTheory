package javatutorials.exception.example5;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("data.txt");
            f.write("hello");
            //close를 하기 전에 예외가 발생할수 있기 때문에 finally로 처리해야 합니다.
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //만약에 f가 null이 아니라면 close를 해라
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
