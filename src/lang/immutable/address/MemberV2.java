package lang.immutable.address;
//불변 클래스 사용
public class MemberV2 {
    private String name;
    private ImmutableAddress address;

    //기본생성자
    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    //주소 불러오는 기능
    public ImmutableAddress getAddress() {
        return address;
    }

    //주소 설정 메서드
    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    //toString() 메서드 오버라이딩
    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
