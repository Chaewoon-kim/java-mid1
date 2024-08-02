package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다
        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("Busan"); //b의 값을 부산으로 변경
        System.out.println("Busan -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);
        //a도 부산으로 바뀐 이유는? 두 변수가 같은 참조값을 갖고 있기 때문.
    }
}
