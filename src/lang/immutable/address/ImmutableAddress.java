package lang.immutable.address;

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

    //객체 정보 출력 메서드 toString()
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
