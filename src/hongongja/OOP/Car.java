package hongongja.OOP;

public class Car {
    static final String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    int gas;
    int speed;

    Car(){} //기본생성자

    Car(String model){
        this(model,"은색",250);
    }

    Car(String model, String color){
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void SetGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas == 0){
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run(){
        for (int i = 0; i < gas;) {
            if (gas > 0){
                System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas--;
            }else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;
            }
        }
    }

    int getSpeed(){
        return speed;
    }

    void ketTurnOn(){
        System.out.println("키를 돌립니다.");
    }

    void run2(){
        for (int i = 10; i <= 50; i += 10) {
            speed = i;
            System.out.println("달립니다. (시속: " + speed + "km/h)");
        }
    }

}
