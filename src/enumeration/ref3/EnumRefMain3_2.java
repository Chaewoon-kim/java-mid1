package enumeration.ref3;

public class EnumRefMain3_2 {
    //Grade가 스스로 할인율을 계산하기 때문에 더는 DiscountService 클래스가 필요 없어짐
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
