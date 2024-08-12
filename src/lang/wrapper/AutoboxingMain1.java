package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive -> wrapper
        //valueOf 메서드 사용(박싱)
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> Primitive
        //intValue() -> 박스에서 값을 꺼낸다 느낌(언박싱)
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
