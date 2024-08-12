package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //Primitive -> wrapper

        int value = 7;
        Integer boxedValue = value; //autoboxing , valueOf() 생략

        //Wrapper -> Primitive

        int unboxedValue = boxedValue; //autounboxing ,intValue() 생략 , 컴파일러가 개발자 대신 코드 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
