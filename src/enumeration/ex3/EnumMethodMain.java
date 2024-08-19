package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 ENUM 반환 (values())
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        //for 문으로 이름과 순서를 받을 수 있음
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        //String -> ENUM반환 , 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input); //valueOf()사용해 ENUM으로 반환
        System.out.println("gold = " + gold); //toString() 오버라이딩 가능
    }
}
