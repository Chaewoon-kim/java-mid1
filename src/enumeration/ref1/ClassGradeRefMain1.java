package enumeration.ref1;

public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //단순히 if문을 사용할 필요 없이 등급안에 있는 getDiscountPercent() 메서드를 호출
        //인수로 넘어온 회원 등급의 할인율을 바로 구할 수 있음
        int basic = discountService.discount(ClassGrade.BASIC , price);
        int gold = discountService.discount(ClassGrade.GOLD , price);
        int diamond = discountService.discount(ClassGrade.DIAMOND , price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
