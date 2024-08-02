package lang.immutable.address;

public class Address {
    private String value;

    //기본 생성자
    public Address(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    //값 변경 메서드
    public void setValue(String value) {
        this.value = value;
    }

    //객체 정보 출력 메서드 toString()
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
