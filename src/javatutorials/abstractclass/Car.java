package javatutorials.abstractclass;

public abstract class  Car {
    public abstract void stop();
    public abstract void drive();
    public abstract void turnOn();
    public abstract void turnOff();

    public void run(){
        turnOn();
        drive();
        stop();
        turnOff();
    }
}

class Kia extends Car{
    public void stop(){
        System.out.println("기아자동차를 정지합니다.");
    }
    public void drive(){
        System.out.println("기아자동차가 출발합니다.");
    }
    public void turnOn(){
        System.out.println("기아자동차 시동을 켭니다");
    }
    public void turnOff(){
        System.out.println("기아자동차 시동을 끕니다.");
    }

}

class Tesla extends Car{
    public void stop(){
        System.out.println("테슬라자동차를 정지합니다.");
    }
    public void drive(){
        System.out.println("테슬라자동차가 출발합니다.");
    }
    public void turnOn(){
        System.out.println("테슬라자동차 시동을 켭니다");
    }
    public void turnOff(){
        System.out.println("테슬라자동차 시동을 끕니다.");
    }

}

class Main{
    public static void main(String[] args) {
        Kia kia = new Kia();
        kia.run();
        Tesla tesla = new Tesla();
        tesla.run();
    }
}
