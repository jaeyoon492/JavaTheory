package javatutorials.exception.example5;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("./data.txt");
    }
}
