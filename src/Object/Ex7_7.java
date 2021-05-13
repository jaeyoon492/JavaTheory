package Object;

public class Ex7_7 {
    public static void main(String[] args) {
        Ex6_12 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        //car.water(); 에러 Car 타입의 참조변수로는 water()를 호출할수 없다.
        fe2 = (FireEngine)car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive~부릉부릉");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Ex6_12 {
    void water() {
        System.out.println("water!!!");
    }
}