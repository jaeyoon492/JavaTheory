package Object;

class Product2{
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product2() {} // 기본 생성자
}

class Tv2 extends Product2 {
    Tv2() { super(100); }

    public String toString() { return "Tv";}
}

class Computer2 extends Product2 {
    Computer2() {super(200);}
    public String toString() {return "Computer";}
}

class Audio2 extends Product2 {
    Audio2() {super(50);}
    public String toString() { return "Audio";}
}

class Buyer2 {
    int money = 1000;   //소유금액
    int bonusPoint = 0; //보유포인트
    Product2[] cart = new Product2[10]; //구입한 제품을 저장할 배열
    int i = 0;  //Product배열에 사용될 카운터

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
        cart[i++] = p;  //해당 제품을 Product[] cart에 저장한다.
        System.out.println(p + "을/를 구입 하셨습니다.");
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        for(int  i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
public class Ex7_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}
