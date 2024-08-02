package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다
        Address a = new Address("Seoul"); //x001
        Address b = new Address("Seoul"); //x002
        //같은 value 지만 서로 다른 참조값을 지니고 있기 때문에 동시에 변경되지 않음

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("Busan"); //b의 값을 부산으로 변경
        System.out.println("Busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
