package javatutorials.abstractclass.example4;


abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop(){/* 현재위치에 정지 */}
}

class Marine1 extends Unit {
    void move(int x, int y){
        System.out.println("Marine1[x =" + x + ",y=" + y + "]");
    }
    void stimPack(){/* 스팀팩을 사용 */}

}

class Tank1 extends Unit{

    void move(int x, int y){
        System.out.println("Tank1[x =" + x + ",y=" + y + "]");
    }
    void changeMode(){/* 시즈모드 */}
}

class Dropship1 extends Unit{
    void move(int x, int y){
        System.out.println("Dropship1[x =" + x + ",y=" + y + "]");
    }
    void load(){/* 선택된 대상을 태운다. */}
    void unload(){/* 선택된 대사을 내린다. */}
}

public class UsedAbstractClass {
    public static void main(String[] args) {
        Unit[] group = new Unit[3];
        group[0] = new Marine1();
        group[1] = new Tank1();
        group[2] = new Dropship1();

        for (int i = 0; i < group.length; i++){
            group[i].move(100,200);
        }
    }
}
