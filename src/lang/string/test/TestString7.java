package lang.string.test;

public class TestString7 {
    //Q. 공백제거 : trim();
    public static void main(String[] args) {
        String original = "         Hello Java        ";
        String trimmed  = original.trim();
        System.out.println(trimmed);
    }
}
