package javatutorials.Polymorphism.example8;

public class Car {
    String color;
    int door;

    void drive(){
        System.out.println("drive, brrrrrrrrr~");
    }

    void stop(){
        System.out.println("stoppppppppp");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }
}

class Main {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();
        Car c = (Car) f;
        FireEngine f2 = (FireEngine)c;

        Car c2 = new Car();
//        FireEngine fe = (FireEngine)c2; java.lang.ClassCastException 에러 형변환에러
        f2.water();
        f2.color = "green";
        f2.drive();
        f2.door = 12;
        f2.stop();

        c.color = "red";
        c.door = 12;
        c.drive();
        c.stop();
//        c.water();    Car에 water메소드가 없기때문에 원래 갖고 있던 메소드여도 형변환을 하면 사용할수 없다.
//        형변환을 통해 할수 있는건 멤버의 갯수를 조절할수 있다.

    }
}
