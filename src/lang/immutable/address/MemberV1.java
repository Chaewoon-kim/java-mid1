package lang.immutable.address;
//변경 가능한 클래스
public class MemberV1 {
    private String name;
    private Address address;

    //기본생성자
    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //주소불러오기
    public Address getAddress() {
        return address;
    }

    //새로운 주소 설정
    public void setAddress(Address address) {
        this.address = address;
    }

    //객체의 기본 정보를 제공하는 toString()메서드 재정의
    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

