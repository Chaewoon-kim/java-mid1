package enumeration.ref3;
public class DiscountService {
    public int discount(Grade grade , int price){
        //이제 할인율 계산은 Grade가 스스로 처리하기 때문에 discount()메서드는
        //단순히 grade.discount()를 호출하기만 하면 된다.
        return grade.discount(price);
    }
}
