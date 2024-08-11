package lang.wrapper;
//래퍼 클래스
public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value); //숫자를 문자로 변환 (valueOf)
        //return "" + value ; 문자열 + 숫자 -> 문자열
    }
}
