package javatutorials.Polymorphism.example6;

import java.util.Scanner;

public class InputValue {
    public int setValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("복숭아 1 : 바나나 2 ?");
        int input = scanner.nextInt();
        return input;
    }
}
