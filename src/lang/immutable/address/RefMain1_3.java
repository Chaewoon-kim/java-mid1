package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        //참조값의 공유를 막을 수 있는 방법이 없다.
        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //change() 메서드 호출
        change(b,"부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //단순히 개발자가 공유 참조 문제가 발생하지 않도록 조심해서 코드 작성?
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
