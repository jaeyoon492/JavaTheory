import java.util.Objects;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
    }
}

class Value{
    int value;

    Value(int value) {
        this.value = value;
    }

    public boolean equals(Object o){

        Value value1 = (Value)o;
        return this.value == value1.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}