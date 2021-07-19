package Generics;

import java.util.ArrayList;

class Tv{
    String name;
    int price;

    Tv(String name,int price){
        this.name = name;
        this.price = price;
    }
    Tv(){}
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Tv> tvList = new ArrayList();
        tvList.add(new Tv("samsung",1000));
        tvList.add(new Tv());


        Tv t = tvList.get(1);
    }
}
