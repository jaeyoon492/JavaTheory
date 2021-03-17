package Lang.util;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2의 값이 같습니다.");
        else
            System.out.println("v1과 v2의 값이 다릅니다.");
    }
}
class Value {
    int Value;

    Value(int Value){
        this.Value = Value;
    }
}
