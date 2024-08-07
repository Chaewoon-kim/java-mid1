package lang.string.test;

public class TestString9 {
    //Q. split()를 사용해 이메일의 ID 부분과 도메인 부분을 분리
    //split() -> 괄호 내용을 기준으로 분리 시킨다.
    public static void main(String[] args) {
        String email = "hello@example.com";

        String [] parts = email.split("@");
        String idPart = parts[0];
        String domainPart = parts[1];

        System.out.println("ID = " + idPart);
        System.out.println("Domain = " + domainPart);


    }
}
