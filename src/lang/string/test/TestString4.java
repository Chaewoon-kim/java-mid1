package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        //Q. substring()을 사용해 hello 부분과 .txt부분을 분리해라.
        String str = "hello.txt";
        String fileName = str.substring(0,5);
        String extName  = str.substring(5,9);
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
