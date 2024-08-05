package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b); //concat(String str) : 특정 문자열을 더한다.
        String result2 = a + b;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
