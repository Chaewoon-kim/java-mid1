package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue){
        value += addValue;
        return this; //자기 자신 호출
    }

    public int getValue() {
        return value;
    }
}
