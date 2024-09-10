package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade , int price){
        //기존에 있던 if문을 완전히 제거하고, 단순한 할인율 계산 로직만을 남겨놓음
        return price * classGrade.getDiscountPercent() / 100;
    }
}
