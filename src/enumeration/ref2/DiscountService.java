package enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade , int price){
        return price * grade.getDiscountPercent() / 100;
        //역시 기존에 있던 if문이 완전히 제거되고, 단순한 할인율 계산 로직만이 남아있음
    }
}
