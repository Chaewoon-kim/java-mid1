package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교: " + (str1 == str2)); //x001 == x002 (false)
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("리터럴 == 비교: " + (str3 == str4)); //왜 true지?
        //리터럴끼리 비교할 때는 문자열 풀을 사용  , 이 때 같은 문자열이 있으면 인스턴스를 만들지 않음
        //따라서 str3과 str4는 같은 참조값을 가리키고 있음

        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
