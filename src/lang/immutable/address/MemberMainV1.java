package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A" , address);
        MemberV1 memberB = new MemberV1("회원B" , address);

        //회원 A,B의 처음 주소는 모두 서울
        System.out.println("member A = " + memberA);
        System.out.println("member B = " + memberB);

        //회원 B의 주소를 부산으로 변경
        memberB.getAddress().setValue("부산");
        /*Address address1 = memberB.getAddress();
        address1.setValue("부산");*/
        System.out.println("부산 -> memberB.address");
        System.out.println("member A = " + memberA);
        System.out.println("member B = " + memberB);
        //B만 주소를 변경하려 했는데 A도 같이 변경 됨 -> 같은 인스턴스를 참조하고 있기 때문.




    }
}
