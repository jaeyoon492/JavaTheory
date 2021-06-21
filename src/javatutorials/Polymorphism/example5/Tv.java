package javatutorials.Polymorphism.example5;

import javatutorials.interfaces.example2.Calculatable;
import sun.rmi.transport.tcp.TCPChannel;

public class Tv {
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class CaptionTv extends Tv{
    String text;
    void caption(){}
}

class Main{
    Tv tv = new CaptionTv();

}