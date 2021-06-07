package HonGongJa;

public class Car {
    static final String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

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

}
