package lang.string.test;

public class TestString5 {
    //Q. str에는 파일의 이름과 확장자가 주어진다. ext에는 파일의 확장자가 주어진다.
    //파일명과 확장자를 분리해서 출력하라.
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext); //.txt가 먼저 나타나는 인덱스 값 반환

        String fileName = str.substring(0,extIndex);
        String extName = str.substring(extIndex);
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
