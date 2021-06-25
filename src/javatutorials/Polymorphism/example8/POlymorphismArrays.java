package javatutorials.Polymorphism.example8;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {
    }
}

class Tv1 extends Product2 {
    Tv1() {
        super(100);
    }//Product2(int price) 생성자 호출

    public String toString() {
        return "TV";
    }
}

class Computer1 extends Product2 {
    Computer1() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio1 extends Product2 {
    Audio1() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer1 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i = 0;

     void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("금액이 부족하여 물건을 구매할수 없습니다,");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

     void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
         System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
         System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class POlymorphismArrays {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();
        b.buy(new Tv1());
        b.buy(new Computer1());
        b.buy(new Audio1());
        b.summary();
    }
}
