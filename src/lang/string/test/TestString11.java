package lang.string.test;

public class TestString11 {
    //Q. reverse() 활용
    public static void main(String[] args) {
        String str = "hello Java";
        String reversed = new StringBuilder(str).reverse().toString(); //가변 -> 불변
        System.out.println(reversed);
    }
}
