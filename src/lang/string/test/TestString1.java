package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        //Q. startsWith()를 사용해서 url이 https://로 시작하는지 확인하라.
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://"); //startsWith() -> 괄호 안에 단어로 시작하는지 확인하는 메서드
        System.out.println("result = " + result);
    }
}
