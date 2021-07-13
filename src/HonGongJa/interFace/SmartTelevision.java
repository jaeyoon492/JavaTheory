package HonGongJa.interFace;

public class SmartTelevision implements RemoteControl, Seechable{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨은 " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 찾습니다.");
    }
}
