package lang.string.test;

public class TestString8 {
    //Q. replace()를 사용해 java라는 단어를 jvm으로 변경
    // replace(변경하려는 단어 , 변경할 단어)
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        String output = input.replace("java" , "jvm");
        System.out.println(output);

    }
}
