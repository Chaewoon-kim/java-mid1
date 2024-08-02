package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다
        ImmutableAddress a = new ImmutableAddress("Seoul");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법 x
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("Busan"); value 값이 final이기 때문에 앞에서 a의 참조값을 받아왔기 때문에, 더는 변경할 수 없음
        b = new ImmutableAddress("부산"); //값을 변경하기 위해 [새로운 객체 생성]
        System.out.println("Busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //사이드 이펙트 -> 값을 변경할 때 발생. 이 때 불변 객체를 사용하면 사이트 이펙트 피할 수 있음
        //만약 불변 객체의 값을 변경하고 싶다면, 변경하고 싶은 값으로 새로운 불변 객체 생성
    }
}
