package Object;

public class Card {

    String shape = "Spade"; // 카드 모양
    int num = 1; // 카드 번호

    Card() {
        System.out.println(shape + " " + num + " 카드를 생성하였습니다.");
    }

    Card(int num) {
        this("Heart", num);
    }

    Card(String shape, int num) {
        System.out.println(shape + " " + num + " 카드를 생성하였습니다.");
    }


    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card(7);
    }
}

/*
위의 코드를 보면 첫번째 card1을 생성하면
기본 생성자를 호출하여 초기에 설정된 값인 Spade 1 카드를 만들었지만, card2를 생성할 때 7 을 인자로 넘기면,
매개변수를 숫자로 받는 생성자가 호출되어 this() 메서드를 이용하여 매개변수가 2개인 생성자를 호출하여 Heart 7 을 생성하였습니다.
 */


