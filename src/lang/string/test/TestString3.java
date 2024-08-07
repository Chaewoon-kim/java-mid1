package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {
        //Q. str 에서 문자열 .txt가 몇 번째에서부터 시작하는지 위치를 찾아 출력.
        String str = "hello.txt";
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);
    }
}
