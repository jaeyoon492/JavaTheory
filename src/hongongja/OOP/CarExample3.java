package hongongja.OOP;

public class CarExample3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.ketTurnOn();
        myCar.run2();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");
    }
}
