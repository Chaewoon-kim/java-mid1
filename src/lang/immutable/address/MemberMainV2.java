package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {


        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //멤버 A,B의 처음 주소는 모두 서울
        System.out.println("member A = " + memberA);
        System.out.println("member B = " + memberB);


        //회원 B의 주소를 부산으로 변경해야 함 (불변이기 때문에 setValue 불가능 , 새로운 객체 만들어서 주소 생성해야함)
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.addresss");
        System.out.println("member A = " + memberA);
        System.out.println("member B = " + memberB);

    }
}
