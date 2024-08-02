package lang.immutable.change;
//불변 클래스 , 값은 절대 변경되어서는 안됨.
import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    //final이기 때문에 setter()메서드 생성 불가

    public ImmutableObj add(int addValue){
        int result = value + addValue; //final이기 때문에 새로운 변수 생성
        return new ImmutableObj(result); //새로 생성한 객체 반환
    }
}
