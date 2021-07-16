package objectclassssss.progentor;

import java.util.Objects;

public class ToStringgg {
    public static void main(String[] args) {
        System.out.println(new Card() );
        System.out.println(new Card());
        System.out.println(new Card("HEART"));
        System.out.println(new Card().hashCode());
    }
}

class Card{
    String kind;
    int number;

    Card(){
        this("SPADE" , 1);
    }

    Card(String kind){
        this(kind, 2);
    }

    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return number == card.number && Objects.equals(kind, card.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }
}