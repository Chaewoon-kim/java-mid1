package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b); //concat(String str) : 특정 문자열을 더한다.
        String result2 = a + b;
        //참조값끼리 더하는 것은 불가능하지만 워낙 많이 쓰이는 String 클래스는 자바에서 편의상 더할 수 있게 제공.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
