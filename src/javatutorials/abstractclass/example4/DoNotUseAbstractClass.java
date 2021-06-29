package javatutorials.abstractclass.example4;

public class DoNotUseAbstractClass {
}

class Marine {
    int x, y;
    void move(int x, int y){/* 지정한 위치로 이동 */}
    void stop(){/* 현재 위치에 정지 */}
    void stimPack(){/* 스팀팩을 사용 */}
}

 class Tank{
     int x, y;
     void move(int x, int y){/* 지정한 위치로 이동 */}
     void stop(){/* 현재 위치에 정지 */}
     void changeMode(){/* 시즈모드 */}
 }

 class Dropship{
     int x, y;
     void move(int x, int y){/* 지정한 위치로 이동 */}
     void stop(){/* 현재 위치에 정지 */}
     void load(){/* 선택된 대상을 태운다. */}
     void unload(){/* 선택된 대사을 내린다. */}
 }

