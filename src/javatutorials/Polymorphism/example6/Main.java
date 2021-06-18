package javatutorials.Polymorphism.example6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("복숭아 1 : 바나나 2 ?");
        int input = scanner.nextInt();
        Fruit fruit;
        if (input == 1){
            fruit = new Peach();
            fruit.show();
        }else {
            fruit = new Banana();
            fruit.show();
        }
    }
}
