package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " +str1);
        System.out.println("str2 = " +str2);
        
        //String 클래스는 불변이기 때문에 값을 변경하고 싶다면 새로운 인스턴스를 생성해 반환해서 사용해야 함
    }
}
