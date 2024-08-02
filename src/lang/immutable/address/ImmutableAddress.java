package lang.immutable.address;

//불변 클래스
public class ImmutableAddress {
    //final로 선언 -> 생성자로 값 설정했다면 , 이후에 값 변경 불가
    private final String value;

    //기본 생성자
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    //가변객체와는 다르게 setValue메서드 생성 불가 -> final로 변수 선언했기 때문
   /* public String setValue(){
        this.value = value;
    }*/

    //객체 정보 출력 메서드 toString()
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
